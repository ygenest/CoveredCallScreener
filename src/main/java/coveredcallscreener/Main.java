/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coveredcallscreener;

import coveredcallscreener.converters.GoogleConverter;
import coveredcallscreener.domain.OptionQuote;
import coveredcallscreener.domain.StockQuote;
import coveredcallscreener.domain.json.option.Expiration;
import coveredcallscreener.domain.json.option.GoogleOptionsJson;
import coveredcallscreener.domain.json.stock.GoogleStockJson;
import coveredcallscreener.filters.CallOptionsFilter;
import coveredcallscreener.readers.GoogleStockReader;
import coveredcallscreener.readers.TsxOptionsReader;
import coveredcallscreener.writers.CsvWriter;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yves
 */
public class Main {

	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		LOGGER.setLevel(Level.WARNING);
		System.out.println("Processisng...");
		boolean invalidArg = false;
		boolean putOption = false;
		boolean unique = false;
		boolean fondamOnly = false;

		String fname = null;
		for (int i = 0; i < args.length; i++) {
			if (args[i].startsWith("-")) {
				switch (args[i].charAt(1)) {
				case 'd':
					LOGGER.setLevel(Level.INFO);
					LOGGER.log(Level.INFO, "In debugging mode");
					break;
				case 'e':
					CallOptionsFilter.setExpMonth(args[i].toString().substring(2));
					break;

				case 'z':
					CallOptionsFilter.setNoZeroInterest(true);
					break;
				case 'f':
					fondamOnly = true;
					LOGGER.log(Level.INFO, "In fondamentals only mode");
					break;
				case 'p':
					putOption = true;
					break;
				case 's':
					CallOptionsFilter.setNoStrikeBelowCurrent(true);
					break;
				case 'u':
					unique = true;
					break;
				default:
					invalidArg = true;
				}
			} else {
				fname = args[i];
			}
		}
		if (fname == null || invalidArg) {
			System.out.println("USAGE stockscreener <options> <source file>");
			System.out.println("Where possible options include");
			System.out.println("\t-d\tActivate debug mode");
			System.out.println("\t-f\tFondamentals only no option");
			System.out.println("\t-s\tignore share price above strike price");
			System.out.println("\t-z\tignore zero open interest quotes");
			System.out.println("\t-p\tshow put options quotes");
			System.out.println("\t-e\tShow only options for expiry date YYYYMM");
			System.out.println("\t-u\tShow only one option. Should be used with -s");
			return;
		}
		File file = new File(fname.replace(".txt", ".csv"));

			try {
				org.apache.commons.io.FileUtils.forceDelete(file);
			} 
			catch (FileNotFoundException e){
				// do nothing, continue
			}
			catch (IOException e1) {
				System.out.println("The file "+file.getName()+" is opened. Close it before running");
				return;
			}

		// load all symbols from file
		List<String> symbols = loadData(fname);
		GoogleStockReader googleStockReader = new GoogleStockReader();
		TsxOptionsReader tsxOptionsReader = new TsxOptionsReader(putOption);
		GoogleConverter googleConverter = new GoogleConverter();
		GoogleStockJson googleStockJson;
		List<StockQuote> stockQuotes = new ArrayList<StockQuote>();
		int nbLine = 0;
		// for each symbol in file
		for (String symbol : symbols) {
			symbol = symbol.toUpperCase();
			StockQuote stockQuote = null;
			if (symbol.endsWith(".TO")) {
				// process symbols for TSX exchange
				googleStockJson = googleStockReader.readStockQuote("TSE:" + symbol.replace(".TO", ""));
				if (googleStockJson==null) {
					System.out.println("Skipping unknown CND symbol " + symbol);
					continue;
				}
				stockQuote = googleConverter.convertStock(googleStockJson);
				stockQuote.setSymbol(googleStockJson.getSymbol() + ":" + googleStockJson.getExchange());
				if (!fondamOnly) {
					List<OptionQuote> optionQuotes = tsxOptionsReader.readOptionQuote(symbol.replace(".TO", ""));
					if (optionQuotes == null) {
						System.out.println("No option defined for TSX symbol " + symbol);
						continue;
					} else {
						nbLine += addOptionQuote(optionQuotes, stockQuote, putOption);
					}
				}

			} else {
				// process symbols for US exchanges
				googleStockJson = googleStockReader.readStockQuote(symbol);
				if (googleStockJson == null) {
					System.out.println("Skipping unknown US symbol " + symbol);
					continue;
				}
				stockQuote = googleConverter.convertStock(googleStockJson);
				if (!fondamOnly) {
					List<Expiration> expirations = googleStockReader.readOptionExpiration(symbol);
					if (expirations == null) {
						System.out.println("No option defined for US symbol " + symbol);
						continue;
					}
					for (Expiration expiration : expirations) {
						GoogleOptionsJson googleOptionsJson = googleStockReader.readOptionQuote(symbol, expiration);
						List<OptionQuote> optionQuotes = googleConverter.convertOption(googleOptionsJson, expiration);
						nbLine += addOptionQuote(optionQuotes, stockQuote, putOption);

					}

				}
			}

			stockQuotes.add(stockQuote);
		}
		CsvWriter csvWriter = new CsvWriter();
		ByteArrayOutputStream out = csvWriter.write(stockQuotes, unique,fondamOnly);
		try {
			OutputStream outputStream = new FileOutputStream(file);
			try {
				out.writeTo(outputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (!fondamOnly) { 
			System.out.println(nbLine + " option quotes written to file " + file.getName());
		} else
		{
			System.out.println(stockQuotes.size() + " fundamentals quotes written to file " + file.getName());
		}
	}

	private static int addOptionQuote(List<OptionQuote> optionQuotes, StockQuote stockQuote, boolean putOption) {
		int count = 0;
		for (OptionQuote optionQuote : optionQuotes) {
			optionQuote.setStockPrice(stockQuote.getLast());
			if (CallOptionsFilter.filter(optionQuote, putOption)) {
				stockQuote.getOptionQuotes().add(optionQuote);
				count++;
			}
		}
		return count;
	}

	private static List<String> loadData(String fname) {
		List<String> symbols = new ArrayList<String>();
		File file = new File(fname);
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);

			String line = br.readLine();
			while (line != null) {
				if (!line.isEmpty() && !line.startsWith("#")) {
					symbols.add(line);
				}
				line = br.readLine();
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File not found " + fname);
			return null;
		} catch (IOException ex) {
			System.out.println("Problem reading file " + fname);
		}
		return symbols;
	}
}

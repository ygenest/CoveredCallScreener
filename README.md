CoveredCallScreener
===================

This is a Java programm that screen call options for maximizing return.

A call option on a stock is the right to sell the stock at a strike price on a specific date (normally the third saturday og a given month) for a prenium
This programm will calculate the return of the prenium and the return of the capital gain if the stock is called away.

The input is a text file (.txt extension is required) with one symbol per line. Canadian symbols must have the .TO suffix

Usage: java -jar CoveredCallScreener.jar <file>.txt <options>
where options are:
  -z do not show zero open interest options
  -s do not show strike price below current market price
  
The output will a comma delimited file with the same name but with the .csv extension

The programm can process US and Canadian options. Here is an example of the output (executed on nov. 26 2014):

    Symbol  Name                Expiry Date     Stock Price Strike  Bid     Ask     Last    Volume  Open Int    Yield Opt   Yield Cap Gain  Div Yield	
    F       Ford Motor Company  2016-01-15      15.65       17      0.97    1.01    1       10      117088      6.3         8.6             3.2
...

From the example we can see that if you sell a covered call option (you have to own the stock) you will get 1$ (for a yield of 6.3%) per share for
giving the right to a buyer to buy your stock at 17$ on jan 15 2016. If the stock at that date is over 18$ (1$ + 17$) you
will have to sell the stock at 17$ and pocket a profit of 1.35$ (for a yield of capital gain of 8.6%). Ford also pays a 3.2%
dividend that you will collect along the way.

Once you open the csv file in a spreadsheet, you can easily sort columns to identify the best deals.
Developed with Netbeans



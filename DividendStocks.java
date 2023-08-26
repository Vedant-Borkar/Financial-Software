 class DividendStocks extends Stocks
 {
  double dividends;

  public DividendStocks(String symbol, double currentPrice) {
   super(symbol, currentPrice);
   dividends=0.0;
  }
  //records  a dividend of the given amount per share
  public void payDividend(double amountPerShare)
  {
   dividends= amountPerShare*getTotalShares();
  }


  public double getProfit() {
   return super.getProfit();
  }

  @Override
  public double getMarketValue() {
   return super.getMarketValue() + dividends;


  }
 }

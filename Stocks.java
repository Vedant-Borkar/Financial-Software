public class Stocks extends ShareAsset//implements Assets removed because abstract methods of market value
        //and get profit and created in share asset which implements asset soo implement is no longer needed
{
    //It has a current market value and it makes a profit does not have constant value
    public int totalShares;


    public Stocks(String symbol, double currentPrice) {
        super(symbol, currentPrice);
            totalShares=5;
    }

    @Override
    public double getMarketValue() {
        return totalShares*getCurrentPrice();
    }
    /** @Override
    public double getProfit() {
    return getMarketValue()-getTotalCost();
    }
     **///done because share asset will now calculate the getProfit
    public int getTotalShares()
    {
        return totalShares;
    }
    //records purchase per share of the given stock at the given price per share
    public void purchase(int share, double pricePerShare)
    {
        totalShares += share;
        addCost(share*pricePerShare);

    }



}

public class MutualFunds extends ShareAsset //implements Assets removed because abstract methods of market value
    //and get profit and created in share asset which implements asset soo implement is no longer needed
{
    double totalShares;

    public MutualFunds(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShares=5;
    }

    @Override
    public double getMarketValue() {
        return totalShares*getCurrentPrice();
    }

    public double getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(double totalShares) {
        this.totalShares = totalShares;
    }

    /** @Override
    public double getProfit() {
        return getMarketValue()-getTotalCost();
    }
    **///done because share asset will now calculate the getProfit
    //records purchase of the given shares at the given price
    public void purchase(double share, double pricePerShare)
    {
        totalShares += share;
        addCost(share*pricePerShare);
    }

}

public abstract class ShareAsset implements Assets
{
    //WE MAKE THIS CLASS AS ABSTRACT IN ORDER TO PREVENT THE USER FROM CREATING
    //AN OBJECT OF IT AND ALSO THAT SHAREASSET IS JUST A CONCEPT OF SHARES BETWEEN
    // OTHER CLASSES AND NOT AN ACTUAL CLASS or ASSET
    //Every aspect based on Shares is here

    String symbol;//Which stock it is
    double totalCost;
    double currentPrice;

    public ShareAsset(String symbol,  double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalCost=0.0;
    }

    //adds cost to a given amount to this asset
    public void addCost(double cost)
    {
        totalCost+= cost;
    }

    //returns a price per share of this asset
    public double getCurrentPrice()
    {
        return currentPrice;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    //returns the current market value of this asset
    public abstract double getMarketValue();
    //returns the profit earned on the shares of this asset
    public double getProfit()
    {   //calls the abstract MarketValue
        return getMarketValue()-totalCost;
    }

}

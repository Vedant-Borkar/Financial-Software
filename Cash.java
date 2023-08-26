public class Cash implements Assets
{
    //The value of cash remains constant
    double amount;
    public Cash(double amount)
    {
        this.amount=amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double getMarketValue() {
        return amount;//Because the market value is the fixed amt of cash u have
    }

    @Override
    public double getProfit() {
        return 0;//Cash has a constant value
    }
}
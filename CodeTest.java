import java.util.Scanner;
class CodeTest
{
    public static void main(String args[])
    {
        //Case Study: Financial System
        //DividendStocks is a Stock
        //Use Interface to getMarketValue and getProfit because they vary for each


        //What are the similarities btw Stocks and MutualFunds??
        //both store assests based on shares
        //But mutual funds are integer no.s but stocks are not
        //we need another class KNOWN AS SHARES as they depend on shares
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Company name and Current Price");
        String cmp=sc.next();
        int cp=sc.nextInt();
        Assets assets1=new MutualFunds(cmp,cp);
        Assets assets2=new Stocks("Apple",500);
        Assets assets3=new DividendStocks("Google",200);
        Assets assets4=new Cash(50000);
        
        System.out.println(assets1.getMarketValue());
        System.out.println(assets2.getMarketValue());



    }
}
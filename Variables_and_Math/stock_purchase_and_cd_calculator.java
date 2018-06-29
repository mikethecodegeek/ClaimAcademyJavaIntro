package Variables_and_Math;

public class stock_purchase_and_cd_calculator {
	
//	You are feeling lucky with a stock and want to go all in! 
//	You have $25,000 in savings and want to invest all your money to buy 
//	a stock, and the remaining money in a CD account. 
//	The stock price is $989 per share. 
//	How many shares of this stock can you buy, 
//	and how much money will be left for the CD account?
	
	public static void main (String[] args) {
		
		double savings = 25000;
		double stockPrice = 989;
		int numStocks = (int) (savings/stockPrice);
		double remainder = savings%stockPrice;
		
		System.out.println("Buy " + numStocks + " shares of stock ");
		System.out.println("Invest " + remainder + " into account");
		
	}
	
	

}

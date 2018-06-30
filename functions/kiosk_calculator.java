package functions;



public class kiosk_calculator {
	
	// A retail store is building a kiosk to enter sales and 
	// handle transactions. When people use cash to pay for an item, 
	// the kiosk needs to tell the cashier how much change should be 
	// given back to the customer. 
	// You are developing a simple calculator that will compute the 
	// right amount and most efficient denominations of change for a 
	// specific purchase. 
	
	// returnChange(18, 17.18)
	// RESULT:    Quarters: 3   Dimes: 0   Nickels: 1   Pennies: 2
	
	public static void main (String[] args) {

		String change = returnChange(18, 17.18);
		
		System.out.println(change);
		
		
	}
	
	public static double getDueChange(double price, double cash) {
		return price - cash;
	}
	
	public static int getNumQuarters(double price) {
		double numQuarters = price / .25;
		int q = (int) numQuarters;
		return q;	
	}
	
	public static int getNumChange(double price, double currency) {
		double numChange = price / currency;
		int c = (int) numChange;
		return c;	
	}
	
	public static int getNumDimes(double price) {
		double numDimes = price / .10;
		int d = (int) numDimes;
		return d;	
	}
	
	public static int getNumNickels(double price) {
		double numNickels = price / .05;
		int n = (int) numNickels;
		return n;	
	}
	
	public static int getNumPennies(double price) {
		double numPennies = price / .01;
		int p = (int) numPennies;
		return p;	
	}
	
	public static String returnChange(double price, double cash) {
		double change = getDueChange(price,cash);
		
		int quarters = getNumChange(change, .25);
		double remainingChange = change - (quarters * .25);
	
		int dimes = getNumChange(remainingChange, .10);
		remainingChange = remainingChange - (dimes * .10);

		int nickels = getNumChange(remainingChange, .05);
		remainingChange = remainingChange - (nickels * .05);
		
		int pennies = getNumChange(remainingChange, .01);
	
		
		return "Quarters:" + quarters + " Dimes:" + dimes + " Nickels: " + nickels + " Pennies " + pennies;
	}

}

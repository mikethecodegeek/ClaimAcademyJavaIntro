package functions;

public class savings_calculator {
	
	// Write a function that returns the anticipated future value 
	// based on an account’s present value, interest rate, and time. 
	// The formulae for simple future value is 
	// FV = PV * [1 + (rate x time) ] 
	// (Note that rate is given in %; you will need to covert to the decimal).
	
	// savings(20000, 4.5, 15)
	// RESULT:    33500
	
	public static void main (String[] args) {
			
			System.out.println(calculateSavings(20000, 4.5, 15));
	
	}
	
	public static double calculateSavings (int pv, double rate, int time) {
		double rateDecimal = rate /100;
		double fv = pv * (1 + (rateDecimal * time));
		return fv;
	}
}

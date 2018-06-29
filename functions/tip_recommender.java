package functions;

public class tip_recommender {
	
	// Write a function that returns the recommended tip based on 
	// the amount of the tab and the service performed. 
	// Use the following table to calculate the tip: 
	// Service Quality  Tip Percent 
	// Poor    16% Good   22% Great   26% 
	
	// computeTip(33.57, "Great")
	// RESULT:    8.7282
	
	public static void main (String[] args) {
		
		System.out.println(computeTip(33.57, "Great"));

	}

	public static double computeTip (double tab, String service) {
		return (tab * getTipPercentage(service))/100;
	}
	
	
	public static int getTipPercentage(String service) {
		int tipPercent;
		
		if (service == "Great") {
			tipPercent = 26;
		} else if (service == "Good") {
			tipPercent = 22;
		} else {
			tipPercent = 16;
		}
		
		return tipPercent;
	}

}

package Variables_Exercise_Set;

public class price_comparison {

//	Create an application that compares prices of a specific item. 
//	Use appropriate variables for: Item, Price, Competitor 1 Name 
//	and Price, Competitor 2 Name and Price. 
//	*Bonus: Output a message show the amount of savings against the competitor price
	
	public static void main (String[] args) {
			
			String item = "Laptop";
			int price = 499;
			String competitorOneName = "Best Buy";
			int competitorOnePrice = 579;
			String competitorTwoName =  "Amazon";
			int competitorTwoPrice = 529;
			int competitorOneSavings = competitorOnePrice - price;
			int competitorTwoSavings = competitorTwoPrice = price;
			
					
			System.out.println("Comparing prices for " + item);
			System.out.println("Our Store: $" + price);
			System.out.println(competitorOneName + ": $" + competitorOnePrice);
			System.out.println("Save: $" + competitorOneSavings);
			System.out.println(competitorTwoName + ": $" + competitorTwoPrice);
			System.out.println("Save: $" + competitorTwoSavings);
			
		}
}

package Conditional_Logic;

import java.util.Scanner;

public class positive_or_negative_number {
	
	public static void main (String[] args) {
//		Write an IF statement to determine if a number is positive or negative. 
//		INPUT:     -7 
//		RESULT:    Negative
		
		System.out.print("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();
	    
	    if (i < 0) {
	    	System.out.println("Negative");
	    } else if (i > 0) {
	    	System.out.println("Positive");
	    } else {
	    	System.out.println("Zero");
	    } 
	    
	    sc.close();
	}

}



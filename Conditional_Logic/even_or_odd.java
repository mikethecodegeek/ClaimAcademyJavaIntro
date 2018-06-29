package Conditional_Logic;

import java.util.Scanner;

public class even_or_odd {
	
	public static void main (String[] args) {
	//	Write an IF statement to determine if a number is even or odd. 
	//  INPUT:     242 
	//  RESULT:    Even 
		
		System.out.print("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();
	    
	    if (i == 0) {
	    	System.out.println("Zero");
	    } else if (i % 2 == 0) {
	    	System.out.println("Even");
	    } else  {
	    	System.out.println("Odd");
	    } 
	    
	    sc.close();
	}

}

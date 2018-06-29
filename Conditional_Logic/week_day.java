package Conditional_Logic;

import java.util.Scanner;

public class week_day {
	
	// Convert a numeric day of the week to the weekday, 
	// with the first day of the week being Sunday 
	// Make a provision for an invalid weekday number. 
	// INPUT:     5 
	// RESULT:    Thursday 

	public static void main (String[] args) {
		
		System.out.print("Please enter day of week: ");
		Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();
	    
	    String[] days = { "Not a valid day", "Sunday","Monday","Tuesday","Wednesday", "Thursday", 
	    		"Friday", "Saturday" };
	     
	    if (i > days.length || i < 0) {
	    	System.out.println("Not a valid day");
	    } else {	    	
	    	System.out.println(days[i]);
	    }
	    
	    sc.close();
	}
}

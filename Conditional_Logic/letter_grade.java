package Conditional_Logic;

import java.util.Scanner;

public class letter_grade {
	
	// Letter GradeConvert a numeric grade to a letter grade. 
	// Use the following scale: 
	// A 90 - 100% B 80 - 99% C 72 - 79% D 64 - 71% F 0 - 71%
	// Make a provision for an invalid numeric grade 
	
	// INPUT:     76 
	// RESULT:    C
	
	public static void main (String[] args) {
		
			System.out.print("Please enter grade: ");
			Scanner sc = new Scanner(System.in);
		    int i = sc.nextInt();
		    
		    if (i > 89 && i < 101) {
		    	System.out.println("A");
		    } else if (i > 79 && i < 90) {
		    	System.out.println("B");
		    } else if (i > 71 && i < 80) {
		    	System.out.println("C");
		    } else if (i > 63 && i < 72) {
		    	System.out.println("D");
		    } else if (i >= 0 && i < 64) {
		    	System.out.println("F");
		    } else  {
		    	System.out.println("Invalid grade");
		    } 
		    
		    sc.close();
		}

}

package day6Project;

import java.util.Iterator;

public class LabAssignment2 {


	public static void main(String[] args) {

		// Factorial
		int fact = 1;
//		String strFact= " ";
		for (int i = 1; i <= 5; i++) {

			fact = i * fact;

//			 strFact = string(fact);

		}

		System.out.println("Factorial of 5 i.e. 5! = " + fact);

		// Write a java program to find the even
//		and odd sum of the natural number between 1 to 10 by using conditional statement?

		int even = 0, odd = 0;

		System.out.println("The Natural number 1-10 are: ");

		for (int j = 1; j <= 10; j++) {

			System.out.print(j+" ");

			int num = j % 2;

			if (num == 0) {
				even = j + even;
//				System.out.println("is even" + j);
			} else {
				odd = j + odd;
//				System.out.println("is odd" + j);
			}
		}
		System.out.println("\n========================================");


		System.out.println("sum of even: " + even);
		System.out.println("========================================");
		System.out.println("sum of odd: " + odd);
		System.out.println("========================================");


		////////////// print right angle triangle

//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
//		* * * * * * 
//		* * * * * * * 
//		* * * * * * * * 
//		* * * * * * * * * 
//		* * * * * * * * * * 
		System.out.println("tringle facing right side");

		
		 int rows = 5; // Number of rows in the triangle 
	        
	        // Outer loop to iterate through rows
	        for (int i = 1; i <= rows; i++) { //runs till the number of rows
	            // Inner loop to print the stars
	            for (int j = 1; j <= i; j++) { //runs till the value of i passed by outer loop
	                System.out.print("* ");  //<-- inner loop determine the number of * in each row
	            }
	            
	            // Move to the next line
	            System.out.println();
	        }		 
	        
			System.out.println("========================================");

//		Q.4 Write a java Program to print the Left Triangle Star Pattern?

//			*
//		   **
//		  ***
//		 ****
//		*****

		System.out.println("tringle facing left side");
		
		 rows = 5; // Number of rows in the upside-down inverted triangle

        // Outer loop to iterate through rows in reverse order
        for (int i = rows; i >= 1; i--) {
            // Inner loop to print spaces
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            // Inner loop to print stars
            for (int k = i; k <= rows; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
        
		System.out.println("========================================");

		System.out.println("Flag of NEPAL");
		

        rows = 10; // Number of rows in the triangle
        for(int k =0; k<=1; k++){
        // Outer loop to iterate through rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print the stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Move to the next line
            System.out.println();
        }		 
        }
        
		System.out.println("========================================");


	}

}

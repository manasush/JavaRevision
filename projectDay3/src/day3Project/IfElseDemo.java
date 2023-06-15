package day3Project;

import java.util.Scanner;  // Import the Scanner class


public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Declaration of string 
		String name = "Sushan";
		
		if (name=="Sushan") {
			
			System.out.println("My name is Sushan");
		} else {
			
			System.out.println("My name is not Sushan");
		}
		
		
		
//		
//		Pass/fail if-else
		
		int marks =74;
		
		if(marks<30) {
			System.out.println("fail!");
			
		}  else {
		
			System.out.println("pass!");
		}
		
		///// pass/fails and division
		//<30 fail
		//>30 and <60 second division
		//>60 and <80 First Division
		//else distinction
		
		System.out.println("-------------------------");

		
		
		System.out.println("welcome to Division Checker!!");
		
		
		
		Scanner percent = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter your percentage");
		
	    String division = percent.nextLine();  // Read user input
	    System.out.println("your Division for " + division + "% is: ");  // Output user input
		
		marks = Integer.parseInt(division);
		
		if(marks <30) {
			System.out.println("fail!");
			
		}  else if (marks>30 && marks<60) {
		
			System.out.println("Second Division!");
			
		} else if (marks>60 && marks<80) {
		
			System.out.println("First Division!");
			
		}else {
		
			System.out.println("Distinction!");
			}
	
	}
	
	
	
	

}

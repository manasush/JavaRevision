package day4Project;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO 

//write a program in Java to calculate simple
//		and compound interest where 
//		principle=200; 
//		rate of interest = 2%;
//		tenure=3 years
//				
		
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in decimal): ");
        double interestRate = scanner.nextDouble();

        int compoundingPeriods = 1;

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double amount = calculateCompoundInterest(principal, interestRate, compoundingPeriods, years);

       double ci = amount - principal;
        
        //simple Interest
        double simpleInterest = ((principal * years * interestRate) / 100 );
        
        System.out.println("Simple Interest = " + simpleInterest);
        
        System.out.println("compound interest = " + ci);
        
        System.out.println("The amount after " + years + " years is: " + amount);
        
        
        //p ( 1+r/100)^n r= rate of interest, n  tenure/time, p = principal
        //ci = Amount - principal
    }

    public static double calculateCompoundInterest(double principal, double interestRate, int compoundingPeriods, int years) {
        
    	double ratePerPeriod = interestRate / compoundingPeriods;
        int totalPeriods = compoundingPeriods * years;
        double amount = principal * Math.pow(1 + ratePerPeriod, totalPeriods);
        return amount;
    }
}
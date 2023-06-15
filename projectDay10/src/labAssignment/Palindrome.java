package labAssignment;


//Q2. Write a java Program to Show the number is palindrome or not??



//algorithm

/*Use a number to check palindrom let it be 121 
 * the palindrome should be 121 . to check if it is palindrome we need to reverse the number from back
 * so last number = num%10
 * 
 * 





*/
public class Palindrome {

	public static void main(String[] args) {
		  int number = 12322; // Number to check
		  int originalNumber = number;
	        int reverse = 0;

	        while (number != 0) { //till  empty
	            int digit = number % 10; //get last  digit let number = 121==> digit=1
	          
	            reverse = (reverse * 10) + digit; //last digit to reverse: 0*10+1 =1
	            
	            number /= 10; //erase the digit from behind from 121 removes 1. number = 12
	            
	        }
	        
		  

	        if (originalNumber == reverse) {
	            System.out.println(originalNumber + " is a palindrome.");
	        } else {
	            System.out.println(originalNumber + " is not a palindrome.");
	        }
	    }

	   

}

package day7Project;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hi();
		
		System.out.println("Goodmorning!");
		
		evenOdd(27);
		
		 System.out.println("Sum of two numbers is: " + sum(2,3)); 
		 
		 System.out.println("Sum of two numbers is: " + sum(10,20)); 

	}
	
	public static void hi() {
		
		System.out.println("Hi!");
	}
	
	//Method that checks the even odd
	public  static void evenOdd(int num) {
		
		int check = num%2;
		
		if (check == 0) {
		
		System.out.println("The number " + num + " is even" );
		
		} else {
			
		System.out.println("The number " + num + " is Odd"  );
		}
		
	}
	
	static int sum (int a, int b) { 
		
		int result = a+b;
		return result;
	}

}

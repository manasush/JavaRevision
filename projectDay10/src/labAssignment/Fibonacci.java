package labAssignment;

public class Fibonacci {

	
	
	//Q.1 Write a java Program to print the Fibonacci Series?
	
	
	
	public static void main(String[] args) {
		int n = 10; // prints first 10 fibonacci
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");
        System.out.print(first + " " + second + " ");
        
        //prints 0, 1

        for (int i = 3; i <= n; i++) {//3 to 10 as we already printed first 2
            int next = first + second; // sum first and second
            System.out.print(next + " ");

            first = second; //add second value to first
            
            second = next; //cast next value to second
	}

}
}

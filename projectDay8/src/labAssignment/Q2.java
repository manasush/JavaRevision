package labAssignment;
import java.util.Arrays;


 class Q2 {
	    public static void main(String[] args) {
	        int[] numbers = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
	        //prints the above array
	        System.out.println("Original Array:");
	        System.out.println(Arrays.toString(numbers));

	        int[] separatedArray = separateEvenOdd(numbers);
	        //Prints the separated array ( even then odd
	        System.out.println("Array after separation:");
	        System.out.println(Arrays.toString(separatedArray));
	    }

	    //method to separate the even odd and add the even from front & odd from back in the SeparatedArray[] 
	    public static int[] separateEvenOdd(int[] numbers) {
	        //stores even number in SeparatedArray[] from front
	    	int evenIndex = 0;
	        //stores even number in SeparatedArray[] from back

	        int oddIndex = numbers.length - 1;
	        
	        //instantiated the array with its previous array size
	        int[] separatedArray = new int[numbers.length];
	        
	        //for number in numbers 
	        for (int number : numbers) {
	        	//checks even. if even add it to seperatedArray[
	            if (number % 2 == 0) {
	                separatedArray[evenIndex] = number;
	                evenIndex++; //increase the index to add new even on next index from front
	                
	            } else {
	            	//
	                separatedArray[oddIndex] = number;
	                oddIndex--; //decresed index to add new odd number from back
	            }
	        }

	        return separatedArray;
	    }
	}
package labAssignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



//Find the common elements between 2 arrays. store it in new array and print it


//we need method to check if the two elements are common element



public class Q1 {
    public static void main(String[] args) {
    	
    	
    	//initializing two arrays with its values
    	int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        
        //The findCommonElements method is called, passing array1 and array2 as arguments. 
        //This method is responsible for finding the common elements between the two arrays.
        int[] commonElements = findCommonElements(array1, array2);

        System.out.println("Common elements: " + Arrays.toString(commonElements)); //prints common elements 
    }

    
    //Method to find the common elements between array1 and array2
    public static int[] findCommonElements(int[] array1, int[] array2) {
    	
    	//initializing linked list
        List<Integer> commonElementsList = new ArrayList<>();

        //for elements in array1 add the elements only if each element in array1 = array2 element
        for (int element : array1) {
            if (containsElement(array2, element)) { //containsElement is called here to check array2 element = array1 
                commonElementsList.add(element);
                
            }
        }
        
        

        int[] commonElements = new int[commonElementsList.size()];//Array commonElements is initialized
        for (int i = 0; i < commonElementsList.size(); i++) {
            commonElements[i] = commonElementsList.get(i);
        }

        return commonElements;
    }
    //This method is the helping method to find if array contains common elements
    public static boolean containsElement(int[] array, int element) {
        
    	//for each value in array
    	for (int value : array) {
    		//if the value is equals to element then returns true
            if (value == element) {
                return true;
            }
        }
    	//returns false if the value is not equal
        return false;
    }
}

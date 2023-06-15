package labAssignment;
//class to take an array find smallest and second smallest number in the array and print it
public class Q3 {
    public static void main(String[] args) {
    	
    	
        int[] numbers = {5, 9, 2, 11, 3, 7, 1, 8, 4, 6};

        int smallest = findSmallest(numbers);
        int secondSmallest = findSecondSmallest(numbers);

        System.out.println("Smallest element: " + smallest);
        System.out.println("Second smallest element: " + secondSmallest);
    }

    public static int findSmallest(int[] numbers) {
        int smallest = Integer.MAX_VALUE; //takes largest possible integer value

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }

        return smallest;
    }

    public static int findSecondSmallest(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) {
                secondSmallest = number;
            }
        }

        return secondSmallest;
    }
}

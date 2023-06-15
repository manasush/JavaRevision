package labAssignment3;

public class Question2 {
	//Minimum and Maximum Value
	public static void main(String[] args) {
		
		int  a[] = {23, 92, 56, 39, 93};
		//initiated  min and max 
		//with first index value of array
		int min = a[0];
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			
			if(a[i]< min) {
				min = a[i];
			} else if (a[i]>max) {
				max = a[i];
			}
		}
		
		System.out.println("The minimum value in array is: "+ min);
		System.out.println("The maximum value in array is: "+ max);
		

	}

}

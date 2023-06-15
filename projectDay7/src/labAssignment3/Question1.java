package labAssignment3;

public class Question1 {
	
	
	//Average value in the array
	public static void main(String[] args) {
		
		int[] values = {20, 45, 60, 90,-55, -35, -60};
		double add= 0;
		for (int i = 0; i < values.length; i++) {

			
			 add = values[i] + add;
			 
		}
		
		double avgValue = add/values.length ;
		
		System.out.println("The Average Value is :" + (avgValue));
		

	}
	
	



}

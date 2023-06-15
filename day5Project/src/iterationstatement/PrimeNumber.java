package iterationstatement;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 1;
			
		
		for(int i =1; i<=500 ; i++ ) {
			
			int counter = 0; //counts the number
			
			for(int num= i; num >=1; num --) {  
				if (i%num == 0) { //if the number is divisible by number i and less than it
					counter = counter +1;
				}				
			}
			if (counter == 2) { // the two divisible numbers are 1 and itself
				
			System.out.println(i);
			}
			
			
			
			
		}
			
	}

}

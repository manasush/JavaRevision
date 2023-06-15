package iterationstatement;

public class ContinueStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 
		 for(int p=1;p<=10;p++) {
	            //iteration 3 and 5 will be terminated
	            //if (p==3 &&  p==5) { // we will never get such type of condition here
	            
	            if (p==3 ||  p==5) {
	            //It will escape iteration 3 & 5.
	                //Rest of the iterations work perfectly.
	            continue;    
	                
	            }
	            System.out.println("===="+p);
	            
	        }

	}

}

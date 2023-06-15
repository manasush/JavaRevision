package abstractMethod;

public class MainClass {

	public static void main(String[] args) {
		
//		cannot make object of abstract class
//		can only make reference
		
		Animal an;
				an = new Cow();
				
				an.walk();
				an.sleep();
			
		

	}

}

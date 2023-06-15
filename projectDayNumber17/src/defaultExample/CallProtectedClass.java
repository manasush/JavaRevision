package defaultExample;
import protectedExample.Fruit;

public class CallProtectedClass extends Fruit{
public static void main(String[] args) {
	

	Fruit ft = new Fruit();
	
		//ft.mango(); //cannot access it because the class from different package is protected
	
//	CallProtectedClass ft1 = new Fruit();
//					ft1.mango(); //only accessible in child class
//	
	
	
	CallProtectedClass ft2 = new CallProtectedClass();
					ft2.mango();
//					ft2.banana(); //cannot access private method from different package
					
					
				
	
					
					
}
}

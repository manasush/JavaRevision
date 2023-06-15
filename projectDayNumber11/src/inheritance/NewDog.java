package inheritance;

public class NewDog extends Dog{
	//NewDog2 extends Dog
	//Dog->NewDog
	//Dog-->newdog2
	
	
	
	//name ,color, behaviors  like run and walk
	
	//DRY: Do not repeat yourself/ Reuse==inherit
	
	
	//here NewDog is called child class  or subclass
	//Dog is called superclass or parent class
	
	//sub class can excess the attributes and 
//	behaviors or Superclass
	
	//However superclass cannot get access of subclass or child class
	//because inheritance is unidirectional
	
	
	public void Walk() {
		System.out.println("Dog can walk");
		
	}
	
	
	
	//Method overloading always takes place in child class
	//method name, typr, parameters etc shout be same
	
	//Method overloading
	public void sleep() {
		System.out.println("New Dog can sleep");
	}

	
	

}

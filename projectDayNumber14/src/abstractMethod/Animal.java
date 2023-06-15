package abstractMethod;

abstract public class Animal {
	
	int leg=4;
	int tail = 1;
	
	
	
	public void walk() {
		
		
		System.out.println("Animal can walk");
	}
	
	//cannot make abstract method private type
	public abstract void sleep();
	
	
	
	
	
	
	

}

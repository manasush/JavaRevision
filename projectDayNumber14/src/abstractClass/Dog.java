package abstractClass;



//class must be abstract for making any method abstract
public abstract class Dog {
	String name = "Tommy";
	String color = "White";
	
	
	public void run() {
		
		System.out.println("Dog cna run");
	}
	
	
	
	
	public void walk() {
		System.out.println("Dog cna walk");
		
	}
	
	 public void bark() {
		 
		 System.out.println("Dog can bark" );
	 }
}

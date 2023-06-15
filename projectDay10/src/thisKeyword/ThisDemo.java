package thisKeyword;

public class ThisDemo {
	
	int num1 = 10; //object attribute / instance variable
	int num2 = 20;
	String name;
	
	public ThisDemo() {
		//default Constructor
		
	}
	
	
	public ThisDemo(int num1,int num2) { //Param constructor
		
		this.num1=num1;
		this.num2=num2;
	
	}
	
	public ThisDemo(String name, int num2) { //Param constructor
		
		this.name=name;
		this.num2=num2;
	
	}
	

}

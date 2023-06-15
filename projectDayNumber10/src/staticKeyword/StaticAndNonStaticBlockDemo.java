package staticKeyword;


//static then non-static execution takes place
public class StaticAndNonStaticBlockDemo {
	
	//non-static
	
	{
	System.out.println("I am not Static");	
	}
	
	//static block
	static {
		System.out.println("I am Static");
	}
		
	public static void main(String[] args) {
		
		StaticAndNonStaticBlockDemo vd = new StaticAndNonStaticBlockDemo();
		
		
		

	}

}

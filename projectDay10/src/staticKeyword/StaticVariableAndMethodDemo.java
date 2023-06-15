package staticKeyword;

public class StaticVariableAndMethodDemo {
		static String name = "Sushan";
		
				String city = "Texas";
				
				
	static public void chill() {
		
		System.out.println("Good Morning!");
	}
	
	
	public void wow() {
		
		System.out.println("Hi---how are u?");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Name: " + name);
		
		
		System.out.println("Name: " + StaticVariableAndMethodDemo.name );
		
		System.out.println("\nCall static method");
		chill();
		//Above mentioned method internally called as className.methodname;
		//Reference 
		StaticVariableAndMethodDemo.chill();
		
		
		
	}

}

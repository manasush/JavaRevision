package package1;

public class ClassA {
	
	private static void privateMethod() {
		
		System.out.println(" Method is Private ");
	}
	
	
	public void publicMethod() {
		
		System.out.println(" Method is public ");
	}
	
	protected void protectedMethod () {
		
		System.out.println(" Method is Protected ");
	}
	
	
	void defaultMethod() {
		System.out.println(" Method is default ");
	}
	
	
	public static void main(String[] args) {
		privateMethod();
	}
	

}

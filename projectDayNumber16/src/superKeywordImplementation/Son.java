package superKeywordImplementation;

public class Son extends Father{
	String name ="Beta";
	int age = 5;
	
	public Son() {
		super();
	}
	
	
	public void show() {
		System.out.println("name="+name);
		System.out.println("this.name="+this.name);
		System.out.println("super.name="+super.name);
		System.out.println("super.age="+ super.age );
		System.out.println("baby age="+ age );
		
		
		
	}
	
	public static void main(String[] args) {
		Son sn = new Son();
		sn.show();
	}

}

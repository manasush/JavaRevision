package superKeywordDemo2;

public class B extends Hello{
	
	String name = "SAID";
	String color ="Red";
	
	public void show() {
		String color ="Blue";

		
		System.out.println("name="+name);
		System.out.println("this.name="+this.name);
		System.out.println("color="+color);
		System.out.println("this.color="+this.color);
		System.out.println("super.color="+super.color);
		System.out.println("name="+name);

		super.show();// calling super show
	}

}

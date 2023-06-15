package upCastingAndDownCasting;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	SuperClass d = new ChildClass();
	
	d.run();
	d.walk();
	
//	System.out.println(d.tail);
	
	
	System.out.println("---------------------");
	
	
	ChildClass cd = (ChildClass)d;
				cd.run();
				cd.walk();
				cd.sleep();
				System.out.println(cd.name);
				System.out.println(cd.tail);
//				System.out.println(cd.color);
			
	
	
	
	}

}

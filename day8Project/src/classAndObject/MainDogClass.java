package classAndObject;

public class MainDogClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Dog dg = new Dog(); //creating object
		
		
		dg.run();
		
		System.out.println(dg.color);
		System.out.println(dg.name);
		System.out.println("num of legs: " +dg.legs);
		System.out.println("eyes: " +dg.eyes);
		
		System.out.println("-----------------");
		
	Dog dg2 = new Dog ();	
		
		dg2.walk();

	}

}

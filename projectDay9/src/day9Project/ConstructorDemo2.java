package day9Project;

public class ConstructorDemo2 {
	String name = "Tommy";
	
	int eye =2;
	int tail =1;
	String color = "White";
	//Default  constructor or no argument constructor
	public ConstructorDemo2(){
		
		
	}
	
	//Parameterized Constructor
	public ConstructorDemo2(String n, String c) {
		color = c;
		name = n;
		
	}
	
	
	public ConstructorDemo2(int e, int t) {
		
		eye = e;
		tail = t;
	}
	
	public void run() {
		
		System.out.println("dog can run");
		
	}
	
	public void walk() {
		
		System.out.println("dog can walk");
	}
	
	
	public static void main(String[] args) {
		
		ConstructorDemo2 cnt = new ConstructorDemo2();
		
		System.out.println(cnt.name);
		System.out.println(cnt.tail);
		System.out.println(cnt.color);
		
		ConstructorDemo2 cnt1 = new ConstructorDemo2("Pitbull","Brown");
		
		cnt.walk();
		cnt.run();
		
		System.out.println(cnt1.name);
		System.out.println(cnt1.color);
		
		
		cnt1.name ="OREO";
		cnt1.name = "Black&White";		
		System.out.println(cnt1.name);
		System.out.println(cnt1.color);
		
		System.out.println(cnt.eye);
		System.out.println(cnt.tail);
		
		ConstructorDemo2 cnt2 = new ConstructorDemo2(3,2);
		
		System.out.println(cnt2.eye);
		System.out.println(cnt2.tail);
		
	}
	
	
	
	
	


}

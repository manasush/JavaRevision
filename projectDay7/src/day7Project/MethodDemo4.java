package day7Project;

public class MethodDemo4 {

	//void meaning not passing any parameter & 
	//doesn't return anything

	public static void chill() {
		
		System.out.println("I am Chilling!");
	}
	
	public static void main(String[] args) {

		chill();
		System.out.println("The Volume of Sphere is: " + volumeOfsphere(10) );
		
	}
	
	
	public static double volumeOfsphere(double radius) {
		
		double vol= (4/3)* Math.PI * Math.pow(radius, 3);   
		
		return vol;
		
	}

}

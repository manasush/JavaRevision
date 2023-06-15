package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object for DOG class
		
		System.out.println("creating object for DOG class");
		Dog d = new Dog();
		d.Run();
		System.out.println(d.name);
		
		
		
		System.out.println("----------------------");
		
		System.out.println("creating object for NewDog class");
		
		NewDog d1 =  new NewDog(); 
		d1.Run();
		
		d1.Walk();
		
		
		
		Dog d2 = new NewDog(); // upcasting
		
		
		d2.sleep(); //method overloading from newsleep
		
		//Dog can only excess parent class but not subclass
//		
//		
//		
//		
//		NewDog nnd = new NewDog();
//		// subclass  can excess subclass
//		
//		//super class reference can hold reference of child class object
//		
//		//super class object never point out reference of child
//		//NewDog nd = new Dog();
//		;
		
		
		

	}

}

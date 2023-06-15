package polyMorphism;

public class MainClass {

	public static void main(String[] args) {
		Animal an;
		System.out.println("---From Animal--");
				an = new Animal(); 
				an.eat();
				
				
				
	System.out.println("---From Cat--");
	
				an = new Cat(); 

				an.eat();
				
	System.out.println("---From Cow--");
				
				an = new Cow(); 

				an.eat();
				
	System.out.println("---From Dog--");
				
				an = new Dog(); 

				an.eat();
		
		

	}

}

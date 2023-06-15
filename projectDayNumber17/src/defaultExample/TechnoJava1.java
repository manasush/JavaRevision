package defaultExample;

public class TechnoJava1 extends TeechnoJave{
	
	public static void main(String[] args) {
		
		TeechnoJave  tech;
				tech = new TeechnoJave();
				tech.dance();
				
		System.out.println("name: "+ tech.name);	
		//tech.laugh(); could not access method being private
		
		tech.Sleep(); //default method can be accessed in same package
		
		tech.practice(); // can access protected method in a same package
				
	} 
	
	

}

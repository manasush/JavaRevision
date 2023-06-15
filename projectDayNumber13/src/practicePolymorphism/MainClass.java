package practicePolymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		Phone pn;
		System.out.println("------------From Phone (SuperClass)--------");
				pn = new Phone();
				
				pn.Feature();
				
		System.out.println("-------------From Android (subClass)--------");
				pn = new AndroidPhone();
				pn.Feature();
				
				
			System.out.println("---------From Iphone (subClass)----------");
			
				pn = new Iphone();
				
				pn.Feature();
				

				
				
				
				
		

	}

}

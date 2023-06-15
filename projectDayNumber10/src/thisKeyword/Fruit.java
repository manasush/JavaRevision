package thisKeyword;

public class Fruit {
	int price =  40; //object attribute /instance variable
	
	String name = "Banana";
	
	public void wow() {
		
		int price = 50; //local variable fr wow method
		String name = "Maya";
		System.out.println(price);
		System.out.println(name);
		System.out.println("---------");
		System.out.println(this.price);
		System.out.println(this.name);
		
	}
	
	
	public static void main(String[] args) {
		Fruit fr1= new Fruit();
		fr1.wow();
	}
	
	
	
	
	
	
	
	

}

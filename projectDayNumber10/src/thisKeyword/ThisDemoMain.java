package thisKeyword;

public class ThisDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThisDemo td = new ThisDemo();
		
		System.out.println(td.num1);
		System.out.println(td.num2);
		
		System.out.println("---------------------");
		
		
		ThisDemo td2 = new ThisDemo(30,40);
		System.out.println(td2.num1);
		System.out.println(td2.num2);
		
		System.out.println("-----------------------");
		
		
		ThisDemo td3 = new ThisDemo("Bunny",90);
		System.out.println(td3.name);
		System.out.println(td3.num2);
		
		
		
	
		
		

	}

}

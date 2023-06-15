package defaultExample;

 class TeechnoJave {
	//if we declare class as default type we can access it in a same package
	String name= "Sushan";
	public void dance() {
		
		System.out.println("techno java dances");
		
		
	}
	
	
	
	
	private static void laugh() {
		
		System.out.println("techno java laughs");
		
		
	}
	void Sleep() {
	
	System.out.println("techno java sleeps");
	
	
	}
	
	
	
	protected void practice() {
		System.out.println("techno java practice");
	}
	
	
	public static void main(String[] args) {
		laugh(); //have to make the private class static to get access in the same class
	}

}

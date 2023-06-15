package superKeywordDemo;

public class MahaJoker extends Joker {
	
	
	//method overiding
	
	
	public void dance() {
		
		System.out.println("Joker can dance in night only");
	}
	
	public void hey () {
		dance();
		this.dance();
		super.dance();
	}

}

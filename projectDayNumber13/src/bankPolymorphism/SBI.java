package bankPolymorphism;

public class SBI extends Banks{
	
		
			
	
	    private float rate; // Interest rate for SBI

	    public SBI(float p, int t) {
	        super(p, t);
	        rate = 8.0f; // SBI interest rate is 8%
	    }

	    @Override
	    public float getRateOfInterest() {
	        return (p * t * rate) / 100;
	    }
	}

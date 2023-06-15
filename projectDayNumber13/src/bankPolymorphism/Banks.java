package bankPolymorphism;

public class Banks {
	
	 protected float p; // Principal amount
	    protected int t; // Time period in years

	    public Banks(float p, int t) {
	        this.p = p;
	        this.t = t;
	    }

	    public float getRateOfInterest() {
	        return 0.0f; // Default implementation, overridden by subclasses
	    }
	}

			
		

			
	
	



package bankPolymorphism;

public class AXIS extends Banks {
    private float rate; // Interest rate for AXIS

    public AXIS(float p, int t) {
        super(p, t);
        rate = 9.0f; // AXIS interest rate is 9%
    }

    
    public float getRateOfInterest() {
        return (p * t * rate) / 100;
    }
}

package bankPolymorphism;

public class ICCI extends Banks {
    private float rate; // Interest rate for ICCI

    public ICCI(float p, int t) {
        super(p, t);
        rate = 7.0f; // ICCI interest rate is 7%
    }

    //override
    public float getRateOfInterest() {
        return (p * t * rate) / 100;
    }
}

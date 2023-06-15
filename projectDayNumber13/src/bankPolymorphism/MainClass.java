package bankPolymorphism;

public class MainClass {

	public static void main(String[] args) {
        float principal = 4000;
        int time = 3;

        Banks sbi = new SBI(principal, time);
        Banks icci = new ICCI(principal, time);
        Banks axis = new AXIS(principal, time);

        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println("ICCI Rate of Interest: " + icci.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + axis.getRateOfInterest());
    }
}
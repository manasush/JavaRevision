package interfaceExample;

public class Cow implements Animal {
	@Override
	public void tail() {
		System.out.println("Cow has one tail");
	}

	@Override
	public void leg() {
		System.out.println("Cow has four legs");
	}

	public static void main(String[] args) {
		// We can create a reference of an interface, but not an object
		Animal an;
		an = new Cow();
		an.tail();
		an.leg();

		System.out.println("Name: " + Animal.name);
		System.out.println("Age: " + Animal.age);
	}
}
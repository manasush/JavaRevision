package interfaceExample;

public interface Animal {
	int age = 3; // In an interface, all attributes are public static final by default
	String name = "fox"; // In an interface, all attributes are public static final by default

	void tail(); // By default, all methods in an interface are public and abstract

	void leg(); // By default, all methods in an interface are public and abstract
}
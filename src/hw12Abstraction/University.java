package hw12Abstraction;

public interface University extends College, Hospital {

	public void classSize();

	public void playGround();

	public void teacher();

	// default constructor created

	// public university() {
	// }

	// No, We can't create a default constructor in university interface

	// here data members in interfaces are public static final by default,and they
	// are constant, and abstract by nature.
	// Also there is no method body in interface and that's why they don't need
	// constructor.

	// default method
	default void gymnasium() {
		System.out.println("Default Method Executed");
	}

	// static method
	static void library() {
		System.out.println("Static Method Executed");
	}

}

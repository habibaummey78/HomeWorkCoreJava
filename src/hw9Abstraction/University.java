package hw9Abstraction;

public interface University {

	public void classSize();

	public void playGround();

	public void teacher();

	// default constructor created

	// public university() {
	// }

	// No, We can't create a default constructor in university interface

	// here data members in interfaces are public static final by default,and they
	// are constant, and abstract by nature.Also there is no method body in
	// interface and thats why they don't need constructor.

}

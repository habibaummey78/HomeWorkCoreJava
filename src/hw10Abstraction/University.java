package hw10Abstraction;

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
		System.out.println("Default Method is Executed");
	}

	// static method
	static void library() {
		System.out.println("Static Method is Executed");

	}

	/*
	 * i)one keywords is used for the inheritance in Interface and that is
	 * "extends". Yes, an interface can inherit other interfaces by using the
	 * extends keyword but can not inherit abstract class or a regular class .yes,
	 * more than one inheritances are possible.
	 * 
	 * ii)One keyword is used for the inheritance in Java for Abstract Class.That
	 * is"extends".
	 * 
	 * Yes, Abstract Class can inherit another Abstract Class or a regular class but
	 * can not inherit interface by extends keyword. one inheritance is possible in
	 * an Abstract Class.
	 * 
	 * 
	 * iii) One keyword is used for the inheritance in Java for a regular Class,
	 * that is "extends".A regular Class can inherit another Abstract Class or a
	 * regular class but can not inherit interface by extends keyword.one
	 * inheritance is possible by a regular Class.
	 */

}

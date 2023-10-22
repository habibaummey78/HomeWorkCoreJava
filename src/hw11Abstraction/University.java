package hw11Abstraction;

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

		/*
		 * i) one keywords is used for the inheritance in Interface and that is
		 * "extends. yes, an interface can inherit other interfaces by extends keyword,
		 * but it can't inherit abstract or regular class by any keywords.more than one
		 * 
		 * ii) two keywords are used for the inheritance in Java for Abstract Class.They
		 * are "extends" and implements.yes an abstract class can inherit another
		 * abstract or regular class by extends keywords but it inherits interface by
		 * implements words.more than one
		 * 
		 * iii) keywords are used for the inheritance in Java for a regular Class. yes a
		 * regular class can inherit another abstract or regular class by extends
		 * keywords but it inherits interface by implements words.more than one
		 */

	}

}

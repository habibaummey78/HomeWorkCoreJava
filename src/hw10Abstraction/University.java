package hw10Abstraction;

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

	// default method
	default void gymnasium() {
		System.out.println("Default Method Executed");
	}

	// static method
	static void library() {
		System.out.println("Static Method Executed");

	}

	// There are two main keywords,extends and implements which are used for
	// inheritance in inheritance.
	// nterfaces can inherit other interfaces (even multiple), with extends Can an
	// interface inherit other Interfaces, or a regular class or
	// abstract class by extends keyword

	// There are two main keywords, “extends” and “implements” which are used in
	// Java for inheritance.
	// Yes, an abstract class can inherit another abstract class or a regular class
	// or interface by using the extends keyword.

	/*
	 * HW09C: (Continue in the above package hw9Abstraction) a) Create an interface
	 * "University". Declare some methods inside the interface named--> classSize,
	 * playGround, and teacher. b) Create an interface "Hospital". Declare some
	 * methods inside the interface - emergencyRoom, surgeryRoom, cafeteria. c)
	 * Create an interface "College". Declare some methods inside the interface -
	 * commonRoom, laboratory, languageClub. d) Create an interface VocationalSchool
	 * and a method vocationalInfo inside it. e) Create an interface
	 * AeronauticalSchool and a method aeronauticalInfo inside it. f) Create an
	 * interface LawSchool and a method lawInfo inside it. Now, Can you create a
	 * Constructor inside the University interface? If yes, create a default
	 * Constructor on the University interface. If no, comment out the 'created
	 * constructor' and answer why not?
	 * 
	 */
}

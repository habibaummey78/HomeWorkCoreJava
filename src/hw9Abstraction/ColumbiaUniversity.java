package hw9Abstraction;

public class ColumbiaUniversity {

	// abstract method
	// public abstract void chemistry();
	// We can not create an Abstract Method inside regular class. we only can create
	// non-abstract method which is implemented ,
	// on the other hand, abstract method is declared and it doesn't logically fit
	// in regular class

	// method is implemented here and it is a non-abstract method

	public void biology() {
		System.out.println("This method is from ColumbiaUniversity Class");
	}

	// yes, we can create a Constructor inside a regular Class?
	// default Constructor created

	public ColumbiaUniversity() {

	}

}

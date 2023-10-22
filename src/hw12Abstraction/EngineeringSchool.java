package hw12Abstraction;

public abstract class EngineeringSchool extends NYUniversity {

	// Method is declared and it is an abstract method

	public abstract void mechanicalLab();

	// method is implemented here and it is a non-abstract method
	public void computerLab() {

		System.out.println("This method is from EngineeringSchool Class");

	}

}

package hw12Abstraction;

public abstract class NursingSchool extends RockefellerUniversity {

	/// Method is declared and it is an abstract method
	public abstract void hygiene();

	// method is implemented here and it is a non-abstract method
	public void caring() {

		System.out.println("This method is from NursingSchool Class");
	}
}

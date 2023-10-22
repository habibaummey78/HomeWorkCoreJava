package hw12Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	// Method is declared and it is an abstract method
	public abstract void anatomyLab();

	// method is implemented here and it is a non-abstract method
	public void biochemistryLab() {
		System.out.println("This method is from MedicalSchool Class");

	}

	// Yes, we can create a Constructor inside MedicalSchool Abstract Class.
	// default constructor

	public MedicalSchool() {
		System.out.println("This default constructor is from MedicalSchool Class");
	}

}

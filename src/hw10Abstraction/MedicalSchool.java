package hw10Abstraction;

public abstract class MedicalSchool {

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

	/*
	 * : HW09A: Create a package name "hw9Abstraction" inside your HW project.
	 * Inside the package -- a) Create an Abstract Class MedicalSchool, create 2
	 * methods inside the Abstract Class - one is abstract and another one is the
	 * non-abstract name -- anatomyLab and biochemistryLab. Print something inside
	 * the non-abstract or implemented method. b) Create another Abstract Class
	 * EngineeringSchool, create 2 methods inside the Abstract Class - one is
	 * abstract and another one is the non-abstract name -- mechanicalLab and
	 * computerLab. Print something inside the non-abstract or implemented method.
	 * c) Create another Abstract Class NursingSchool, create 2 methods inside the
	 * Abstract Class - one is abstract and another one is the non-abstract name --
	 * hygiene and caring. Print something inside the non-abstract or implemented
	 * method. Can you create a Constructor inside MedicalSchool Abstract Class? If
	 * yes, create a default Constructor. If no, comment out the created constructor
	 * and answer why not?
	 * 
	 * 
	 */

}

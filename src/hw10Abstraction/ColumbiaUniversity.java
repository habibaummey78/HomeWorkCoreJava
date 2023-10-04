package hw10Abstraction;

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

	/*
	 * HW09B: (Continue in the above package hw9Abstraction) a) Create a regular
	 * Class ColumbiaUniversity, create 2 methods inside the class - one is abstract
	 * and another one is the non-abstract name -- chemistry and biology. if any of
	 * them is not possible to create, simply comment out the method and explain why
	 * in the Java comment, inside this class only. Print something inside the
	 * non-abstract or implemented method. Can you create a Constructor inside a
	 * regular Class? If yes, create a default Constructor in ColumbiaUniversity. If
	 * no, comment out the created constructor and answer why not? b) Create a
	 * regular Class NYUniversity, create a non-abstract method -- anthropology.
	 * Print something inside the non-abstract or implemented method. c) Create a
	 * regular Class RockefellerUniversity, create a non-abstract method -- maths.
	 * Print something inside the non-abstract or implemented method.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * * HW10A: Copy your previous package "hw9Abstraction", paste into the HW
	 * Project and rename it to "hw10Abstraction" inside your HW project and execute
	 * the below in this package. Read the question very carefully. Create one
	 * default and one static method gymnasium and library inside the interface
	 * "University". Create one default and one static method morgue and pharmacy
	 * inside the interface "Hospital". Create also one default and one static
	 * method dorm and studyRoom inside the interface "College". i) How many
	 * keywords are used for the inheritance in Interface, answered by Java
	 * comments? Can an interface inherit other Interfaces, or a regular class or
	 * abstract class by extends keyword? How many inheritances are possible? Use
	 * the Interface -- "University" to answer my questions (University extends
	 * College, Hospital) (by multiple line comments). ii) You have 3 abstract class
	 * names --MedicalSchool, EngineeringSchool, and NursingSchool. how many
	 * keywords are used for the inheritance in Java for Abstract Class? Can an
	 * Abstract Class inherit another Abstract Class or a regular class or interface
	 * by extends keyword? How many inheritances are possible in an Abstract Class?
	 * (use java comments for the above question) Use one of the above Abstract
	 * classes (MedicalSchool extends NursingSchool) and use the keywords to answer
	 * my questions. iii) You have 3 regular class names -- ColumbiaUniversity,
	 * NYUniversity, RockefellerUniversity. how many keywords are used for the
	 * inheritance in Java for a regular Class? Can a regular Class inherit another
	 * Abstract Class or a regular class or interface by extends keyword? How many
	 * inheritances are possible by a regular Class? (use java comments for the
	 * above question). Use one of the above regular Classes (ColumbiaUniversity
	 * extends MedicalSchool ) and use the keywords to answer my questions. You
	 * don't need to execute anything as the main method is absent. A GitHub link is
	 * necessary to paste.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * HW10B: Create a package name "hw10Encapsulation" in the HW project. Inside
	 * the package, a) Create a class, Employee, and declare some private
	 * variables----> name, age, sex, citizen. How can you access those variables by
	 * the getter and setter method? In EmployeeTest class, Please execute those
	 * variables with the help of the getters and setters method and print Employee
	 * info (Use necessary String to make the outcome meaningful, you can also use
	 * \n if you want). Paste the GitHub link below.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}

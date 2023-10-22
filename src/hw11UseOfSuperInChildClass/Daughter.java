package hw11UseOfSuperInChildClass;

public class Daughter extends Father {

	public String birthMonth;
	public int age;

	// default constructor
	public Daughter() {
		super("saarah", 20, 'F', false);
		// super keyword is used to call (initialize) any types of method from super
		// (Parent) class
		super.father();
		super.fatherInfo("arhaam", 6, 'M', true);
		// super keyword is also used to call (initialize) the variables of super
		// (Parent) class
		super.familyName = "Zayan";
		System.out.println("Is this a Family Name, Ans: " + familyName);
		System.out.println("This default constructor is from child class Daughter");

	}

//parameterized constructor

	public Daughter(String birthMonth, int age) {
		// Inside Parameterized Constructor, super() and super keyword do same function
		// like they did inside default constructor
		super("saarah", 20, 'F', false);
		// super keyword is used
		super.father();
		super.fatherInfo("arhaam", 6, 'M', true);
		System.out.println("Daughter's BirthMonth is: " + birthMonth + " and Age: " + age);
		System.out.println("This parameterized constructor is from child class Daughter");

	}

	// regular void method implemented

	public void daughter() {
		// we can't call constructor of super class inside a method of child class.
		// super();
		super.father();
		super.fatherInfo("arhaam", 6, 'M', true);
		System.out.println("This method is from child class Daughter");
	}

	// parameterized method

	public void daughterInfo(String birthmonth, int age) {
		// we can't call constructor of super class inside a method of child class.
		// super();
		super.father();
		super.fatherInfo("arhaam", 6, 'M', true);
		super.familyName = "Zayan";
		System.out.println("Is this a Family Name, Ans: " + familyName);
		System.out.println("Daughter's BirthMonth is: " + birthMonth + " and Age: " + age);
	}

}

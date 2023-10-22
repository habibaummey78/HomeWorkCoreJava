package hw11UseOfSuperInChildClass;

public class Father {
	// variable declared
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

//default constructor
	public Father() {
		System.out.println("This is Default constructor created from class Father");

	}

	// parameterized constructor
	public Father(String name, int age, char sex, boolean usCitizen) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("From Parent Class, Name: " + name + " Age: " + age + "Sex:" + sex + " and UScitizenship: "
				+ usCitizen);
	}

	// Method implemented
	public void father() {
		System.out.println("This is a void type Method from class Father");
	}

	// parameterized method

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		System.out.println("From Parent Class, Name: " + name + " Age: " + age + "Sex:" + sex + " and UScitizenship: "
				+ usCitizen);

	}
}

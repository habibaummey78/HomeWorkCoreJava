package hw10Encapsulation;

public class Employee {

	/*
	 * by following way we can access those variables by the getter and setter
	 * method: select variable right click -- source -- Generate Getters and Setters
	 * -- select variables -- insertion point: after the last variable present
	 * inside the class --- sorts by: Fields in getter/setter pair
	 */

	private String name;
	private int age;
	private char sex;
	private boolean usCitizen;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

}

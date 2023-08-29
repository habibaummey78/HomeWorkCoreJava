package hw3JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		// AboutMe class instantiation
		AboutMe obj = new AboutMe();

		// Calling variables
		System.out.println("About My self: \n" + "My name is: " + obj.myName + "\nMy Age is: " + obj.myAge
				+ "\nMy address is: " + obj.houseNumber + " " + obj.streetNumber + "." + "\nMy bank account number is: "
				+ obj.bankAcct + "." + "\nMy height is: " + obj.height + "\nMyGPA is: " + obj.gpa + "\nMy gender is: "
				+ obj.myGender + "I am married: " + obj.married);

		obj.aboutMe();

	}

}

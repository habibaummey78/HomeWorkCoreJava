package hw4JavaVariablesInitialized;

public class AboutMe {

	// declared variable
	public String aboutMyself;

	// initialized variable
	public String myName = "ummey";
	public byte myAge = 80;
	public short houseNumber = 11;
	public int streetNumber = 770;
	public long bankAcct = 12456788;
	public float height = 5.1f;
	public double gpa = 3.38;
	public char myGender = 'F';
	public boolean married = true;

	// declared constructor
	public AboutMe() {
		System.out.println("-----------This is all about Myself ----------:");
	}

	public void aboutMe() {

		System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy House Number: " + houseNumber
				+ "\nMy StreetNumber: " + streetNumber + "\nMy Bank Account: " + bankAcct + "\nMy Height: " + height
				+ "\nMy GPA: " + gpa + "\nMy Gender: " + myGender + "\nAm I married? Ans: " + married);

	}

}

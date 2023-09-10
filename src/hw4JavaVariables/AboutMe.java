package hw4JavaVariables;



public class AboutMe {
	
	//variables declared
			public String myName;
			public byte myAge;
			public short myApartmentRent;
			public int myYearlySalary;
			public long myBankBalance;
			public float myHeight;
			public double myGrade;
			public char myGender;
			public boolean usCitizen;

			//constructor declared
			public AboutMe() {

				System.out.println("This is all about us:");

			}

			//method implemented
			public void aboutMe() {

				System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Apartment Rent: "
						+ myApartmentRent + "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance: " + myBankBalance
						+ "\nGender: " + myGender + "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade
						+ "\nAm I US Citizen? Ans: " + usCitizen);

			}

}
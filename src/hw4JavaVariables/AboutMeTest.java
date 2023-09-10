package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		// constructor initialized
		AboutMe ummey = new AboutMe();

		// variable initialized
		ummey.myName = "Ummey";
		ummey.myAge = 80;
		ummey.myApartmentRent = 600;
		ummey.myYearlySalary = 5466787;
		ummey.myBankBalance = 26827987989l;
		ummey.myHeight = 3.1345f;
		ummey.myGrade = 8.787974653;
		ummey.myGender = 'F';
		ummey.usCitizen = false;

		// method initialized
		ummey.aboutMe();

		// constructor initialized
	
		AboutMe alex = new AboutMe();

		// variable initialized
		alex.myName = "Alex";
		alex.myAge = 120;
		alex.myApartmentRent = 800;
		alex.myYearlySalary = 690787;
		alex.myBankBalance = 27987989898l;
		alex.myHeight = 2.1345f;
		alex.myGrade = 7.974653;
		alex.myGender = 'M';
		alex.usCitizen = true;
		
		//method initialized
		alex.aboutMe();

}
}
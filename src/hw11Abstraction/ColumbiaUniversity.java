package hw11Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

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

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

}

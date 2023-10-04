package hw10Abstraction;

public interface College {

	public void commonRoom();

	public void laboratory();

	public void languageClub();

//default method
	static void dorm() {
		System.out.println("Default Method Executed");
	}

//static method
	static void studyRoom() {
		System.out.println("Static Method Executed");
	}

}
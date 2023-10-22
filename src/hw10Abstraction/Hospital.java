package hw10Abstraction;

public interface Hospital {

	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	// default method
	default void morgue() {
		System.out.println("Default Method is Executed");
	}

	// static method
	static void pharmacy() {
		System.out.println("Static Method is Executed");

	}

}

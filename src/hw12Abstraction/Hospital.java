package hw12Abstraction;

public interface Hospital {

	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	// default method
	default void morgue() {
		System.out.println("Default Method Executed");
	}

	// static method
	static void pharmacy() {
		System.out.println("Static Method Executed");

	}

}

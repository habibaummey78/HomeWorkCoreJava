package hw5Q1Constructor;

public class ComputerTest {

	public static void main(String[] args) {

		// default Constructor initialized

		Computer computer = new Computer();

		// parameterized constructor initialized

		Computer mac = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', true);
		Computer myComputer = new Computer("Dell", "Dell Inspiron", "DellOS cmv", 700, 'A', true);

	}

}

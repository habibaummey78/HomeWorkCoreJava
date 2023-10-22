package hw12Polymorphism;

public class TestFamily {

	public static void main(String[] args) {

		System.out.println("Sister");
		Sister sis = new Sister();

		sis.sister();// void type method initialized
		sis.sister(30, 20, 10, 50, 60, "40");// void type parameterized method initialized
		sis.sister(10, 20, 30, "40", 50, 60);// return type parameterized method1
		sis.sister(60, 50, 30, "40", 20, 10);// static type method initialized
		sis.sister(20, 10, 30, "40", 50, 60);// final type method initialized

		System.out.println("Niece");
		Niece nc = new Niece();

		nc.sister();// void type method initialized
		nc.sister(30, 20, 10, "40", 50, 60);// void type parameterized method initialized
		nc.sister(10, 20, 30, "40", 50, 60);// return type parameterized method 1 initialized
		nc.sister(60, 50, 30, "40", 20, 10);// return type parameterized method 2 initialized
		nc.sister(20, 10, 30, "40", 50, 60);// return type parameterized method 3 initialized

	}

}

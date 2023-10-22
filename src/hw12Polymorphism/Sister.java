package hw12Polymorphism;

// Static method can be overloaded 

public class Sister {

//void type method
	public void sister() {
		System.out.println("This is void type method from Sister");
	}

	// void type parameterized method

	public void sister(int age3, int age2, int age1, int age5, int age6, String age4) {
		int total1 = age3 + age2 + age1 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Sister's total age: " + total1);
	}

	// return type parameterized method1

	public int sister(int age1, int age2, int age3, int age5, String age4, int age6) {
		int total2 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Sister's total age: " + total2);
		return total2;
	}

	// Static type Method implemented
	public int sister(int age6, int age5, int age3, String age4, int age2, int age1) {
		int total3 = age6 + age5 + age3 + Integer.parseInt(age4) + age2 + age1; // local variable
		System.out.println("Sister's total age: " + total3);
		return total3;
	}

	// final type method
	public int sister(int age2, int age1, String age4, int age3, int age5, int age6) {
		int total4 = age2 + age1 + age3 + Integer.parseInt(age4) + age5 + age6; // local variable
		System.out.println("Sister's total age: " + total4);
		return total4;

	}
}

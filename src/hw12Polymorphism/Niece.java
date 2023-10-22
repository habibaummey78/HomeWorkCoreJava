package hw12Polymorphism;

// Return type parameterized method which is final and implemented and overriden
public class Niece extends Sister {

	// void type method
	@Override
	public void sister() {
		System.out.println("This is void type method from Niece");
	}

	// void type parameterized method
	@Override
	public void sister(int age3, int age2, int age1, int age5, int age6, String age4) {
		int total1 = age3 + age2 + age1 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Sister's total age: " + total1);
	}

	// return type parameterized method1
	@Override

	public int sister(int age1, int age2, int age3, int age5, String age4, int age6) {
		int total2 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Sister's total age: " + total2);
		return total2;
	}

	// return type parameterized method2
	@Override
	public int sister(int age6, int age5, int age3, String age4, int age1, int age2) {
		int total3 = age6 + age5 + age3 + Integer.parseInt(age4) + age2 + age1; // local variable
		System.out.println("Sister's total age: " + total3);
		return total3;
	}

	// return type parameterized method3
	@Override
	public int sister(int age2, int age1, String age4, int age3, int age5, int age6) {
		int total4 = age2 + age1 + age3 + Integer.parseInt(age4) + age5 + age6; // local variable
		System.out.println("Sister's total age: " + total4);
		return total4;

	}

	// Static type Method implemented
	// This below method - sister can't override or implemented
	// because static is a local member method of a class
	// So, static method can't be override, if we remove @override it will work as
	// static method of this Niece class
	// static type method
	// @Override

	// public static int sister(int age6, int age5, int age3, String age4, int age2,
	// int age1) {
	// int total3 = age6 + age5 + age3 + Integer.parseInt(age4) + age2 + age1; //
	// local variable
	// System.out.println("Sister's total age: " + total3);
	// return total3;
	// }

	// Final type method cannot be Overriden
	// Cannot override the final method from Sister
	// final type method
	// @Override
	// public final int sister(int age2, int age1, int age3, String age4, int age5,
	// int age6) {
	// int total4 = age2 + age1 + age3 + Integer.parseInt(age4) + age5 + age6; //
	// local variable
	// System.out.println("Sister's total age: " + total4);
	// return total4;
	// }
}

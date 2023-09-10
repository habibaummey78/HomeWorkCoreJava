package hw5Q1Constructor;

public class Computer {

	// variables declared

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	// default Constructor declared

	public Computer() {
		System.out.println("This is from the default Constructor of Computer class.");
	}
	// parameterized Constructor 01 declared

	public Computer(String brand) {
		this.brand = brand;

		System.out.println("My Computer Brand: " + brand);
	}

	// parameterized Constructor 02 declared

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;

		System.out.println(
				"My Computer Brand: " + brand + ", Computer Model: " + model + ", Operating System: " + operatingSystem
						+ ", Price: " + price + ", Grade:" + grade + ", Is it made in USA? Ans: " + madeInUSA);

	}

}

package hw5Q2Constructor;

import javax.print.attribute.standard.Chromaticity;
import javax.swing.DefaultBoundedRangeModel;

public class Student {

	// variables declared
	public String stName;
	public int stID;
	public float grade;
	public char sex;
	public boolean isProgrammer;

	// default Constructor declared
	public Student() {

		System.out.println("This is from the default Constructor");
	}

	// parameterized Constructor declared
	public Student(String stName, int stID, float grade, char sex, boolean isProgrammer) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;

		System.out.println("Student Name: " + stName + ", Student Id: " + stID + ", Student Sex: " + sex
				+ " and Java Programmar? Ans: " + isProgrammer);
	}

}

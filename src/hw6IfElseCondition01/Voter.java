package hw6IfElseCondition01;

import java.util.Scanner;

import hw4JavaVariables.AboutMe;

public class Voter {

	public static void main(String[] args) {

		int myAge; // variable declared

		myAge = 90;

		if (myAge == 18) {
			System.out.println("I am a voter");
		} else if (myAge < 18) {
			System.out.println("I am not a voter");
		} else if (myAge > 18) {
			System.out.println("I am a voter from age 18");
		} else {
			System.out.println("Please add a valid age");
		}

	}

}

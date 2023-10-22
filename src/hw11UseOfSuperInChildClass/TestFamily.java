package hw11UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {

		System.out.println(" default constructor initialized from The Child Class Daughter ");
		Daughter daughter1 = new Daughter();

		System.out.println("\n parameterized constructor initialized from The Child Class Daughter");
		Daughter daughter2 = new Daughter("November", 23);

		System.out.println("\n void type method initialized from The Child Class Daughter ");
		daughter2.daughter();

		System.out.println("\n parameterized method initialized from The Child Class Daughter ");
		daughter2.daughterInfo("April", 30);

		System.out.println("\n default constructor initialized from The Parent Class Father ");
		Father father1 = new Father();

		System.out.println("\n parameterized constructor initialized from The Parent Class Father ");
		Father father2 = new Father("Saarah", 2, 'F', true);

		System.out.println("\n void type method initialized from The Parent Class father ");
		father2.father();

		System.out.println("\n parameterized method initialized from The Parent Class Father ");
		father2.fatherInfo("Arhaam", 7, 'M', true);

	}
}

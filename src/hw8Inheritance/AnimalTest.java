package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("\n----------------------------------------------------\n");

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		System.out.println("\n----------------------------------------------------\n");

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		System.out.println("\n----------------------------------------------------\n");

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		System.out.println("\n----------------------------------------------------\n");

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdInfo();
		robin.animalInfo();
		System.out.println("\n----------------------------------------------------\n");

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		System.out.println("\n----------------------------------------------------\n");

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

		System.out.println("\n----------------------------------------------------\n");

		Bird bird = new Bird();
		bird.birdInfo();
		bird.animalInfo();
		System.out.println("\n----------------------------------------------------\n");

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		System.out.println("\n----------------------------------------------------\n");

		// Dog extends mammal or robin extends bird or reptile extends animal are the
		// example of single inheritance
		// Bulldog extends dog, dog extends mammal, and mammal extends animal- they are
		// the example of multilevel inheritance
		// Mammal extends animal, bird extends animal and reptile extends animal--they
		// are the example of Hierarchical inheritance

		// Animal is the parent class of Mammal, Bird and Reptile.
		// Mammal, Bird and Reptile are child class of parent class animal.

	}

}

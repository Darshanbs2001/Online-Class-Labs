package AbstractClassesAndInterfaces;

class Animal {
	void makeSound() {
		System.out.println("The animal makes a sound");
	}

}

class Dog extends Animal {

	@Override
	void makeSound() {

		System.out.println("The Dog barks");
	}

}

class Cat extends Animal {

	@Override
	void makeSound() {
		System.out.println("The Cat meows");
	}

}

public class Assignment2 {
	public static void main(String[] args) {
		Cat c=new Cat();
		Dog d=new Dog();
		c.makeSound();
		d.makeSound();

	}
}

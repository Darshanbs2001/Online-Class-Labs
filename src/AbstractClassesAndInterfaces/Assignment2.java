package AbstractClassesAndInterfaces;
//base class Animal
class Animal {
	//method makeSound to overridden by the child class
	void makeSound() {
		System.out.println("The animal makes a sound");
	}

}
//class Dog inherits from Animal class
class Dog extends Animal {
	//override the makeSound method of Animal class
	//to print The Dog barks
	@Override
	void makeSound() {

		System.out.println("The Dog barks");
	}

}
//Cat class inherits from Animal class
class Cat extends Animal {
	//override the the makeSound method of Animal class
	//to print The cat Meows

	@Override
	void makeSound() {
		System.out.println("The Cat meows");
	}

}

public class Assignment2 {
	public static void main(String[] args) {
		Animal a=new Animal();//create the animal object
		Cat c=new Cat();//create the cat object
		Dog d=new Dog();//create the dog object 
		a.makeSound();
		c.makeSound();
		d.makeSound();
		

	}
}

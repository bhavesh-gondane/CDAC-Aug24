package assignment5_dt4_12_9_shweta_maam;

/*3)	Create a base class Animal with attributes like name, and methods like eat() and sleep(). Create a subclass Dog that inherits from Animal and has an additional method bark(). Write a program to demonstrate the use of inheritance by creating objects of Animal and Dog and calling their methods.
 * */

class Animal{
	private String name;
	
	public void eat() {
		System.out.println("Animal eatting");
	}
	
	public void sleep() {
		System.out.println("Animal sleeping");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("Dog is barking");
	}
}

public class que3 {
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		
		a.eat();
		a.sleep();
//		a.bark();
		System.out.println();
		d.eat();
		d.sleep();
		d.bark();
	}
}

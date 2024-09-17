package assignment5_dt4_12_9_shweta_maam;
/*5)	Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods in each subclass to start and stop the engines differently.
 * */

class Vehicle1{
	public void startEngine() {
		System.out.println("Vehicle starts");
	}
	
	public void stopEngine() {
		System.out.println("Vehicle stops");
	}
}

class Car1 extends Vehicle1{
	@Override
	public void startEngine() {
		System.out.println("Car starts");
	}
	@Override
	public void stopEngine() {
		System.out.println("Car stops");
	}
}
class Motorcycle extends Vehicle1{
	@Override
	public void startEngine() {
		System.out.println("Motorcycle starts");
	}
	@Override
	public void stopEngine() {
		System.out.println("Motorcycle stops");
	}
}
public class que5 {
	public static void main(String[] args) {
		Car1 c = new Car1();
		System.out.println("Car");
		c.startEngine();
		System.out.println("-------------------");
		c.stopEngine();
		System.out.println();
		
		Motorcycle m = new Motorcycle();
		System.out.println("Motorcycle");
		m.startEngine();
		System.out.println("-------------------");
		m.stopEngine();
	}
}

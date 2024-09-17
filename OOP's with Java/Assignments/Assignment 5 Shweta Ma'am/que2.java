package assignment5_dt4_12_9_shweta_maam;

/* 2)	Create a base class Vehicle with attributes like make and year. Provide a constructor in Vehicle to initialize these attributes. Derive a class Car that has an additional attribute model and write a constructor that initializes make, year, and model. Write a program to create a Car object and display its details.
 * */

class Vehicle{
	private String make;
	private int year;
	
	
	public Vehicle(String make, int year) {
		this.make = make;
		this.year = year;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getYear() {
		return year;
	}
}

class Car extends Vehicle{
	private String model;
	
	public Car(String make,int year,String model) {
		super(make,year);
		this.model = model;
	}
	@Override
	public String toString() {
		return "Make:"+getMake()+" Year:"+getYear()+" Model:"+model;
	}
}

public class que2 {
	public static void main(String[] args) {
		Car c = new Car("Kia",2022,"Seltos");
		System.out.println(c.toString());
		
		
	}
}

package Programs_for_interview.Topics;

//Parent class
class Vehicle {
	void start() {
		System.out.println("Vehicle is starting...");
	}
}

//Child class inheriting from Vehicle
class Car extends Vehicle {
	void drive() {
		System.out.println("Car is driving...");
	}
}

//Main class to test Inheritance
public class Inheritence_1 {
	
	public static void main(String[] args) {

		Car myCar1 = new Car();                  // Creating an object of the Car class
		myCar1.start();                          // Inherited method from Vehicle class
		myCar1.drive();                         // Method from Car class
		// by using child instance we can call parent method
		
		Vehicle v = new Car();                  // this is up-casting 
		v.start();
//		v.drive();                             //   can't call ( can call by down casting  ((Car) myCar).drive();  
		
		Car myCar3 = (Car)v;                  // downCast
		myCar3.drive();
	}	
}

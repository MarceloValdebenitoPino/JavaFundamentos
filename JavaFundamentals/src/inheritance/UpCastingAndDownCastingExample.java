package inheritance;

class Vehicle {
	void drive() {
		System.out.println("Driving a Vehicle..");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Driving a Car..");
	}
	void speedUp() {
		System.out.println("Speeding Up a Car..");
	}
}

public class UpCastingAndDownCastingExample {

	public static void main(String[] args) {
	
		// Upcasting
		Vehicle vehicle1 = new Car();
		vehicle1.drive();
		
		// Downcasting
		
	Vehicle vehicle = new Car();
	Car car = (Car) vehicle;
	car.drive();
	car.speedUp();
	}

}

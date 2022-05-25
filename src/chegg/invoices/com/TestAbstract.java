package chegg.invoices.com;

/**
 * Error1: class Vehicle Reason: if a class contain abstact method we have to
 * make class as abstract Correction: make vehicle class as abstract
 */

abstract class Vehicle {
	public int speed;

	/**
	 * Error2: start() method Reason: it not possible to provide implementation for
	 * abstact method Correction: remove method implementation
	 */
	abstract void start();

	public void stop() {
		speed = 0;
	}

	abstract void accelerate();

	abstract void brake();
}

class Car extends Vehicle {
	void start() {
		speed = 20;
	}

	void accelerate() {
		speed++;
	}

	void brake() {
		speed--;
	}
}

/**
 * Error3: class Bicycle implements Vehicle Reason: we can not implement class,
 * we have to extend the class Correction: replace implements with extends
 *
 */
class Bicycle extends Vehicle {
	void start() {
		speed = 10;
	}

	void accelerate() {
		speed++;
	}

	void brake() {
		speed--;
	}
}

/**
 * Error4: class Lorry extends Vehicle Reason: Since Vehicle Class Contain an
 * abstract method called start(),we have to provide implementation for start()
 * method Correction: Add start() method with no parameters to Lorry Class
 *
 */
class Lorry extends Vehicle {
	void start() {
		speed = 15;
	}

	void start(int speed) {
		this.speed = speed;
	}

	void accelerate() {
		speed++;
	}

	// here we have logical error, we have to decrement the speed when brake method
	// called
	void brake() {
		speed--;
	}

}

public class TestAbstract {

	public static void main(String[] args) {
		/**
		 * Error5: obj.accelerate() Reason: WithOut Creating Object here accessing the
		 * methods Correction: Create Object of Any Vehicle type and call aceelerate
		 * method
		 */
		Vehicle obj = new Car();
		obj.accelerate();

	}

}

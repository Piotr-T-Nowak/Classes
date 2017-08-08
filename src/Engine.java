
public class Engine {

	Car audi = new Car();
	
	boolean engineStatus;
	public	int gear;
	double burningFuel;

	Engine() {
		gear = 0;
	}

	void start() {
		System.out.println("Engine has been started");
		engineStatus = true;

	}

	void shutDown() {
		System.out.println("Engine shutted down");
		engineStatus = false;
	}

	void setGear(int newGear) {

		if (newGear < -1) {
			gear = -1;

		} else {
			if (newGear > 5) {
				gear = 5;
			} else {
				gear = newGear;
			}
		}
	}

	void runForTime(int time) {
		if (engineStatus = true) {
			burningFuel = time * gear;
			System.out.println(burningFuel);
		} else {
			System.out.println("Start the Engine");
		}

	}

}

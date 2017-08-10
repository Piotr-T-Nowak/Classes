
public class Engine {

	boolean engineStarted;
	public int gear;

	Engine() {
		gear = 0;
	}

	void start() {
		System.out.println("Engine has been started");
		engineStarted = true;

	}

	void shutDown() {
		System.out.println("Engine shutted down");
		engineStarted = false;
	}

	void setGear(int newGear) {

//		zamien Math.max i Math.min()
		
		if (newGear < -1) {
			gear = -1;
		} else if (newGear > 5) {
			gear = 5;
		} else {
			gear = newGear;
		}
	}

	double runForTime(int time) {
		double burningFuel;
		if (engineStarted = true) {
			// what if gear is -1?
			burningFuel = time * gear * 0.06;
			System.out.println("You're trying to burn :" + burningFuel + " l");
		} else {
			burningFuel = 0;
			System.out.println("Start the Engine");	
		}
		return burningFuel;
	}

}

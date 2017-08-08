
public class Cocpit {

	private boolean lightStatus;
	int wiper = 3;

	Cocpit() {
		lightStatus = true;
	}

	void turnLightOn() {
		System.out.println("Light turned on");
		lightStatus = true;
	}

	void turnLightOff() {
		System.out.println("Light turned off");
		lightStatus = false;
	}

	void wipers(int speed) {
		if(speed < 1) {
			System.out.println("Wipers turned off");
		}
		else  {
			if(speed < wiper) {
				System.out.println("Wipers turned on, speed = " + speed);
			}
		}
	}
}

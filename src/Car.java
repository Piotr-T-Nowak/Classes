
public class Car {

	protected double fuel;
	private String color;
	public int volume;
	public double maxCapacity;
	private Engine engine;
	public int direction;

//	Car() {
//		direction = 0;
//		engine = new Engine();
//	}

	Car(int volume, double maxCapacity, String color) {
		this.volume = volume;
		this.maxCapacity = maxCapacity;
		this.color = color;
		direction = 0;
		engine = new Engine();
	}

	public void setColor(String c) {
		if (!c.equals("pink")) {
			color = c;
		}
	}

	public String getColor() {
		return color;
	}

	public void printSpecification() {
		System.out.println("#########\n" + "color: " + color + "\n" + "volume: " + volume + "\n" + "fuel: " + fuel
				+ "\n" + "Max capacity: " + maxCapacity + "L");
	}

	public void drive(int time) {

		System.out.println("let's drive for " + time + " min");
		System.out.println("You burned " + burnFuel(time) + "L");
		if (fuel <= maxCapacity / 10) {
			System.out.println("TANK!");
		}

	}

	public void tank(int litters) {
		if (fuel + litters <= maxCapacity) {
			fuel += litters;
		} else {
			System.out.println("TOO MUCH FUEL");
			fuel = maxCapacity;
		}
	}

	private double burnFuel(int time) {
		// 6l / 100km
		// 60km / h
		double burnedFuel = engine.runForTime(time);
		if (fuel < burnedFuel) {
			System.out.println("YOU CANNOT DRIVE THAT LONG");
			return 0;
		} else {
			fuel -= burnedFuel;
			return burnedFuel;
		}
	}

	public void changeGear(int gear) {
		engine.gear = gear;
	}

	/*
	 * kierunkowskazy dodac tablica kierunkow swiata(4) String; zmienna kierunku
	 * (index tablicy [0 - 3]) funkcja prawo 1)wlacza kierunek (wypisz
	 * "tiktiktik") 2)skr�ca w prawo (zmienna kierunku +1) (pamietaj, ze 3 + 1
	 * -> 0) 3)wy��cza kierunek 4) wypisz w ktora strone aktualnie jedziesz
	 * funkcja lewo (tak samo jak prawo)
	 */

}

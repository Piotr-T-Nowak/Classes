
public class Car {

	private double fuel;
	private String color;
	public int volume;
	public double maxCapacity;

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
		}
		else {
			System.out.println("TOO MUCH FUEL");
			fuel = maxCapacity;
		}
	}
		

	private double burnFuel(int time) {
		// 6l / 100km
		// 60km / h
		double burnedFuel = time * 0.06;
		if (fuel < burnedFuel) {
			System.out.println("YOU CANNOT DRIVE THAT LONG");
			return 0;
		} else {
			fuel -= burnedFuel;
			return burnedFuel;
		}
	}
	/*
  kierunkowskazy dodac
	 * tablica kierunkow swiata(4) String; 
	 * zmienna kierunku (index tablicy [0 - 3])
	 * funkcja prawo
	 * 1)wlacza kierunek (wypisz "tiktiktik")
	 * 2)skrêca w prawo (zmienna kierunku +1) (pamietaj, ze 3 + 1 -> 0)
	 * 3)wy³¹cza kierunek
	 * 4) wypisz w ktora strone aktualnie jedziesz
	 * funkcja lewo (tak samo jak prawo)
	 */
	

}

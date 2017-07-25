
public class Petla {

	void odlicz(int liczba) {
	
		while (liczba >= 0) {
			System.out.print(liczba + "\t");
			liczba--;
		}
	}
	

	void print(int ileRazy, char znak) {
		int counter = 0;
		
		while(counter < ileRazy) {
			System.out.println(znak);
//			counter = counter + 1;
//			counter += 1;
			counter++;
		}
		
		System.out.println(counter);	//mozna, bo counter stworzone wczesniej (przed petla)
	}
	
//	to samo tylko for
	void printFor() {
		
		for(int counter = 0; counter < 5; counter++) {
			System.out.println("a");
		}
		
//		System.out.println(counter); // nie mozna, bo poza petla (a counter stworzone w petli)
	}
	
	//stworz funkcje, ktora dodaje liczby od 1 do n
	//np. sum(4) ma zwrocic 10 (bo 1+2+3+4=10)
	
	int sum(int maxLiczba) {
		int wynik = 0;
		int aktualnaLiczba = 1;
		while(aktualnaLiczba <= maxLiczba) { 
			wynik = wynik + aktualnaLiczba;
			aktualnaLiczba++;
		}
		return wynik;
	}
	
	
//	Za pomoca doch petli for wypisz tabelke wypelniona zerami 10 x 10
	void wypiszTabelkeZer() {
		
		for (int wiersz = 0; wiersz < 10; wiersz++) {
			
			for (int kolumna = 0; kolumna < 10; kolumna++) { 
				System.out.print("0 "); 
			}
			if (wiersz < 9) {
				System.out.println();
			}
		}
	}
	
	void tabliczkaMnozenia() {
		
		for (int wiersz = 1; wiersz <= 10; wiersz++) {
			
			for (int kolumna = 1; kolumna <= 10; kolumna++) { 
				
				System.out.print(kolumna * wiersz + "\t"); 
			}
			if (wiersz < 10) {
				System.out.println();
			}
		}
	}
	
	
//	### ZADANIE ###
//	1) stworz funkcje, ktora dodaje liczby od a do b
//	np. sum(4, 6) ma zwrocic 15 (bo 4+5+6=15)   // uzyj petli for
//	
	
	int liczby(int pierwsza , int druga){
		int wynik = 0;
		for (int counter = pierwsza; counter <= druga; counter++ ) {
			wynik = wynik + counter;
		}
		
		return wynik;
	}
	
//	2) stworz funkcje, ktora dodaje liczby od a do b, ale jeśli liczba jest podzielna przez 4 to jej nie dodaje
//	np. sum(3, 6) ma zwrocic 14 (bo 3+5+6=14)  - 4 omijamy!
//	
	int dzielnik(int first , int second) {
		int wynik = 0;
		int counter = first;
		while (counter <= second) {
			if (counter % 4 != 0) {
				wynik = wynik + counter;
			}
			counter++;
		}
	
		return wynik;
	}
	
	
	int dzielnikFor(int first , int second) {
		int wynik = 0;
		for (int counter = first; counter <= second; counter++) {
			if (counter % 4 != 0) {
				wynik = wynik + counter;	//wynik += counter;
			}
		}
	
		return wynik;
	}
	

	
//	3) stworz funkcje, ktora zwroci napis zlolzony z liczb 
//		-20 -15 -10 -5 0 3 6 9 12 15 18
//	(znajdź pattern) (tip: 2 x petla for)

	String dziwneLiczby() {
		String wynik = "";
		for (int minus = -20; minus < 0; minus++) {
			if (minus % 5 == 0) {
				wynik += minus + " ";	//to samo co: wynik = wynik + minus + " ";
			}
		}
		
		for (int counter = 0; counter <= 18; counter++) {
			if (counter % 3 == 0) {
				wynik += counter + " ";
			}
		}
		return wynik;
	}
	//Zad 3.b : Zrobic to samo, tylko bez uzycia znaku % (minus % 5 == 0) (nie zawsze musi byc minus++ -> moze byc co chcesz
	
	
//	Zad.4
	
	void wypisz() {
		
		for (int pierwsza = 1; pierwsza <= 5; pierwsza++) {

			for (int srodkowa = 1; srodkowa <= 5; srodkowa++) {
//				System.out.print(pierwsza + srodkowa);
				
				for (int trzecia = 1; trzecia <= 5; trzecia++) {
					System.out.print(pierwsza + "," + srodkowa + "," + trzecia + " ");
//					System.out.print(trzecia);
//					if (trzecia != 5) {
//						System.out.print(" " + pierwsza + srodkowa);
//					}
				}
				System.out.print("\n");	//enter albo tak
			}
			System.out.println();		//albo tak
		}
		
	}
	
//	zad. 5
	
	int znak(char litera) {
		int ascii = (int) litera;

//		Button b = (Button) findViewById(R.id.button_exit); (zwraca View)
		return ascii;
	}
	
//	zad. 6
	
	double avgOf3(int jeden, int dwa, int trzy) {
//		int sum = jeden + dwa + trzy;
//		double srednia = sum / 3.0;
//		
//		return srednia;
		return (jeden + dwa + trzy) / 3.0;
	}
}





	
	
	



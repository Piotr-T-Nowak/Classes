
public class Tablice {

	void test() {

		String[] imiona = new String[5];

		imiona[0] = "Piotrek";
		imiona[1] = "Kasia";
		imiona[4] = "Ostatni"; // index ostatniego elementu to rozmiar -1 (w tym
								// wypadku rozmiar =5, ostatni element =4)

		System.out.println(imiona[1]);
		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.println(imiona[i]);
		}
	}

	void tabliceLiczby() {

		int[] liczby = new int[10];
		// wpisz do tej tablicy liczby od 0 do 9 np: liczby[6] = 6
		for (int i = 0; i < liczby.length; i++) {
			liczby[i] = i;
		}
		printTab(liczby);
	}

	void printTab(int[] tab) {
		System.out.println("Tablica int: ");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
	}
	
//	void printTab(char[] tab) {
//		System.out.println("Tablica char: ");
//		for (int i = 0; i < tab.length; i++) {
//			System.out.print(tab[i] + " ");
//		}
//	}

	// ZADANIA /// ////

	// Tablice)
	// 1) Wpisz do tablicy liczby od 4 do 13
	// [0] -> 4 [1] ->5 [2]->6
	// 2) Wpisz do tablicy liczby 0, 2, 4, 6, 8, 10, 12
	// 3) Wpisz to tablicy znaki od 'a' do 'z'

	// 1)

	void od4Do13() {
		int[] jakas = new int[9];
		for (int i = 0; i < 9; i++) {
			jakas[i] = i + 4;
		}
		printTab(jakas);
	}
	// 2)
	// index 0 1 2 3 4 5...
	// wartosc 0 2 4 6 8 10...

	void parzyste() {
		int[] pare = new int[7];
		int parzyste = 0;
		for (int i = 0; i < pare.length; i++) {
			// pare[i] = i * 2; // jedno z rozwiazan
			pare[i] = parzyste;
			parzyste += 2;
			System.out.println(pare[i] + " ");

		}
	}

	// 3)

	void alfabet() {
		char alfabet[] = new char[26];
		char literka = 'a';

		for (int i = 0; i < alfabet.length; i++) {
			alfabet[i] = literka;
			literka++;
		}
//		printTab(alfabet); //nie mozna, bo printTab przyjmuje int, a to jest tablica char
//		for (int i = 0; i < alfabet.length; i++) {
//			System.out.print(alfabet[i] + " ");
//		}
//		printTab(alfabet); //juz mozna, bo dodalismy printTab(char [])

	}
}

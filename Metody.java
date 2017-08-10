
public class Metody {

	void pierwsza() {
		System.out.println("pierwsza");
	}
	
//	void kwadrat(int x) {
//		System.out.println("x*x=" + x*x);
//	}
	
	int kwadrat(int x) {
		System.out.println("mam wynik:" + x);
		return x*x;
	}
	
	int dodaj(int x, int y) {
		return x + y;
	}
	
	void fun() {
		System.out.println("Nic");
	}
	
//	int fun() { //nie mozna, bo takie same nazwy i parametry - wartosc zwracana nie ma znaczenia tu
//		System.out.println("Nic");
//		return 0;
//	}
	
	void fun(int a) {
		System.out.println("Nic2");
	}
	
//	void fun(int a, int b) {
//		System.out.println("Nic3");
//	}
	
	void fun(int a, double b) {
		System.out.println("Nic4");
	}
	
	void fun(double a, int b) {
		System.out.println("Nic5");
	}
	
}

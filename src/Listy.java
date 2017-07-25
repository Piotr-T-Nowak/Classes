import java.util.ArrayList;
import java.util.List;

public class Listy {

	void test() {
		List<String> imiona = new ArrayList<>();	//tablica int'ow to <Integer> (a nie <int>)
		imiona.add("Piotrek");
		imiona.add("Karolina");
		imiona.add("Wojtek");
		
		printList(imiona);
		
		imiona.remove(0);
		
		printList(imiona);
		
		imiona.remove(1);	//teraz juz 'Wojtek" jest 1
		
		printList(imiona);
		
	}
	
	void printList(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
	void od4do13() {
		List<Integer> duzo = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			duzo.add(i + 4);
		}
		printList(duzo);
		
	}
	void alfabet() {
		List<Integer> literki = new ArrayList<>();
		for (int i = 0; i < 26; i++) {
			char yo = 'a';
			literki.add(yo + 1);
			yo += 1;
		}
		printList(literki);
	}
	
}

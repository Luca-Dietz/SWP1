import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		int[] arr = { 4, 6, 3, 7, 1, 2 }; // zuf�lliges Array
		System.out.println("Ungeordnetes Array: ");
		System.out.println(Arrays.toString(arr)); // Ausgabe ungeordnetes Array
		System.out.println("Geordnetes Array: ");
		System.out.println(Arrays.toString(sort(arr))); // Ausgabe geordnetes Array
	}

	public static int[] sort(int x[]) { // Methode zum Ordnen eines Array du Bubblesort
		for (int i = x.length; i > 1; i--) { // Ganze L�nge des Arrays wird durchgegangen
			for (int a = 0; a < i - 1; a++) { // Vom Ersten Index bis zum letzten wird �berpr�ft
				if (x[a] > x[a + 1]) { // Falls vorheriger Wert gr��er ist als n�chster wird getauscht
					int zwischenWert = x[a]; // Zwischenwert damit x[a] �berschrieben werden
					x[a] = x[a + 1]; // kann ohne das Wert f�r x[a+1] verloren geht
					x[a + 1] = zwischenWert;
				}
			}
		}
		return x; // geordnetes Array
	}

}

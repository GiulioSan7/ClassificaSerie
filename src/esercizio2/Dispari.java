package esercizio2;
//Scrivere un programma che restituisca il valore corrispondente alla somma di numeri dispari

//presenti all’interno di un array.

public class Dispari {
	private int arr[], sommaD;

	public Dispari() {
		arr = new int[7];
	}

	public void sommaNumeri() {
		arr[0] = 9;
		arr[1] = 30;
		arr[2] = 11;
		arr[3] = 17;
		arr[4] = 2;
		arr[5] = 23;
		arr[6] = 18;

		for (int x = 0; x < arr.length; ++x) {
			if (arr[x] % 2 != 0) {
				sommaD = arr[x] + sommaD;
			} else {
				System.out.println("Il numero di indice " + x + " dell'array è un numero pari");
			}
		}
		System.out.println("La somma dei numeri dispari è " + sommaD);
	}
}

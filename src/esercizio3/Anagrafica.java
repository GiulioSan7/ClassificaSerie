package esercizio3;

//Scrivere un programma che permette di inserire una serie di nomi finche' non viene inserito FINITO 
//come nome. 
//Al termine dell'inserimento dovra' comparire la lista di tutti i nomi inseriti e quante volte e'
//stato inserito.
import java.util.Scanner;

public class Anagrafica {
	private String arr[], nomi, finitoP;
	private int indice;

	public Anagrafica() {

		arr = new String[40];
		finitoP = "FINITO";
	}

	public void inserimento() {
		Scanner scan = new Scanner(System.in);
		nomi = scan.next();
	}

	public void appello() {
		System.out.println("Inizio dell'appello");
		for (int x = 0, x1 = 1; x == 0; ++x1, ++indice) {
			this.inserimento();
			System.out.println("Il " + x1 + " nome che andiamo a stampare è " + nomi);
			arr[indice]=nomi;

			if (nomi.equals(finitoP)) {
				x++;
				System.out.println("Il programma è terminato");
			} else if (true) {
				System.out.println("Prossimo nome");
			}
		}
	}
	
}

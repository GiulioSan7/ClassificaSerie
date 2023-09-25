package esercizio3;
//Scrivere un programma che permette di inserire una serie di nomi finche' non viene inserito FINITO come nome. 

//Al termine dell'inserimento dovra' comparire la lista di tutti i nomi inseriti e quante volte e' stato inserito.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ModoCorretto {
	private String n, finitoP;

	public ModoCorretto() {
		finitoP = "FINITO";
	}

	public void inserimento() {
		// L'interfaccia Map dichiara sempre 2 tipi di parametri
		Map<String, Integer> contaNomi = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Inseriamo i nomi:");
		for (; true;) {
			n = scan.next();
			if (n.equals(finitoP)) {
				// Verifica di uguaglianza.
				System.out.println("il programma è terminato");
				break;
			} else {
				// Con Put inserisce nella Collection la nuova coppia chiave/valore
				contaNomi.put(n, contaNomi.getOrDefault(n, 0) + 1);
				// il getOrDefault viene utilizzato per contare quante volte si è ripetuto un
				// nome
			}
		}
		System.out.println("Lista dei nomi inseriti:");
		for (String n : contaNomi.keySet()) {
			// Il metodo keySet serve per iterare la Map.
			System.out.println(n + " - " + contaNomi.get(n) + " volte");
		}
	}
}

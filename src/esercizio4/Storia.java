package esercizio4;

//Scrivere un programma che permette di individuare e contare le parole all'interno di
//una stringa e che ne restituisca il numero in output.
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Storia {
	private String testo;

	public Storia() {

	}

	public void setTesto(String testo) {
		this.testo = testo;
		System.out.println("Questo è il testo originale : " + testo);
		System.out.println("  <----------------------------------->");
		System.out.println("Dividiamo il testo in parole: ");
		// Divide la stringa in parole
		String[] words = testo.split("\\s");
		// Restituisce un array di stringhe.

		System.out.println(Arrays.toString(words));
		// Metodo che ridimensiona l'array in stringhe.
		Map<String, Integer> contaParole = new HashMap<>();
		for (String parola : words) {
			// Inserimento di valori tramite il metodo Put.
			contaParole.put(parola, contaParole.getOrDefault(parola, 0) + 1);
			// Con il metodo getOrDefault serve contare quante volte una parola si ripete.
		}
		System.out.println("Risultato conteggio delle parole:");
		// Il metodo keySet serve per iterare le chisvi della Map.
		for (String parole : contaParole.keySet()) {
			System.out.println(parole + " - " + contaParole.get(parole) + " volte");

		}

	}
}

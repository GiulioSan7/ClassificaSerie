package Libreria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Test1 {
	public static void main(String args[]) {
		// Lista ogg=new Lista();
		// ogg.inserimento();
		Biblioteca ogg1 = new Biblioteca("Essere o non essere", "Frank");
		ArrayList<Biblioteca> listaLibri = new ArrayList<>();
		listaLibri.add(new Biblioteca("Mollica o senza", "Donatrio"));
		listaLibri.add(new Biblioteca("Manuale Java", "Claudio Cesari"));
		listaLibri.add(new Biblioteca("Il giro del mondo", "Franco k"));
		listaLibri.add(new Biblioteca("Scarface", "Tony montana"));
		listaLibri.add(new Biblioteca("Napoli calcio", "De laurentis"));
		listaLibri.add(new Biblioteca("Avatar","alieno"));
		// Comparator<Biblioteca>comparatorePers=
		Collections.sort(listaLibri);
		//Ordina la lista in ordine alfabetico.
		System.out.println("Titoli libri messi in ordine alfabetico:");
		// Foreach
		for (Biblioteca bib : listaLibri) {
			System.out.println(bib.getTitolo() + " - " + bib.getAutore());
			
		}
		// Metodi arraylist
		// Aggiungere degli elementi
		listaLibri.add(new Biblioteca("Lionel Messi il fenomeno", "Lio Messi"));
		listaLibri.add(new Biblioteca("Milano demons", "Shiva"));
		// Modificare elementi
		 listaLibri.set(4,new Biblioteca("INdiana jones","cris nolad"));
		 System.out.println("Libro modificato");
		 System.out.println(listaLibri.get(4));

		// Eliminare elementi
		listaLibri.remove(3);
	}

}
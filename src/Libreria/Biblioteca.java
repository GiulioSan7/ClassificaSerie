package Libreria;

import java.util.Comparator;

//è un interfaccia funzionale 
//essa consente di definire diversi criteri di ordinamento senza dover modificare la classe stessa.
public class Biblioteca implements Comparable<Biblioteca> {
	private String titolo;
	private String autore;

	public Biblioteca(String titolo, String autore) {
		this.titolo = titolo;
		this.autore = autore;

	}

	public String getTitolo() {
		return titolo;

	}

	public String getAutore() {
		return autore;
	}

	public int compareTo(Biblioteca altroLibro) {
		return this.titolo.compareTo(altroLibro.getTitolo());
	}
}

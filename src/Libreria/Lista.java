package Libreria;
//Inserire una lista (statica) di Libri con titolo e autore .
// Ordina i  libri per titolo , e ordina i libri per autore.
import java.util.ArrayList;
public class Lista {

	
	public Lista() {
		
	}
	public void inserimento() {
		ArrayList <String> titolo=new ArrayList<String>();
		titolo.add("Il giro del mondo");
		titolo.add("Mollica o senza");
		titolo.add("Napoli Calcio");
		titolo.add("New Martina Cover");
		
		ArrayList<String> autore=new ArrayList<String>();
		autore.add("Francesco russo");
		autore.add("Donato");
		autore.add("De laurentis");
		autore.add("Martina");
		
	}
	public void inserimento2() {
		ArrayList<ArrayList<String>> libri=new ArrayList();
		
		
	}
}

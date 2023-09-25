package fileJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LavorareFileJava {
	public static void main(String args[]) {
		
		//FILE= SERVE PER CREARE O VERIFICARE SE IL FILE ESISTE.
		
		File file = new File("prova.txt");

		if (file.exists()) {
			System.out.println("Il file esiste");
			System.out.println(file.getPath());
			// indica il perametro nella creazione del reference
			System.out.println(file.getAbsolutePath());
			// Indica il nome del file sul deskptop
			System.out.println(file.isFile());
			//Per verficare se realmente è un file.
			//file.delete();
			//per eliminare il file.
		} else {
			System.out.println("Il file non esiste");
		}
		
}}
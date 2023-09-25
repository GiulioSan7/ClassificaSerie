package fileJava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLettura {
	public static void main(String args[]) {
		
		//FILE READER= SERVE PER LEGGERE IL TESTO DI UN FILE.
		
		try {

			FileReader reader = new FileReader("prova.txt");
			int data = reader.read();
			System.out.println(data);
			// Questo metodo restituisce i codice ascii della prima lettera del file.
			while (data != -1) {
				System.out.print((char) data);
				data = reader.read();
				//In questo caso possiamo stampare il codice all'interno del file effetuando un casting 
				//in char in modo di visualizzare il testo all'interno.
	}
		} catch (FileNotFoundException file) {
			file.printStackTrace();

		} catch (IOException io) {
			// Eccezione per il metodo read.
			io.printStackTrace();

		}
	}
}
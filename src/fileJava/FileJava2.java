package fileJava;

import java.io.FileWriter;
import java.io.IOException;

public class FileJava2 {
public static void main(String args[]) {
	
	// FILE WRITER= SERVE PER SCRIVERE ALL INTERNO DI UN FILE.
	
	try {
		FileWriter write=new FileWriter("prova.txt");
		//IL fileWriter richiede di essere chiuso sempre tra un blocco try.
		write.write("Domani è sabato");
		//write sostituisce tutto il contenuto all interno del file
	    write.append("\n ma ho la febbre");
	    // con appended invece aggiungiamo del codice o del testo
	    write.append("\n uffaaaa");
	    //\n = manda accappo
	    write.close();
	    //serve per chiudere il file.
	    
	}
		catch(IOException ogg) {
			ogg.printStackTrace();
		}
}
}

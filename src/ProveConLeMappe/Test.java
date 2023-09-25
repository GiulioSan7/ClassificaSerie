package ProveConLeMappe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String args[]) {
		ProvaHash ogg = new ProvaHash();
		ogg.provare();
		List<ProvaHash> anni = new ArrayList();
		anni.add(new ProvaHash(18, "Frank"));
		anni.add(new ProvaHash(20, "Miche"));
		anni.add(new ProvaHash(15, "Franklin"));
		anni.add(new ProvaHash(19, "Giulio"));
		anni.add(new ProvaHash(12, "Gabriel"));
		//QUA MODIFICO LA LISTA IN UNA STREAM FILTER.
		List<ProvaHash> personeMaggioriDi18 = anni.stream().filter(provaHash -> provaHash.getEta() >= 18)
				.collect(Collectors.toList());
		 personeMaggioriDi18.forEach(System.out::println);
		 //QUESTO SERVE PER STAMPARE I RISULTATI DATI DA UN FILTRO.
		 //SPIEGAZIONE SU FILE.WORD

	}
}

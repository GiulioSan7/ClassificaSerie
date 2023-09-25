package SeriaA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String args[]) {

		Squadra inter = new Squadra("Inter", 12, 13, 1);
		Squadra juve = new Squadra("juve", 10, 10, 2);
		Squadra milan = new Squadra("Milan", 9, 20, 1);
		Squadra lecce = new Squadra("Lecce", 8, 11, 1);
		Squadra napoli = new Squadra("Napoli", 7, 15, 3);
		Squadra frosinone = new Squadra("Frosinone", 7, 13, 1);
		Squadra torino = new Squadra("Torino", 7, 13, 1);
		Squadra fioretina = new Squadra("Fiorentina", 7, 9, 1);
		Squadra verona = new Squadra("Verona", 6, 13, 1);
		Squadra atatalanta = new Squadra("Atalanta", 6, 13, 1);
		Squadra bologna = new Squadra("Bologna", 5, 7, 1);
		Squadra roma = new Squadra("Roma", 4, 13, 1);
		Squadra genova = new Squadra("Genova", 4, 13, 1);
		Squadra monza = new Squadra("Monza", 4, 13, 1);
		Squadra lazio = new Squadra("Lazio", 3, 13, 1);
		Squadra udine = new Squadra("Udine", 3, 13, 1);
		Squadra sassuolo = new Squadra("sassuolo", 3, 13, 1);
		Squadra cagliari = new Squadra("Cagliari", 2, 13, 1);
		Squadra salernitana = new Squadra("Salernitana", 2, 13, 1);
		Squadra empoli = new Squadra("Empoli", 0, 13, 1);
		Map<String, Squadra> squadreMap = new HashMap<>();

		squadreMap.put(inter.getNomeSquadra(), inter);
		squadreMap.put(juve.getNomeSquadra(), juve);
		squadreMap.put(milan.getNomeSquadra(), milan);
		squadreMap.put(lecce.getNomeSquadra(), lecce);
		squadreMap.put(napoli.getNomeSquadra(), napoli);
		squadreMap.put(frosinone.getNomeSquadra(), frosinone);
		squadreMap.put(torino.getNomeSquadra(), torino);
		squadreMap.put(fioretina.getNomeSquadra(), fioretina);
		squadreMap.put(verona.getNomeSquadra(), verona);
		squadreMap.put(atatalanta.getNomeSquadra(), atatalanta);
		squadreMap.put(bologna.getNomeSquadra(), bologna);
		squadreMap.put(roma.getNomeSquadra(), roma);
		squadreMap.put(genova.getNomeSquadra(), genova);
		squadreMap.put(monza.getNomeSquadra(), monza);
		squadreMap.put(lazio.getNomeSquadra(), lazio);
		squadreMap.put(udine.getNomeSquadra(), udine);
		squadreMap.put(sassuolo.getNomeSquadra(), sassuolo);
		squadreMap.put(cagliari.getNomeSquadra(), cagliari);
		squadreMap.put(salernitana.getNomeSquadra(), salernitana);
		squadreMap.put(empoli.getNomeSquadra(), empoli);

		// Estrai tutti i valori dalla mappa (le squadre)
		List<Squadra> squadre = new ArrayList<>(squadreMap.values());
		// Ordina la lista in base al numero di punti in ordine decrescente
		squadre.sort(Comparator.comparingInt(Squadra::getPunti).reversed());

		for (int x = 0, x1 = 1; x < squadre.size(); ++x, ++x1) {

			if (x <= 3) {
				System.out.println("La " + x1 + " squadra in zona Champions è:" + squadre.get(x));
			} else if (x >= 4 && x <= 6) {
				System.out.println("La " + x1 + " squadra in classifica è in zona EuropaLeague è:" + squadre.get(x));

			} else if (x >= 17 && x < squadre.size()) {
				System.out.println("La " + x1 + " squadra in classifica è in zona retrocessione è:" + squadre.get(x));

			}

		}
		System.out.println();
		System.out.println("Visualizza squadre con rispettivi dati:");
		List<String> squadreDiInteresse = List.of("Lecce", "Atalanta", "Fiorentina", "Bologna", "Udinese");
		for (String nomeSquadra : squadreDiInteresse) {
			Squadra squadra = squadreMap.get(nomeSquadra);
			if (squadra != null) {
				System.out.println();
				System.out.println("Nome Squadra: " + squadra.getNomeSquadra());
				System.out.println("Punti: " + squadra.getPunti());
				System.out.println("Gol Fatti: " + squadra.getRetiSegnate());
				System.out.println("Gol Subiti: " + squadra.getRetiSubite());
			}
		}
		 List<Squadra> squadreInteresse = new ArrayList<>();
	        for (String nomeSquadra : squadreDiInteresse) {
	            Squadra squadra = squadreMap.get(nomeSquadra);
	            if (squadra != null) {
	                squadreInteresse.add(squadra);
	            }
	        }
	        squadreInteresse.sort(Comparator.comparingInt(Squadra::getRetiSegnate).reversed());
	        System.out.println("Squadre di interesse ordinate per gol fatti:");
	        for (Squadra squadra : squadreInteresse) {
	        	 System.out.println();
	            System.out.println("Nome Squadra: " + squadra.getNomeSquadra());
	            System.out.println("Gol Fatti: " + squadra.getRetiSegnate());
	            System.out.println("Punti: " + squadra.getPunti());
	           
	           
	}
}
}
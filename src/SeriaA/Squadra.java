package SeriaA;
//Esercizio sulle mappe:
//In base all'attuale classifica di serie A, creare un algoritmo per stampare a video:
//1) tutte le squadre che sono in piazzamento champions
//2) tutte le squadre che sono in piazzamento europa league
//3) tutte le squadre che sono in zona retrocessione
//4) punti e differenza reti delle seguenti squadre: Lecce, Atalanta, Fiorentina, Bologna,
//                                                 Udinese (con l'utilizzo di una HashMap).

public class Squadra {
	private String nomeSquadra;
	private Integer punti;
	private Integer retiSegnate;
	private Integer retiSubite;

	public Squadra(String nomeSquadra,Integer punti,Integer retiSegnate,Integer retiSubite) {
		this.nomeSquadra=nomeSquadra;
		this.punti=punti;
		this.retiSegnate=retiSegnate;
		this.retiSubite=retiSubite;
		

	}

	public String getNomeSquadra() {
		return nomeSquadra;
	}

	public void setNomeSquadra(String nomeSquadra) {
		this.nomeSquadra = nomeSquadra;
	}

	public Integer getPunti() {
		return punti;
	}

	public void setPunti(Integer punti) {
		this.punti = punti;
	}

	public Integer getRetiSegnate() {
		return retiSegnate;
	}

	public void setRetiSegnate(Integer retiSegnate) {
		this.retiSegnate = retiSegnate;
	}

	public Integer getRetiSubite() {
		return retiSubite;
	}

	public void setRetiSubite(Integer retiSubite) {
		this.retiSubite = retiSubite;
	}
	@Override
	 public String toString() {
	        return  nomeSquadra + ", Punti: " + punti;
	}
}

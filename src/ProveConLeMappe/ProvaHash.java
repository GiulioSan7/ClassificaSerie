package ProveConLeMappe;

import java.util.HashMap;
import java.util.Map;

public class ProvaHash {
	private Integer eta;
	private String nome;

	public ProvaHash() {

	}

	public ProvaHash(Integer eta, String nome) {
		this.eta = eta;
		this.nome = nome;
	}

	public void provare() {
		Map<Integer, String> citta = new HashMap<>();
		citta.put(80017, "Melito di Napoli");
		citta.put(80112, "scampia");
		citta.put(80751, "Miano");
		citta.put(80889, "casale");

		System.out.println(citta.get(80017));
		citta.put(80018, "Caivano");
		for (Map.Entry<Integer, String> cittax : citta.entrySet()) {
			System.out.println("Codice Postale: " + cittax.getKey() + ", Città: " + cittax.getValue());
			// SPIEGAZIONE SU FILE.WORD
		}

		citta.remove(80112);

	}

	public Integer getEta() {
		return eta;
	}

	public void setEta(Integer eta) {
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome + ", eta=" + eta;
	}
}

package calcolatrice;

//usa lo switch per fare la calcolatrice.
import java.util.Scanner;

public class Metodo2 {

	private char c;
	private double v, v1;

	public Metodo2() {
		System.out.println("Reinserire i nuovi valori per le operazioni");
	}

	public void inserisciNumeri() {
		System.out.println("Per le operazione + mettere a,per - mettere b,per * mettere c,per / mettere d");
		Scanner scan = new Scanner(System.in);
		System.out.println("La calcolatrice chiede di inserire il primo valore: ");
		v = scan.nextDouble();
		System.out.println("La calcolatrice chiede di inserire il secondo valore: ");
		v1 = scan.nextDouble();
		System.out.println("Scegli l'operazione da far eseguire ai due valori");

	}

	public void verifica() {
		int a = 0;
		int b = 1;
		System.out.println("Questa è la calcolatrice di Giulio Sannino");
		while (a == 0) {
			this.inserisciNumeri();

			Scanner scan1 = new Scanner(System.in);
			c = scan1.next().charAt(0);

			b++;

			char ris = c;
			double risultato;
			double verificaRis;
			int risultato1;
			switch (ris) {
			case 'a':
				risultato = v + v1;
				verificaRis = risultato % 2;
				System.out.println("Operazione numero " + b);
				if (verificaRis == 0) {
					risultato1 = (int) (v + v1);
					System.out.println("Risultato operazione " + risultato1);
				} else
					System.out.println("Risultato operazione " + risultato);
				break;

			case 'b':
				risultato = v - v1;
				System.out.println("Operazione numero " + b);
				verificaRis = risultato % 2;

				if (verificaRis == 0) {
					risultato1 = (int) (v - v1);
					System.out.println("Risultato operazione " + risultato1);
				} else
					System.out.println("Risultato operazione " + risultato);

				break;
			case 'c':
				risultato = v * v1;

				System.out.println("Operazione numero " + b);
				verificaRis = risultato % 2;

				if (verificaRis == 0) {
					risultato1 = (int) (v * v1);
					System.out.println("Risultato operazione " + risultato1);
				} else
					System.out.println("Risultato operazione " + risultato);
				break;
			case 'd':
				risultato = v / v1;

				System.out.println("Operazione numero " + b);
				verificaRis = risultato % 2;

				if (verificaRis == 0) {
					risultato1 = (int) (v / v1);
					System.out.println("Risultato operazione " + risultato1);
				} else
					System.out.println("Risultato operazione " + risultato);
				break;
			case 'e':
				a++;
				System.out.println("Operazione inesistente, fine delle operazioni");
				break;

			}
		}
	}
}

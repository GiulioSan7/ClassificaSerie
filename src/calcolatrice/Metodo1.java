package calcolatrice;


	//Creare una calcolatrice che fa inserire due numeri e in base all'operazione che viene scelta esegue il
	// calcolo.
	import java.util.Scanner;
	public class Metodo1 {
	
		private int x, x1, op, risultato;

		public Metodo1() {

		}

		public void inserisciNumeri() {
			System.out.println("Questa è la calcolatrice di Giulio");
			Scanner scan = new Scanner(System.in);
			System.out.println("La calcolatrice chiede di inserire il primo valore: ");
			x = scan.nextInt();
			System.out.println("Inserisci 1 per +,2 per -,3 per *,4 per / .");
			op = scan.nextInt();
			System.out.println("La calcolatrice chiede di inserire il secondo valore: ");
			x1 = scan.nextInt();

		}

		public void eseguiOperazione() {
			// if (op < 1 || op > 4) {
			// System.out.println("Rinserisci i numeri");
			// this.inserisciNumeri();
			//for (int v = 0; x1 == v && op == 4; x1++) {
			//	System.out.println("Si è verificato un problema, torna al menu principale");
			//	this.inserisciNumeri();
			//	if(0 == x1 && op == 4) {
				
			//	System.out.println("Si è verificato un problema, torna al menu principale");
				
		//	}
				
			 if (op == 1) {
				risultato = x + x1;
				System.out.println("Il risultato è: " + risultato);
			} else if (op == 2) {
				risultato = x - x1;
				System.out.println("Il risultato è: " + risultato);
			} else if (op == 3) {
				risultato = x * x1;
				System.out.println("Il risultato è: " + risultato);
			} else if (op == 4) {
				try {
					risultato = x / x1;
				
				System.out.println("Il risultato è: " + risultato);
				}
				catch(ArithmeticException ogg) {
					System.out.println("la divisione per zero non può essere effettuata");
				}
			}
			
			}
		}


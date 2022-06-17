package jana60.biglietteria;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Benvenuto!");
		System.out.print("Inserisci il numero di chilometri da percorrere: ");
		double kilometri = Double.parseDouble(scan.nextLine());
		System.out.print("Inserisci la tua età");
		int etaPasseggero = Integer.parseInt(scan.nextLine());
		
		Biglietto newTicket = new Biglietto(kilometri, etaPasseggero);
		
		System.out.println("Ecco il tuo biglietto:");
		System.out.println("Distanza: " + newTicket.getKilometri() + " km");
		System.out.println("Età passeggero: " + newTicket.getEtaPasseggero());
		System.out.println("Prezzo: " + newTicket.calcolaPrezzo() + "€");
		
        scan.close();
	}

}

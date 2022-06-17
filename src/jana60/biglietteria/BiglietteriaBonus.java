package jana60.biglietteria;

import java.util.Scanner;

public class BiglietteriaBonus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Biglietto[] ticketList = new Biglietto[10];
		
		ShowMenuBiglietteriaBonus menu = new ShowMenuBiglietteriaBonus("Buy ticket", "Quit");
		
		menu.showMenu();
		
		String yourChoise = scan.nextLine();
		
		while(!yourChoise.equalsIgnoreCase(menu.getOp1()) && !yourChoise.equalsIgnoreCase(menu.getOp2())) {
			System.out.println("Invalid option! Please choise one of menu voices");
			yourChoise = scan.nextLine();
		}
		
		int boughtTicket = 0;
		
		while(yourChoise.equalsIgnoreCase(menu.getOp1())) {
			System.out.print("Enter distance: ");
			double kilometri = Double.parseDouble(scan.nextLine());
			System.out.print("Enter your age");
			int etaPasseggero = Integer.parseInt(scan.nextLine());
			
			Biglietto newTicket = new Biglietto(kilometri, etaPasseggero);
			ticketList[boughtTicket] = newTicket;
			boughtTicket ++;
			
			menu.showMenu();
			yourChoise = scan.nextLine();
			
			if(boughtTicket > 9) {
				System.out.println("You can't buy ticket anymore, you bought the max for person!");
				yourChoise = menu.getOp2();
			}
		}
		
		if(yourChoise.equalsIgnoreCase(menu.getOp2()) && boughtTicket > 0) {
			for(int i = 0; i < boughtTicket; i++) {
				System.out.println("Biglietto " + (i+1));
				System.out.println("Distanza: " + ticketList[i].getKilometri() + " km");
				System.out.println("Età passeggero: " + ticketList[i].getEtaPasseggero());
				System.out.println("Prezzo: " + ticketList[i].calcolaPrezzo() + "€");
				
			}
			System.out.println("Thanks for buying our ticket. See you soon!");
		}else {
			System.out.println("Thanks. I hope you'll enjoy us next time!");
		}
		
        scan.close();
	}

}

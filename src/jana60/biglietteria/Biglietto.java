package jana60.biglietteria;

import java.text.DecimalFormat;

public class Biglietto {
	
	//attributi
	private double kilometri;
	private int etaPasseggero;
	
	
	//costruttori
	public Biglietto(double kilometri, int etaPasseggero) {
		super();
		this.kilometri = kilometri;
		this.etaPasseggero = etaPasseggero;
	}
	
	
	//getters and setters
	public double getKilometri() {
		return kilometri;
	}

    public int getEtaPasseggero() {
		return etaPasseggero;
	}


    //altri metodi
	public double calcolaPrezzo() {
		double prezzo = kilometri*0.21;
		if(etaPasseggero < 18) {
			prezzo -= (prezzo/100)*20;
		}else if(etaPasseggero > 65) {
			prezzo -= (prezzo/100)*40;
		}
		
		return prezzo;
	}
	
	public String stampaPrezzo() {
		DecimalFormat df = new DecimalFormat(".00");
		return df.format(calcolaPrezzo());
	}

}

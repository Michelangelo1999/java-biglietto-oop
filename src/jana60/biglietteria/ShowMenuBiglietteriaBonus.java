package jana60.biglietteria;

public class ShowMenuBiglietteriaBonus {
	
	private String messaggioIniziale;
	private String opzione1;
	private String opzione2;
	
	public ShowMenuBiglietteriaBonus(String opzione1, String opzione2) {
		super();
		messaggioIniziale = "Welcome!";
		this.opzione1 = opzione1;
		this.opzione2 = opzione2;
	}
	
	public String getOp1() {
		return opzione1;
	}
	
	public String getOp2() {
		return opzione2;
	}
	
	public void showMenu() {
		System.out.println(messaggioIniziale);
		System.out.println(opzione1);
		System.out.println(opzione2);
	}
	
	

}

package bfw.risiko;

public class Spiel {
	private int austauschBonusAktuell;
	private int austauschBonusListe;
	private Spieler spieler;
	
	
	public Spiel(int austauschBonusAktuell,int austauschBonusListe, Spieler spieler ) {
		this.austauschBonusAktuell = austauschBonusAktuell;
		this.austauschBonusListe = austauschBonusListe ;
		this.spieler = spieler;
	}
	
	public static void main(String[] args) {
		
	}
	
	
	
	
	
	public int getAustauschBonusAktuell() {
		return austauschBonusAktuell;
	}
	public void setAustauschBonusAktuell(int austauschBonusAktuell) {
		this.austauschBonusAktuell = austauschBonusAktuell;
	}
	public int getAustauschBonusListe() {
		return austauschBonusListe;
	}
	public void setAustauschBonusListe(int austauschBonusListe) {
		this.austauschBonusListe = austauschBonusListe;
	}
	public Spieler getSpieler() {
		return spieler;
	}
	public void setSpieler(Spieler spieler) {
		this.spieler = spieler;
	}
}

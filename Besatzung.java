package Risiko;

public class Besatzung {
	private int anzahl;
	private Spieler spieler;
	private int bonus;
	
	
	public Besatzung(int anzahl, Spieler spieler, int bonus) {
		this.anzahl = anzahl;
		this.spieler = spieler;
		this.bonus = bonus;
	}
	
	
	
	
	
	
	
	public int getAnzahl() {
		return anzahl;
	}
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	public Spieler getSpieler() {
		return spieler;
	}
	public void setSpieler(Spieler spieler) {
		this.spieler = spieler;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}

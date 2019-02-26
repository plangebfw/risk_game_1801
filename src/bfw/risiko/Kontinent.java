package bfw.risiko;

public class Kontinent {
	private String name;
	private Land laenderListe;
	private Spieler spieler;
	
	
	public Kontinent(String name,Land laenderListe,  Spieler spieler) {
		this.name = name;
		this.laenderListe = laenderListe;
		this.spieler = spieler;
	}
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Land getLaenderListe() {
		return laenderListe;
	}
	public void setLaenderListe(Land laenderListe) {
		this.laenderListe = laenderListe;
	}
	public Spieler getSpieler() {
		return spieler;
	}
	public void setSpieler(Spieler spieler) {
		this.spieler = spieler;
	}
}

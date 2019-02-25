package Risiko;

public class Land {
	private String name;
	private Kontinent kontinent;
	private Land nachbarn;
	private Spieler spieler;
	
	
	
	public Land(String name,Kontinent kontinent, Land nachbarn,  Spieler spieler) {
		this.name = name;
		this.kontinent = kontinent;
		this.nachbarn = nachbarn;
		this.spieler = spieler;
	}
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Kontinent getKontinent() {
		return kontinent;
	}
	public void setKontinent(Kontinent kontinent) {
		this.kontinent = kontinent;
	}
	public Land getNachbarn() {
		return nachbarn;
	}
	public void setNachbarn(Land nachbarn) {
		this.nachbarn = nachbarn;
	}
	public Spieler getSpieler() {
		return spieler;
	}
	public void setSpieler(Spieler spieler) {
		this.spieler = spieler;
	}
}

package Risiko;

public class Aufgabenkarte extends Spielkarte {
	private String aufgabe;

	public Aufgabenkarte(String aufgabe) {
		this.aufgabe = aufgabe;
		
	}
	
	
	
	
	public String getAufgabe() {
		return aufgabe;
	}

	public void setAufgabe(String aufgabe) {
		this.aufgabe = aufgabe;
	}
}

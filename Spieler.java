package Risiko;

public class Spieler {
	private String name;
	private String farbe;
	private Rolle rolle;
	private Land besetzteLaender;
	private Spielkarte spielkarten;
	
	
	public Spieler(String name, String farbe, Rolle rolle, Land besetzteLaender, Spielkarte spielkarten) {
		this.name = name;
		this.farbe = farbe ;
		this.rolle = rolle;
		this.besetzteLaender = besetzteLaender;
		this.spielkarten = spielkarten;
	}
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public Rolle getRolle() {
		return rolle;
	}
	public void setRolle(Rolle rolle) {
		this.rolle = rolle;
	}
	public Land getBesetzteLaender() {
		return besetzteLaender;
	}
	public void setBesetzteLaender(Land besetzteLaender) {
		this.besetzteLaender = besetzteLaender;
	}
	public Spielkarte getSpielkarten() {
		return spielkarten;
	}
	public void setSpielkarten(Spielkarte spielkarten) {
		this.spielkarten = spielkarten;
	}
}

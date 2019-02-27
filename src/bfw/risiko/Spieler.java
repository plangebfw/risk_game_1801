package bfw.risiko;

/**
 * <h1>Spieler</h1>
 * <p>
 * Der Spieler des Risiko-Spiels.
 * Hat einen Namen, eine Farbe, besitzt Länder und Spielkarten.
 * Kann die Rolle von Angreifer oder Verteidiger annehmen.
 *
 * @since 2019-02-25
 */
public class Spieler {
	/**
	 * Der Name des Spielers.
	 */
	private String name;
	/**
	 * Die Farbe des Spielers.
	 */
	private String farbe;
	/**
	 * Die Rolle des Spielers.
	 */
	private Rolle rolle;
	/**
	 * Die Liste der Länder, die der Spieler besitzt.
	 */
	private Land[] besetzteLaender;
	/**
	 * Die Liste der Spielkarten, die der Spieler besitzt.
	 */
	private Spielkarte[] spielkarten;

	/**
	 * Erstellt einen neuen Spieler.
	 * @param name Name des Spielers
	 * @param farbe Farbe des Spielers
	 * @param rolle Rolle des Spielers
	 * @param besetzteLaender Liste der Länder im Besitz des Spielers
	 * @param spielkarten Liste der Karten im Besitz des Spielers
	 */
	public Spieler(String name, String farbe, Rolle rolle, Land[] besetzteLaender, Spielkarte[] spielkarten) {
		this.name = name;
		this.farbe = farbe;
		this.rolle = rolle;
		this.besetzteLaender = besetzteLaender;
		this.spielkarten = spielkarten;
	}

	/**
	 * Gibt den Namen dieses Spielers zurück.
	 * @return Name des Spielers
	 */
	public String getName() {
		return name;
	}

	/**
	 * Ändert den Namen dieses Spielers.
	 * @param name der neue Name des Spielers
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gibt die Farbe dieses Spielers zurück.
	 * @return Farbe des Spielers
	 */
	public String getFarbe() {
		return farbe;
	}

	/**
	 * Ändert die Farbe dieses Spielers.
	 * @param farbe die neue Farbe des Spielers.
	 */
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	/**
	 * Gibt die Rolle dieses Spielers zurück.
	 * @return die Rolle
	 */
	public Rolle getRolle() {
		return rolle;
	}

	/**
	 * Ändert die Rolle dieses Spielers.
	 * @param rolle die neue Rolle
	 */
	public void setRolle(Rolle rolle) {
		this.rolle = rolle;
	}

	/**
	 * Gibt die Länder, die dem Spieler gehören, zurück.
	 * @return eine Liste von Ländern
	 */
	public Land[] getBesetzteLaender() {
		return besetzteLaender;
	}

	/**
	 * Ändert die Länder, die dem Spieler gehören.
	 * @param besetzteLaender neue Liste von Ländern
	 */
	public void setBesetzteLaender(Land[] besetzteLaender) {
		this.besetzteLaender = besetzteLaender;
	}

	/**
	 * Gibt die Spielkarten, die dem Spieler gehören, zurück.
	 * @return eine Liste von Spielkarten
	 */
	public Spielkarte[] getSpielkarten() {
		return spielkarten;
	}

	/**
	 * Ändert die Spielkarten, die dem Spieler gehören.
	 * @param spielkarten neue Liste von Spielkarten
	 */
	public void setSpielkarten(Spielkarte[] spielkarten) {
		this.spielkarten = spielkarten;
	}
}

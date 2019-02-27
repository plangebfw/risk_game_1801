package bfw.risiko;

/**
 * <h1>Kontinent</h1>
 * <p>
 * Ein Kontintent, mit einem Namen, einer Liste von Ländern,
 * und eventuell einem Besitzer.
 *
 * @since 2019-02-25
 */
public class Kontinent {
	/**
	 * Der Name des Kontinents (Nordamerika, Südamerika, Europa, Afrika, Asien oder Australien).
	 */
	private String name;
	/**
	 * Die Länder, die auf dem Kontinent liegen.
	 */
	private Land laenderListe;
	/**
	 * Der Besitzer des Kontinents.
	 */
	private Spieler spieler;

	/**
	 * Erstellt einen neuen Kontinent.
	 *
	 * @param name         der Name des Kontinents
	 * @param laenderListe eine Liste von Ländern
	 * @param spieler      der Besitzer
	 */
	public Kontinent(String name, Land laenderListe, Spieler spieler) {
		this.name = name;
		this.laenderListe = laenderListe;
		this.spieler = spieler;
	}

	/**
	 * Gibt den Namen dieses Kontinents zurück.
	 * @return der Namen
	 */
	public String getName() {
		return name;
	}

	/**
	 * Ändert den Namen dieses Kontinents.
	 * @param name der neue Name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gibt die Länder, die auf diesem Kontinent liegen, zurück.
	 * @return Liste von Ländern
	 */
	public Land getLaenderListe() {
		return laenderListe;
	}

	/**
	 * Ändert die Länderliste dieses Kontinents.
	 * @param laenderListe die neue Liste von Ländern
	 */
	public void setLaenderListe(Land laenderListe) {
		this.laenderListe = laenderListe;
	}

	/**
	 * Gibt den Besitzer des Kontinents zurück.
	 * @return den Spieler oder null, wenn kein Spieler den gesamten Kontinent besitzt
	 */
	public Spieler getSpieler() {
		return spieler;
	}

	/**
	 * Ändert den Besitzer des Kontinents.
	 * @param spieler der neue Besitzer
	 */
	public void setSpieler(Spieler spieler) {
		this.spieler = spieler;
	}
}

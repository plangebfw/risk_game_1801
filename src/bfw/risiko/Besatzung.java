package bfw.risiko;

/**
 * <h1>Besatzung</h1>
 * <p>
 * Die Verbindung zwischen Spieler und Land.
 * Der Spieler hat eine bestimmte Anzahl von Einheiten auf dem
 * Land, mindestens eine.
 *
 * @since 2019-02-25
 */
public class Besatzung {
	/**
	 * Anzahl der Einheiten des Spieler
	 */
	private int anzahl;
	/**
	 * Der Spieler, dem das Land gehört.
	 */
	private Spieler spieler;
	/**
	 * Der Bonus für den Spieler, dem der Kontinent gehört.
	 */
	private int bonus;

	/**
	 * Erstellt eine neue Besatzung.
	 * @param anzahl die Anzahl der Einheiten, auf dem Land
	 * @param spieler der Besitzer des Landes
	 * @param bonus der Bonus für den Besitzer des ganzen Kontinents
	 */
	public Besatzung(int anzahl, Spieler spieler, int bonus) {
		this.anzahl = anzahl;
		this.spieler = spieler;
		this.bonus = bonus;
	}

	/**
	 * Gibt die Anzahl der Einheiten des Spielers auf diesem Land zurück.
	 * @return Anzahl von Einheiten
	 */
	public int getAnzahl() {
		return anzahl;
	}

	/**
	 * Ändert die Anzahl der Einheiten des Spielers auf diesem Land.
	 * @param anzahl die neue Anzahl von Einheiten
	 */
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	/**
	 * Gibt den Besitzer des Landes zurück.
	 * @return den Besitzer
	 */
	public Spieler getSpieler() {
		return spieler;
	}

	/**
	 * Ändert den Besitzer des Landes.
	 * @param spieler der neue Besitzer
	 */
	public void setSpieler(Spieler spieler) {
		this.spieler = spieler;
	}

	/**
	 * Gibt den Bonus des Spielers zurück.
	 * @return den Bonus
	 */
	public int getBonus() {
		return bonus;
	}

	/**
	 * Ändert den Bonus des Spielers.
	 * @param bonus der neue Bonus
	 */
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}

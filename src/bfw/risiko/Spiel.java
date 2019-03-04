package bfw.risiko;

/**
 * <h1>Spiel</h1>
 * <p>
 * Das Risiko-Spiel an sich.
 * Für 2 - 4 Spieler.
 *
 * @since 2019-02-25
 */
public class Spiel {
	/**
	 * Der aktuelle Tauschwert für 3 Laender- und Jokerkarten.
	 */
	private int austauschBonusAktuell;
	/**
	 * Die Liste der Tauschwerte für die Spielkarten.
	 */
	private int[] austauschBonusListe;
	/**
	 * Die Liste der Spieler
	 */
	private Spieler[] spieler;

	/**
	 * Erstellt ein neues Spiel.
	 *
	 * @param austauschBonusAktuell aktueller Tauschwert
	 * @param austauschBonusListe   Liste von Tauschwerten
	 * @param spieler               Liste von Spielern
	 */
	public Spiel(int austauschBonusAktuell, int[] austauschBonusListe, Spieler[] spieler) {
		this.austauschBonusAktuell = austauschBonusAktuell;
		this.austauschBonusListe = austauschBonusListe;
		this.spieler = spieler;
	}

	/**
	 * Die Hauptmethode.
	 * @param args keine
	 */
	public static void main(String[] args) {
		
		
		System.exit(0);
	}

	/**
	 * Gibt den aktuellen Tauschwert für Spielkarten zurück.
	 * @return Tauschwert
	 */
	public int getAustauschBonusAktuell() {
		return austauschBonusAktuell;
	}

	/**
	 * Ändert den aktuellen Tauschwert für Spielkarten.
	 * @param austauschBonusAktuell der neue Tauschwert
	 */
	public void setAustauschBonusAktuell(int austauschBonusAktuell) {
		this.austauschBonusAktuell = austauschBonusAktuell;
	}

	/**
	 * Gibt die aktuelle Liste von Tauschwerten zurück.
	 * @return Liste von Tauschwerten
	 */
	public int[] getAustauschBonusListe() {
		return austauschBonusListe;
	}

	/**
	 * Ändert die Liste von Tauschwerten.
	 * @param austauschBonusListe neue Liste von Tauschwerten
	 */
	public void setAustauschBonusListe(int[] austauschBonusListe) {
		this.austauschBonusListe = austauschBonusListe;
	}

	/**
	 * Gibt die Spieler zurück.
	 * @return Liste von Spiele
	 */
	public Spieler[] getSpieler() {
		return spieler;
	}

	/**
	 * Ändert die Spieler.
	 * @param spieler die neue Liste von Spielern
	 */
	public void setSpieler(Spieler[] spieler) {
		this.spieler = spieler;
	}
}

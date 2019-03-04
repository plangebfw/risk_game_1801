package bfw.risiko;

/**
 * <h1>Aufgabenkarte</h1>
 *
 * Stellt den Auftrag des Spielers dar.
 *
 * @since 2019-02-25
 */
public class Aufgabenkarte extends Spielkarte {
	/**
	 * Die Aufgabe dieser Karte.
	 */
	private String aufgabe;

	/**
	 * Erstellt eine neue Aufgabenkarte.
	 * @param aufgabe Die Aufgabe dieser Karte.
	 */
	public Aufgabenkarte(String aufgabe) {
		this.aufgabe = aufgabe;
	}

	/**
	 * Gibt die Aufgabe dieser Karte zurück.
	 * @return eine Aufgabe
	 */
	public String getAufgabe() {
		return aufgabe;
	}

	/**
	 * Ändert die Aufgabe dieser Karte.
	 * @param aufgabe die neue Aufgabe
	 */
	public void setAufgabe(String aufgabe) {
		this.aufgabe = aufgabe;
	}
}

package bfw.risiko;

/**
 * <h1>Kontinent</h1>
 * <p>
 * Ein Kontintent, mit einem Namen, einer Liste von Ländern,
 * und einem Bonus für den Spieler, dem der ganze Kontinent
 * gehört.
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
	private Land[] laenderListe;
	/**
	 * Der Bonus für den Kontinent
	 */
	private int bonus;

	/**
	 * Erstellt einen neuen Kontinent.
	 *
	 * @param name         der Name des Kontinents
	 * @param laenderListe eine Liste von Ländern
	 * @param bonus der Bonuswert
	 */
	public Kontinent(String name, Land[] laenderListe, int bonus) {
		this.name = name;
		this.laenderListe = laenderListe;
		this.bonus = bonus;
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
	public Land[] getLaenderListe() {
		return laenderListe;
	}

	/**
	 * Ändert die Länderliste dieses Kontinents.
	 * @param laenderListe die neue Liste von Ländern
	 */
	public void setLaenderListe(Land[] laenderListe) {
		this.laenderListe = laenderListe;
	}

	/**
	 * Gibt den Bonus für den Kontinent zurück.
	 * @return der Bonus
	 */
	public int getBonus() {
		return bonus;
	}

	/**
	 * Ändert den Bonus dieses Kontinents.
	 * @param bonus der neue Kontinent
	 */
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}

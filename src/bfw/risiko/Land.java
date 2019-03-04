package bfw.risiko;

/**
 * <h1>Land</h1>
 * <p>
 * Ein Land, mit einem Namen. Es liegt auf einem {@code Kontinent}.
 * Hat eine Menge von Nachbarn, und wird von einem Spieler besessen.
 *
 * @since 2019-02-25
 */
public class Land {
	/**
	 * Der Name des Landes.
	 */
	private String name;
	/**
	 * Der Kontinent auf dem das Land liegt.
	 */
	private Kontinent kontinent;
	/**
	 * Eine Liste von Nachbarn.
	 */
	private Land nachbarn;
	/**
	 * Der Besitzer des Landes.
	 */
	private Spieler spieler;

	/**
	 * Erstellt ein neues Land.
	 * @param name der Name des Landes
	 * @param kontinent der Kontinent, auf dem das Land liegt
	 * @param nachbarn eine Liste von Nachbarn
	 * @param spieler der Besitzer
	 */
	public Land(String name, Kontinent kontinent, Land nachbarn, Spieler spieler) {
		this.name = name;
		this.kontinent = kontinent;
		this.nachbarn = nachbarn;
		this.spieler = spieler;
	}

	/**
	 * Gibt den Namen dieses Landes zurück.
	 * @return Name des Landes
	 */
	public String getName() {
		return name;
	}

	/**
	 * Ändert den Namen dieses Landes.
	 * @param name der neue Landesname
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gibt den Kontinent, auf dem dieses Land liegt, zurück.
	 * @return Kontinent
	 */
	public Kontinent getKontinent() {
		return kontinent;
	}

	/**
	 * Ändert den Kontinent, auf dem dieses Land liegt.
	 * @param kontinent der neue Kontinent
	 */
	public void setKontinent(Kontinent kontinent) {
		this.kontinent = kontinent;
	}

	/**
	 * Gibt die Nachbarn dieses Landes zurück.
	 * @return eine Liste von Nachbarn
	 */
	public Land getNachbarn() {
		return nachbarn;
	}

	/**
	 * Ändert die Nachbarn dieses Landes.
	 * @param nachbarn die neue Liste von Nachbarn
	 */
	public void setNachbarn(Land nachbarn) {
		this.nachbarn = nachbarn;
	}

	/**
	 * Gibt den Besitzer dieses Landes zurück.
	 * @return den Besitzer
	 */
	public Spieler getSpieler() {
		return spieler;
	}

	/**
	 * Ändert den Besitzer dieses Landes.
	 * @param spieler der neue Besitzer
	 */
	public void setSpieler(Spieler spieler) {
		this.spieler = spieler;
	}
}

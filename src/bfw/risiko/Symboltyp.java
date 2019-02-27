package bfw.risiko;

/**
 * <h1>Symboltyp</h1>
 * <p>
 * Stellt den Symboltyp einer {@code Laenderkarte}
 * und der {@code Jokerkarte} dar.
 * <p>
 * Mögliche Werte sind "Infanterie", "Kavallerie", "Kanone".
 *
 * @since 2019-02-25
 */
public class Symboltyp {
	/**
	 * Der Name des Symboltyps.
	 */
	private String name;

	/**
	 * Erstellt einen neuen Symboltyp.
	 * @param name der Name des Symboltyps
	 */
	public Symboltyp(String name) {
		this.name = name;
	}

	/**
	 * Gibt den Namen des Symboltyps zurück.
	 * @return der Name des Symboltyps
	 */
	public String getName() {
		return name;
	}

	/**
	 * Ändert den Namen des Symboltyps.
	 * @param name der neue Name des Symboltyps
	 */
	public void setName(String name) {
		this.name = name;
	}
}

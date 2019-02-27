package bfw.risiko;

/**
 * <h1>Laenderkarte</h1>
 * <p>
 * Stellt ein {@code Land} dar.
 * Besteht aus einem {@code Land} und einem {@code Symboltyp}.
 *
 * @since 2019-02-25
 */
public class Laenderkarte extends Spielkarte {
	/**
	 * Das Land für das die Karte steht.
	 */
	private Land land;

	/**
	 * Der Symboltyp der Karte (Infanterie, Kavallerie, Kanone).
	 */
	private Symboltyp symbol;

	/**
	 * Erstellt eine neue Laenderkarte.
	 * @param land Das Land der Karte.
	 * @param symbol der Typ der Karte
	 */
	public Laenderkarte(Land land, Symboltyp symbol) {
		this.land = land;
		this.symbol = symbol;
	}

	/**
	 * Gibt das Land dieser Laenderkarte zurück.
	 * @return ein Land
	 */
	public Land getLand() {
		return land;
	}

	/**
	 * Ändert das Land dieser Karte.
	 * @param land ein Land.
	 */
	public void setLand(Land land) {
		this.land = land;
	}

	/**
	 * Gibt den Symboltyp dieser Laenderkarte zurück.
	 * @return ein Symboltyp (Infanterie, Kavallerie, Kanone)
	 */
	public Symboltyp getSymbol() {
		return symbol;
	}

	/**
	 * Ändert den Symboltyp dieser Laenderkarte.
	 * @param symbol ein Symboltyp (Infanterie, Kavallerie, Kanone)
	 */
	public void setSymbol(Symboltyp symbol) {
		this.symbol = symbol;
	}
}

package bfw.risiko;

/**
 * <h1>Jokerkarte</h1>
 * <p>
 * Steht für ein beliebiges {@code Land} mit einem beliebigen {@code Symboltyp}.
 *
 * @since 2019-02-25
 */
public class Jokerkarte extends Spielkarte {
	/**
	 * Der Symboltyp dieser Karte.
	 */
	private Symboltyp symbol;

	/**
	 * Erstellt eine neue Jokerkarte.
	 * @param symbol ein Symbolytp (Infanterie, Kavallerie, Kanone)
	 */
	public Jokerkarte(Symboltyp symbol) {
		this.symbol = symbol;
	}

	/**
	 * Gibt den Symbolytp dieser Karte zurück.
	 * @return ein Symboltyp (Infanterie, Kavallerie, Kanone)
	 */
	public Symboltyp getSymbol() {
		return symbol;
	}

	/**
	 * Ändert den Symboltyp dieser Jokerkarte.
	 * @param symbol ein Symboltyp (Infanterie, Kavallerie, Kanone)
	 */
	public void setSymbol(Symboltyp symbol) {
		this.symbol = symbol;
	}
}

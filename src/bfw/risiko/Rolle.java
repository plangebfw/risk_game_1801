package bfw.risiko;

/**
 * <h1>Rolle</h1>
 * <p>
 * Die {@code Rolle} des {@code Spielers} in der Angriffsphase.
 * Der {@code Spieler} kann entweder Angreifer oder Verteidiger sein.
 *
 * @since 2019-02-25
 */
public class Rolle {
	/**
	 * Name der Rolle
	 */
	private String name;
	/**
	 * Angreifer-Flag
	 */
	private boolean istAngreifer;

	/**
	 * Erstellt eine neue Rolle.
	 * @param name Name der Rolle
	 * @param istAngreifer ist der {@code Spieler} Angreifer
	 */
	public Rolle(String name, boolean istAngreifer) {
		this.name = name;
		this.istAngreifer = istAngreifer;
	}

	/**
	 * Gibt den Namen der Rolle zurück.
	 * @return Name der Rolle
	 */
	public String getName() {
		return name;
	}

	/**
	 * Ändert den Rollennamen.
	 * @param name der neue Name (Angreifer, Verteidiger)
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gibt das Angreifer-Flag zurück.
	 * @return ist der Spieler Angreifer
	 */
	public boolean isIstAngreifer() {
		return istAngreifer;
	}

	/**
	 * Ändert das Angreifer-Flag.
	 * @param istAngreifer Angreifer oder nicht
	 */
	public void setIstAngreifer(boolean istAngreifer) {
		this.istAngreifer = istAngreifer;
	}
}

package bfw.risiko;

/**
 * <h1>Wuerfel</h1>
 * <p>
 * Der Zufall in n-seitiger Form.
 *
 * @since 2019-02-25
 */
public class Wuerfel {
	/**
	 * Die gewürfelte Augenzahl.
	 */
	private int aktuellerWert;
	/**
	 * Höchste Augenzahl des Würfels.
	 */
	private int maxWert;
	/**
	 * Die Farbe des Würfels.
	 * Rot ist Angreifer.
	 * Weiß ist Verteidiger.
	 */
	private String farbe;

	/**
	 * Erstellt einen neuen Wuerfel.
	 * @param aktuellerWert der gewürfelte Wert
	 * @param maxWert die Höchste Augenzahl
	 * @param farbe die Farbe des Würfels
	 */
	public Wuerfel(int aktuellerWert, int maxWert, String farbe) {
		this.aktuellerWert = aktuellerWert;
		this.maxWert = maxWert;
		this.farbe = farbe;
	}

	/**
	 * Gibt den gewürfelten Wert dieses Würfels zurück.
	 * @return Augenzahl
	 */
	public int getAktuellerWert() {
		return aktuellerWert;
	}

	/**
	 * Ändert den gewürfelten Wert dieses Würfel.
	 * @param aktuellerWert die neue Augenzahl
	 */
	public void setAktuellerWert(int aktuellerWert) {
		this.aktuellerWert = aktuellerWert;
	}

	/**
	 * Gibt die maximale Augenzahl dieses Würfels zurück.
	 * @return maximale Augenzahl
	 */
	public int getMaxWert() {
		return maxWert;
	}

	/**
	 * Ändert die maximale Augenzahl dieses Würfels.
	 * @param maxWert der neue Maximalwert
	 */
	public void setMaxWert(int maxWert) {
		this.maxWert = maxWert;
	}

	/**
	 * Gibt die Farbe dieses Würfels zurück.
	 * @return Farbe
	 */
	public String getFarbe() {
		return farbe;
	}

	/**
	 * Ändert die Farbe dieses Würfels.
	 * @param farbe die neue Farbe (Rot, Weiss)
	 */
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
}

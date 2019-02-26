package bfw.risiko;

public class Wuerfel {
	private int aktuellerWert;
	private int maxWert;
	private String farbe;
	
	
	public Wuerfel(int aktuellerWert, int maxWert, String farbe) {
		this.aktuellerWert = aktuellerWert;
		this.maxWert = maxWert;
		this.farbe = farbe;
	}
	
	
	
	
	
	public int getAktuellerWert() {
		return aktuellerWert;
	}
	public void setAktuellerWert(int aktuellerWert) {
		this.aktuellerWert = aktuellerWert;
	}
	public int getMaxWert() {
		return maxWert;
	}
	public void setMaxWert(int maxWert) {
		this.maxWert = maxWert;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
}

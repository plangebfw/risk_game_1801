package Risiko;

public class Laenderkarte extends Spielkarte{
	private Land land;
	private Symboltyp symbol;
	
	
	public Laenderkarte(Land land, Symboltyp symbol) {
		this.land = land;
		this.symbol = symbol;
		
	}
	
	
	
	public Land getLand() {
		return land;
	}
	public void setLand(Land land) {
		this.land = land;
	}
	public Symboltyp getSymbol() {
		return symbol;
	}
	public void setSymbol(Symboltyp symbol) {
		this.symbol = symbol;
	}
}

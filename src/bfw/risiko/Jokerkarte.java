package bfw.risiko;

public class Jokerkarte extends Spielkarte{
	private Symboltyp symbol;

	
	public Jokerkarte(Symboltyp symbol) {
		this.symbol = symbol;
		
	}
	
	
	
	
	public Symboltyp getSymbol() {
		return symbol;
	}

	public void setSymbol(Symboltyp symbol) {
		this.symbol = symbol;
	}
}

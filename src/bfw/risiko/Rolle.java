package bfw.risiko;

public class Rolle {
	private String name;
	private boolean istAngreifer;
	
	
	public Rolle(String name, boolean istAngreifer) {
		this.name = name;
		this.istAngreifer = istAngreifer ;
		
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIstAngreifer() {
		return istAngreifer;
	}
	public void setIstAngreifer(boolean istAngreifer) {
		this.istAngreifer = istAngreifer;
	}
}

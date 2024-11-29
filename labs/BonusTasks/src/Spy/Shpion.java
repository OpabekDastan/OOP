package Spy;

public class Shpion  {
	private int code;
	
	public Shpion(int code) {
		this.code = code;
	}
	public int getCode() {
		return code;
	}
	@Override
	public String toString() {
		return "ИМПОСТЕРСКИЙ КОД: " + code; 
	}
	
}	


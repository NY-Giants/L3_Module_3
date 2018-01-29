package interfaces;

public abstract class SpecialString implements TextFunkifier{
	protected String s;
	
	public SpecialString(String s) {
		this.s = funkifyText(s);
	}
	
	public String funkifyText(String s2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString() {
		return s;
	}
}

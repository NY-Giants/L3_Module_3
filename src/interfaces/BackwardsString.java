package interfaces;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String v) {
	String holderofts = "";
	for(int i = v.length()-1; i >= 0; i--) {
		char t;
	t = v.charAt(i);
	holderofts = holderofts + t;
	 
	}
		return holderofts;
		
	}

}

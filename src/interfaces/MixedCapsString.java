package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String v) {
		String holderofxs = "";
		for (int i = 0; i < v.length(); i++) {
			char x;
			x = v.charAt(i);
			if(i%2==1) {
				holderofxs = holderofxs + Character.toUpperCase(x) ;
			}
			else {
				holderofxs = holderofxs + Character.toLowerCase(x) ;
			}
			
			
		}
		return holderofxs;

	}

}

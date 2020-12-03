package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				str += String.valueOf(s.charAt(i)).toLowerCase();;
			} else if (i % 2 == 1) {
				str += String.valueOf(s.charAt(i)).toUpperCase();
			} else {
				str += s.charAt(i);
			}
		}
		return str;
	}

}

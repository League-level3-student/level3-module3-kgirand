package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char charr = 0;
		String a = "";
			for(int i = s.length()-1; i >= 0; i--) {
				charr += s.charAt(i);
				a += charr;
			}
		return a;
	}

}

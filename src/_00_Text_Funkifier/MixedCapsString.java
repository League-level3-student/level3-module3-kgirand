package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char charr = 0;
		String str = "";
		String temp = "";
		
		for(int i = 0; i < s.length(); i++) {
			if(i%2==1) {
				charr+=s.charAt(i);
			}else {
				temp = s.charAt(i)
			}
		}
		str = String.valueOf(charr);
		return str;
	}

}

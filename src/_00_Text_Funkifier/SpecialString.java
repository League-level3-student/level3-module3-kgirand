package _00_Text_Funkifier;

import static org.junit.Assert.assertEquals;

public abstract class SpecialString implements TextFunkifier{
	protected String s;
	
	public SpecialString(String s) {
		this.s = funkifyText(s);
	}
	
	public String toString() {
		return s;
	}
	
	
	//private String SpecialString1(String string) {
	//	char charr = 0;
	//	String strr = "";
	//	for(int i = 0; i <= string.length()-1; i++) {
	//		charr = string.charAt(i);
	//		strr+=charr;
	//	}
	//	return strr;
	//}


	//protected abstract String SpecialString(String string);
}

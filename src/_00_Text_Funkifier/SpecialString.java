package _00_Text_Funkifier;

public abstract class SpecialString implements TextFunkifier{
	protected String s;
	
	public SpecialString(String s) {
		this.s = funkifyText(s);
	}
	
	public String toString() {
		return s;
	}
	//@Override
	//public String funkifyText(String s) {
	//String str = "";
	//for(int i = s.length(); i > 0; i++) {
	//	str += s.charAt(i);
	//}
	
	//return str;
		
	//}
}

package _00_Text_Funkifier;

public class IndexString extends SpecialString {

	public IndexString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		char charr = 0;
		String strr = "";
		for(int i = 0; i <= s.length()-1; i++) {
			strr+=i;
		}
		return strr;
		
	}



	
}

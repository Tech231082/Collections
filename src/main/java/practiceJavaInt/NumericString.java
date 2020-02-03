package practiceJavaInt;

public class NumericString {

	public static void main(String[] args) {
		System.out.println(isNumeric("1234"));
		System.out.println(isNumeric("abcd"));
		System.out.println(isNumeric("abc4"));
		System.out.println(isNumeric("123avfc"));
		System.out.println(isNumeric("@"));
		System.out.println(isNumeric("$"));
		System.out.println(isNumeric("\u0967"));
		System.out.println(isNumeric("^"));
		System.out.println(isNumeric(""));
		System.out.println(isNumeric("  "));

	}
	
	public static boolean isEmpty(CharSequence chars) {
		
		return chars==null || chars.length()==0;
		
	}
	public static boolean isNumeric(CharSequence chars) {
		if(isEmpty(chars)) {
			return false;
		}
		int length=chars.length();
		for(int i=0;i<length;i++) {
			if(!Character.isDigit(chars.charAt(i))) {
				return false;
			}
		}
		return true;
		
	}

}

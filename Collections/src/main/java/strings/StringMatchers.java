package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatchers {

	public static void main(String[] args) {
		Pattern p=Pattern.compile(".ahini");
		Matcher m=p.matcher("Rahini");
		boolean b=m.matches();
		System.out.println(b);
		
		System.out.println(Pattern.matches("Jivi.", "Jivin"));
		
		System.out.println(Pattern.matches("J...n", "Jivin"));
		
		//System.out.println(Pattern.matches("az", "az"));
		
		System.out.println(Pattern.matches("\\d", "5"));
		System.out.println(Pattern.matches("\\s", " "));
		System.out.println(Pattern.matches("\\w", "JivinGoyat"));
		System.out.println(Pattern.matches("\\d*", "54"));
		System.out.println(Pattern.matches("\\D*", "fagsss"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]", "Sushila123"));
		System.out.println(Pattern.matches("\\S", " "));
		System.out.println(Pattern.matches("[a-zA-Z]", "aushil"));
		System.out.println(Pattern.matches("[123]{1}[0-9]{9}", "9987546340"));

	}

}

package practiceJava;

public class WrapperConcept {

	public static void main(String[] args) {
		String s="100";
		int i=Integer.parseInt(s);
		System.out.println(i);

		String s1="12.56";
		double d=Double.parseDouble(s1);
		System.out.println(d);
		
		String s2="true";
		boolean b=Boolean.parseBoolean(s2);
		
		int in=90;
		String.valueOf(in);
		Integer.toString(in);
		
		
		String ss="300A";
		//when input string is not pure numeric then while parsing jvm will throw NumberFormatException
		//Integer.parseInt(ss);
		
		
	}

}

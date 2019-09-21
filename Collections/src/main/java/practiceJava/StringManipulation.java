package practiceJava;

public class StringManipulation {

	public static void main(String[] args) {
		String str="Its raining today";
		
		String str1="Its raining today";
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s'));
		
		System.out.println(str.indexOf('a'));
		
		System.out.println(str.indexOf('a',6));
		
		System.out.println(str.indexOf('a',str.indexOf('a')+1));
		
		System.out.println(str.indexOf("today"));
		
		System.out.println(str.indexOf("tomorrow"));
		
		
		System.out.println("Strings comparison ::"+str.equals(str1));
		
		System.out.println("Strings comparison ::"+str.compareTo(str1));
		
		System.out.println("Substring ::"+str.substring(5, 12));
		
		
		
		String st="   sdjdkd   kiii   ";
		System.out.println("Strings trim ::"+st.trim());
		
		System.out.println("Strings replace ::"+st.replace(" ", ""));
		
		
		String date="23-10-1982";
		
		System.out.println("Strings replace  ::"+date.replace("-", "/"));
		
		String s[]=date.split("-");
		for(int i=0;i<s.length;i++) {
			System.out.println("Strings split ::"+s[i]);
		}
		
		
		String s1="Rahini ";
		String s2="Jivin ";
		
		System.out.println("Strings concatenation ::"+s1.concat(s2));
		
		
		int a=100;
		int b=200;
		System.out.println(a+b);
		System.out.println(s1+a);
		System.out.println(a+b+s1+s2);
		System.out.println(s1+s2+a+b);
		System.out.println((s1+s2)+a+b);
		System.out.println((s1+s2)+(a+b));

	}

}

package strings;

public class StringManipulations {

	public static void main(String[] args) {
		StringManipulations ss=new StringManipulations();
		//String.valueOf() method takes int/boolean/double/float......type vlues and returns string
		String s1=" abcdef ";
		String s2="ABCDEFGHIJKLM";
		String str="100";
		String s3="jasjks45  *@12sdd%a";
		
		boolean b=true;
		int i=80;
		System.out.println(String.valueOf(i)+str);
		System.out.println(String.valueOf(b));
		System.out.println(ss);
		System.out.println(String.valueOf(ss));
		
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toCharArray());
		System.out.println(s1.trim());
		System.out.println(s1.startsWith(" "));
		System.out.println(s2.endsWith("M"));
		System.out.println(s2.substring(3));;
		System.out.println(s2.substring(2, 9));
		System.out.println(s1.toUpperCase());
		//System.out.println(s3.split("[^@%*]"));
		System.out.println(s3.split(" "));

	}

}

package practiceJava;

public class ReverseString {

	public static void main(String[] args) {
		String str="selenium";
		StringBuilder str1=new StringBuilder();
		str1.append(str);
		System.out.println(str1);
		
		System.out.println(str1.reverse());

	}

}

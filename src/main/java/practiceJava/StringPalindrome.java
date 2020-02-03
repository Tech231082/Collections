package practiceJava;

public class StringPalindrome {

	public static void main(String[] args) {
		isPalindrome("abba");
		isPalindrome("abcdba");

	}
	public  static void isPalindrome(String str) {
		String t;
		t=str;
		
		StringBuffer reverse=new StringBuffer(String.valueOf(t)).reverse();
		System.out.println(reverse);
		if(t.contentEquals(reverse)) {
			System.out.println("String is palindrome  "+t);
		}else {
			System.out.println("String is not palindrome   "+t);
		}
	}

}

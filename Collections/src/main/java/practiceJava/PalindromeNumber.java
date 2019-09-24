package practiceJava;

public class PalindromeNumber {

	public static void main(String[] args) {
		isPalindrome(132);
		

	}

	public static void isPalindrome(int num) {
		
		int t;
		int r=0;
		int sum=0;
		t=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(t==sum) {
			System.out.println("Number is palindrome  "+t);
		}
		else {
			System.out.println("Number is not palindrome   "+t);
		}
	}
}

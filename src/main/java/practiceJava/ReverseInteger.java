package practiceJava;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter number");
		int rev=0;
		
		int num=in.nextInt();
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	
	
	
	
	int num1=4567;
	System.out.println(new StringBuilder(String.valueOf(num1)).reverse());
	
	//System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	
	

}
}
package practiceJava;

import java.util.Scanner;

public class PRacticeStrings {

	public static void main(String[] args) {
		String str;
		String reverse="";
		Scanner in=new Scanner(System.in);
		System.out.println("enter string to be reversed");
		str=in.nextLine();
		
		//char[] chars=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(reverse+str.charAt(i));
		}
		

	}

}

package practiceJava;

import java.util.Scanner;

public class Swapping1 {

	public static void main(String[] args) {
		int a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter numbers");
		a=in.nextInt();
		b=in.nextInt();
		
		int c=a;
		a=b;
		b=c;

		System.out.println("Swapped  "+a+"  "+b);
	}

}

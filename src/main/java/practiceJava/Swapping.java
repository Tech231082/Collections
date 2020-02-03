package practiceJava;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter numbers");
		a=in.nextInt();
		b=in.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped  "+a+"  "+b);

	}

}

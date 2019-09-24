package practiceJava;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Eneter number");
		//sc.nextInt();
		
		System.out.println(findPrime(2));
		System.out.println(findPrime(3));
		System.out.println(findPrime(4));
		System.out.println(findPrime(5));
		System.out.println(findPrime(1));

	}
	
	public static boolean findPrime(int num) {
		if(num<=1) {
			//System.out.println("Not valid");
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				//System.out.println("Not prime");
				return false;
			}
			
		}
		//System.out.println("Prime : ");
		return true;
	}

}

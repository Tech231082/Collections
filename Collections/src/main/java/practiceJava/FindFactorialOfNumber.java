package practiceJava;

public class FindFactorialOfNumber {

	public static void main(String[] args) {
		//5=5*4*3*2*1;

		System.out.println(factorial(0));
		System.out.println(factorial(5));
		System.out.println(factorial(8));
		System.out.println("*********************");
		System.out.println(factorial1(0));
		System.out.println(factorial(4));
		System.out.println(factorial(6));
	}
	
	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	//recursion
	public static int factorial1(int num) {
		if(num==0)
			return 1;
		else
			
			return(num *factorial(num-1));
		
	}

}

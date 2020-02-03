package practiceJavaInt;

public class FibbonacciesSeries {

	public static void main(String[] args) {
		int num=7;
		int a=0,b=0;
		int c=1;
		for(int i=0;i<=num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
		}

	}

}

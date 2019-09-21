package practiceJava;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int a[]= {-2,-1,0,1,2,3,5};

		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		//int a1[]= {1,2,3,4,5};
		
		int sum1=0;
		for(int i=-2;i<=5;i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		
		System.out.println("Missing number in array is : "+(sum1-sum));
	}

}

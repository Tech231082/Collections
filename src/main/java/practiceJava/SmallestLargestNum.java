package practiceJava;

import java.util.Arrays;

public class SmallestLargestNum {

	public static void main(String[] args) {
		int a[]= {26,-56,456,23456};
		int largest=a[0];
		int smallest=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}else if(a[i]<smallest){
				smallest=a[i];
			}
		}

		
		System.out.println("\n given array is"+Arrays.toString(a));
		System.out.println(smallest);
		System.out.println(largest);
		
		
	}

}

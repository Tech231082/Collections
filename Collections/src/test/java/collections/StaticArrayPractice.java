package collections;

import java.util.Arrays;

import org.testng.annotations.Test;

public class StaticArrayPractice {
	//stores similar data types to overcome we use object arrays
	//fixed length
	@Test
	public void test() {
		int ar[]=new int[6];
		//int a[]= {10,22,67,23,43,34,56};
		ar[0]=23;
		ar[1]=22;
		ar[2]=44;
		ar[3]=4;
		ar[4]=44;
		ar[5]=44;
		//ar[6]=44;
		System.out.println(ar.length);
		System.out.println(ar[5]);
		
		//boolean array
		boolean b[]=new boolean[4];
		b[0]=true;
		b[1]=false;
		b[2]=true;
		b[3]=true;
		
		//character array
		char c[]= {'c','b','c','d'};
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		//System.out.println(c[4]);
		
		//object arrays
		Object obj[]=new Object[5];
		obj[0]=23;
		obj[1]="hello";
		obj[2]=23.89;
		obj[3]='d';
		obj[4]=true;
		System.out.println(obj.length);
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
	

}
}

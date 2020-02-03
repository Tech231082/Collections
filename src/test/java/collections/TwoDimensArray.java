package collections;

import org.testng.annotations.Test;

public class TwoDimensArray {

	@Test
	public void test() {
		String s[][]=new String[2][2];
		System.out.println(s.length);
		System.out.println(s[0].length);
		s[0][0]="A";
		s[0][1]="B";
		s[1][0]="C";
		s[1][1]="D";
		System.out.println(""+s[1][1]);
		
		//print all values
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[0].length;j++) {
				System.out.println("s["+i+"]["+j+"]");
			}
		}
		
		
	}
	
}

package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class FindDuplicatesInArray {
	@Test
	public void test() {
		String []sArray= {"Java","Python","Ruby","C","Java"};
		//time complexity
		/*for(int i=0;1<sArray.length;i++) {
			for(int j=i+1;j<sArray.length;j++) {
				if(sArray[i].equals(sArray[j])) {
					System.out.println("Duplicate element found"+sArray[i]);
				}
			}
		}*/
		
		
	
	
	//using HashSet(uniqe values)
	
	Set<String> set=new HashSet<String>();
	
	for(String name:sArray) {
		if(set.add(name)==false) {
			System.out.println("Duplicate element found  ::-> "+name);
		}
	}
	
	//using HashMap
	/*Map<String,Integer> hm=new HashMap<String,Integer>();
	for(String name:sArray) {
		if(hm.get(name)==null) {
			hm.put(name, value)
		}
	}*/

}
}
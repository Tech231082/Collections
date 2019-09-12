package collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class HashMapTest {
	
	@Test
	public void test() {
		//unique keys
		
		//not synchronized(not thread safe)
		//key-value pair
		//one null key allowed
		//more than one null values allowed
		//extends AbstractMap class
		//implements Map interface
		//maintains no order
		//failed fast condition
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Selenium");
		map.put(2, "Java");
		map.put(3, "API");
		map.put(4, "Postman");
		map.put(5, "RestAssured");
		map.put(6, "QTP");
		//printing the values using entryset
		System.out.println("printing the values using entryset");
		Set e= map.entrySet();
		
			System.out.println(e);
			
			System.out.println("printing the values using get method");
		
			
			System.out.println(map.get(5));
			
			map.remove(2);
			
			System.out.println(e);
			
			for(Entry e1:map.entrySet()) {
				int key=(Integer) e1.getKey();
				String value=(String) e1.getValue();
				System.out.println(key+"  "+ value);
			}
			
			
			map.putIfAbsent(2, "Java");
			
			System.out.println(map.get(2));
		
	}

}

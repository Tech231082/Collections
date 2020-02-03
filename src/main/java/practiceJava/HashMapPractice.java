package practiceJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
		//multiple null values allowed in hashmap but null keys and duplicate keys not allowed
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Hello");
		map.put(2,"namste");
		map.put(3,"india");
		map.put(4,"USA");
		map.put(5,null);
		map.put(6,null);
		
		
		Iterator<Entry<Integer, String>> it=map.entrySet().iterator();
		while(it.hasNext()) {
		Entry<Integer, String> set=it.next();
         System.out.println("Map is "+set.getKey()+":"+set.getValue());
	}
		
		
		

}
}

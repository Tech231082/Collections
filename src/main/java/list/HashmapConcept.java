package list;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapConcept {

	public static void main(String[] args) {
		//is non synchronized(not thread safe)
		//implements Map interface
		//key value pair
		//one null key allowed and multiple null values allowed
		//maintains no order
		//failed fast condition occur(concurrent modification exception)
		//contains unique values
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Java");
		map.put(2, "API");
		map.put(3, "Rest");
		map.put(4, "Postman");
		map.put(5, null);
		map.put(6, null);
		
		System.out.println(map.get(5));
		System.out.println("Printing values");
		for(Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
		
		HashMap<Integer,Student> hm=new HashMap<Integer,Student>();
		Student s1=new Student("Rahini",8,"F");
		Student s2=new Student("Jivin",3,"M");
		Student s3=new Student("geeta",8,"F");
		hm.put(1, s1);
		hm.put(2, s2);
		hm.put(3, s3);
		
		for(Entry<Integer,Student> m:hm.entrySet()) {
			int key=m.getKey();
			Student s=m.getValue();
			System.out.println(s.name+"/"+s.age+"/"+s.sex);
		}
		
		
		
		

	}

}

package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

import org.testng.annotations.Test;

public class HashtableConcept {
	
	@Test
	public void test() {
		//Hashtable is synchronized(at a time only one thread can access) so it is thread safe 
		//Hashtable does not store duplicate keys/store unique keys
		//null keys and values not allowed
		//values are stored on the basis of key value pair
		//keys are stored as Objects---they have hashcode--values
		Hashtable ht=new Hashtable();
		ht.put("Skills1", "Selenium");
		ht.put("Skills2", "Java");
		ht.put("Skills3", "Git");
		ht.put("Skills4", "Jenkins");
		ht.put("Skills5", "API Testing");
		ht.put("Skills6", "Sql");
		ht.put("Skills7", "RestAssured");
		ht.put("Skills8", "TestNG");
		ht.put("Skills9", "Postman");
		
		System.out.println(ht);
		
		Hashtable ht1=new Hashtable();
		ht1=(Hashtable) ht.clone();
		System.out.println(ht1);
		
		System.out.println(ht.hashCode());
		System.out.println(ht1.hashCode());
		
		if(ht.equals(ht1)) {
			System.out.println("They are same");
			
		}
		else {
			System.out.println("They are different");
		}
		
		ht.clear();
		
		System.out.println("ht has been removed"+ht);
		
		System.out.println("Traverse hashtable using enum");
		
		Enumeration e=ht1.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("Traverse hashtable using entrySet");
		Set s=ht1.entrySet();
		
		System.out.println(s);
		
		if(ht1.containsKey("Skills5")) {
			System.out.println(ht1.get("Skills5"));
		}
	}

}

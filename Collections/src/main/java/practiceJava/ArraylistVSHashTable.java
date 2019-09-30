package practiceJava;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class ArraylistVSHashTable {

	public static void main(String[] args) {
		//stores the values on the basis of indexes
		//any type of values can be added to arraylist
		//it is dynamic array
		//if we want to add a particular data type/object type values into arraylist we can use generics
		
		 ArrayList ar=new ArrayList();
		 ar.add("Jivi");
		 ar.add(4);
		 ar.add('s');
		 ar.add(23.44);
		 ar.add(ar);
		 System.out.println(ar.size());
		 System.out.println(ar.get(3));
		 System.out.println(ar.get(4));
		 
		 System.out.println("printing using for loop");
		 for(int i=0;i<ar.size();i++) {
			 System.out.println(ar.get(i));
		 }
		 ar.remove(3);
		 System.out.println(ar.size());
		 
		 System.out.println("printing using while loop and iterator");
		Iterator it= ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		 
		 //dynamic array
		 //values stored on the basis of key value pair
		 Hashtable ht=new Hashtable();
		 ht.put(1, "Jivin");
		 ht.put(2, "Rahini");
		 ht.put(3, "Parmod");
		 ht.put(4, "Sushila");
		 ht.put("j", "jjj");
		 System.out.println(ht.size());
		 //System.out.println("printing using for loop");
		 System.out.println(ht.get("j"));
		 
		 
		 
	}

}

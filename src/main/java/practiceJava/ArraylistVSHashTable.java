package practiceJava;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class ArraylistVSHashTable {

	public static <E> void main(String[] args) {
		//stores the values on the basis of indexes
		//any type of values can be added to arraylist
		//it is dynamic array
		//arraylist is not synchronized
		//can store duplicate values
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
		 
		 System.out.println("printing using forEach");
		 ar.forEach(list->{
			 System.out.print(ar);
		 });
		 
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
		 
		 //when we dont know what type of data we will use at runtime
		 ArrayList<E> arr=new ArrayList<E>();
		 
		 ArrayList<Student> array=new ArrayList<Student>();
		 
		 
		 Student s1=new Student("Rahini",8);
		 Student s2=new Student("Jivin",3);
		 Student s3=new Student("Shalan",5);
		 Student s4=new Student("Shalan",5);
		 
		 array.add(s1);
		 array.add(s2);
		 array.add(s3);
		 array.add(s4);
		 
		Iterator its= array.iterator();
		while(its.hasNext()) {
			Student s=(Student) its.next();
			System.out.println("Age:"+s.age+"  "+"Name:"+s.name);
		}
		 
		 
	}

}

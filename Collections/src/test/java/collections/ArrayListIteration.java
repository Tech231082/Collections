package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class ArrayListIteration {

	
	@Test
	public void test() {
		
		ArrayList<String> array=new ArrayList<String>();
		
		array.add("Selenium");
		array.add("TestNG");
		array.add("Java");
		array.add("API");
		array.add("Jira");
		
		//iterator
		Iterator it=array.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.print("%%%%%%%%%%ListIterator%%%%%%%%%%%%%%%5");
		
		ListIterator list=array.listIterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		System.out.print("%%%%%%%%%% Foreach and lamda %%%%%%%%%%%%%%%5");
		array.forEach(skills->{
			System.out.println(skills);
		});
		
		System.out.print("%%%%%%%%%% Foreachreamaining and lamda %%%%%%%%%%%%%%%5");
		
		it.forEachRemaining(skills->{
			System.out.println(skills);
		});
		//foreach loop
		System.out.println("%%%%%%%%%% Foreach %%%%%%%%%%%%%%%5");
		for(String skill: array) {
			System.out.println(array);
		}
	}
}

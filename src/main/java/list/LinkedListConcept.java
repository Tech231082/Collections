package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("RFT");
		ll.add("RPA");
		System.out.println(ll);
		System.out.println("Using for loop");
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("Using iterator");
		Iterator it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Using while loop");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}

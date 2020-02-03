package practiceJava;

import java.util.HashSet;

public class DuplicateWordsCountUsingHashSet {

	public static void main(String[] args) {
		String inputString="java is not bad but not so good is it to learn java bad bad";
		//String[] strArray = inputString.split("\\s");
		String[] strArray = inputString.split(" ");


		HashSet<String> set = new HashSet<String>();
		 
		        for (String arrayElement : strArray)
		        {
		            if(!set.add(arrayElement))
		            {
		                System.out.println("Duplicate Element is : "+arrayElement);
		            }
		        }

	}

}

package practiceJava;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordInString {

	public static void main(String[] args) {
		
		findDuplicateString("java is not a widely not python the best used laguage and java is the best");
		

	}
	public static void findDuplicateString(String s) {
		String str[]=s.split(" ");
		
		HashMap<String,Integer> wordCount=new HashMap<String,Integer>();
		
		for(int i=0;i<str.length;i++) {
			if(wordCount.containsKey(str[i])) {
				wordCount.put(str[i], wordCount.get(str[i])+1);
			}
			else {
				wordCount.put(str[i], 1);
			}
		}
		
		Set<String> words=wordCount.keySet();
		
		for(String word:words) {
			if(wordCount.get(word)>1) {
				System.out.println("word is :  "+word+"  "+wordCount.get(word));
			}
		}
		
	}

}

package practiceJava;

public class SwappingString {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Jivin";
		
		System.out.println("Before swapping : ");
		
		s1=s1+s2;
		s2=s1.replace(s2, "");
		s1=s1.replace(s2, "");
		
		System.out.println("After swapping : "+s1+"   "+s2);
	}

}

package singleton;

public class SingletonClass {
	private static SingletonClass singletonClassInstance=null;
	public String str;
	
	private SingletonClass() {
		str="Selenium java practice";
	}
	
	public static SingletonClass getInstance() {
		if(singletonClassInstance==null) {
			singletonClassInstance=new SingletonClass();
		}
		
		return singletonClassInstance;
		
	}

	public static void main(String[] args) {
		// it has only one object at a time
		//constructor is private
		//write a public static method return type of which is object of class(lazy initialization)
		//getInstance method for object creation as compared to normal class in which constructor is used
		
		SingletonClass s=SingletonClass.getInstance();
		SingletonClass s1=SingletonClass.getInstance();
		s.str= (s.str).toUpperCase();
		System.out.println(s.str);
		s1.str= (s1.str).toUpperCase();
		System.out.println(s1.str);
		
		s1.str=(s1.str).toLowerCase();
		System.out.println(s1.str);

	}

}

package practiceJava;

public class StaticVSNonStatic {

	String name="Cheenu";
	static int age=8;
	
	//global vars are static as well as non static
	//static vars and methods can be accessed directly without creating the object
	//static vars and methods can be called using classname.nameof method/var
	//non static vars and methods are stored inside object thats why we need to create
	//object of class to access them
	
	//static vars and methods can be accessed through object too but its not a good practice(compiler gives a warning)
	
	public static void main(String[] args) {
		System.out.println(age);
		System.out.println(StaticVSNonStatic.age);

	}

}

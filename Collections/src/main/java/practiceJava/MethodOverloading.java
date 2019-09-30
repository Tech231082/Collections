package practiceJava;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.sum("Hello", "  Rahini");
		m.sum();
		m.sum(5);
		m.sum(7, 9);

	}
	//when method name is same but number of parameters are different
	public  void sum() {
		System.out.println("No param");
	}
    public void sum(int a) {
    	System.out.println("Single params"+(a+a));
	}
    public void sum(int a,int b) {
    	System.out.println("Two params"+(a+b));
    }
    public void sum(String s1,String s2) {
    	System.out.println("Two parmas"+(s1+s2));
    }

}

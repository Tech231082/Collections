package practiceJava;

public class StringMixed {

	public static void main(String[] args) {
		String str="sddg33452vshkf";
		String s=str.replaceAll("[^0-9]", "");
		System.out.println(s);
		int a=Integer.parseInt(s);
        System.out.println(a);
        
        int sum=0;
        while(a!=0) {
        	sum=sum+a%10;
        	a=a/10;
        }
        System.out.println(sum);
	}

}

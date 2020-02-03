package practiceJava;

public class ArmstrongNumber {

	public static void main(String[] args) {
		armstrongNumber(17);
		armstrongNumber(153);
		armstrongNumber(1);
		armstrongNumber(0);
		armstrongNumber(1634);

	}
	
	public static void armstrongNumber(int num) {
		int cube=0;
		int rem;
		int temp;
		temp=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			cube=cube+(rem*rem*rem);
		}
		if(temp==cube) {
			System.out.println("Number is armstrong  ");
		}
		else {
			System.out.println("Number is not armstrong  ");
		}
	}
	
	

}

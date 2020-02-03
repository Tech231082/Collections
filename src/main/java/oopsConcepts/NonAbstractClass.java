package oopsConcepts;

public class NonAbstractClass extends AbstractConcept {

	public static void main(String[] args) {
		//hiding the implementation logic is called abstraction
		//at least one method should be abstract
		//partial abstraction is achieved using abstract class
		NonAbstractClass ab=new NonAbstractClass();
		NonAbstractClass ab1=new NonAbstractClass();
		
		ab=ab1;
		//ab.method1();
		//ab.method2();
		
		ab1.method1();
		ab1.method2();
		ab1.method3();
		

	}

	@Override
	public void method2() {
		System.out.println("second method abstract");
		
	}

	@Override
	public void method3() {
		System.out.println("Third method abstract");
		
	}

}

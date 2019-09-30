package oopsConcepts;

public class NonAbstractClass extends AbstractConcept {

	public static void main(String[] args) {
		NonAbstractClass ab=new NonAbstractClass();
		NonAbstractClass ab1=new NonAbstractClass();
		ab=ab1;
		ab.method1();
		ab.method2();
		
		ab1.method1();
		ab1.method2();
		

	}

	@Override
	public void method2() {
		System.out.println("abstract");
		
	}

}

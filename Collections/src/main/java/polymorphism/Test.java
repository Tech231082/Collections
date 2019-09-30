package polymorphism;

public class Test {

	public static void main(String[] args) {
		//compile time polymorphism/static
		//overridden and child class methods can be called
		//has a relationship
		Nissan n=new Nissan();
		n.lock();
		n.start();
		n.stop();
		
		//dynamic polymorphism
		//only overridden methods would be called 
		//can not be called child class methods with parent reference
		System.out.println("Car class reference and child class object");
		Car c=new Nissan();
		c.start();
		c.stop();
	

	}

}

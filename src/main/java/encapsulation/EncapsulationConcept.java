package encapsulation;

public class EncapsulationConcept {
	//private data variables 
	//public getters and setters 
	//if read only then only getters 
	
	private int uidNumber;
	private int age;
	private String name;
	
	
     //getters and setters
	public int getUidNumber() {
		return uidNumber;
	}

	public void setUidNumber(int uidNumber) {
		this.uidNumber = uidNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		EncapsulationConcept e=new EncapsulationConcept();
		e.setName("Toad");
		e.setAge(23);
		e.setUidNumber(2345678);
		
		
		System.out.println("Name is : "+e.getName());
		System.out.println("Age is : "+e.getAge());
		System.out.println("UID Number is : "+e.getUidNumber());

	}

}

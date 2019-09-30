package interfaceConcept;

public class Test {

	public static void main(String[] args) {
		//static polymorphism/compile time polymorphism
		HSBCBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		b.accountType();
		b.creditBrazil();
		b.debitBrazil();
		b.transferMoneyBrazil();
		
		//dynamic polymorphism/run time
		//has a relationship
		//only overridden methods would be called
		USBank u=new HSBCBank();
		u.credit();
		u.debit();
		u.transferMoney();
		
		BrazilBank bb=new HSBCBank();
		bb.creditBrazil();
		bb.debitBrazil();
		bb.transferMoneyBrazil();
		
		

	}

}

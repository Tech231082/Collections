package interfaceConcept;

public class HSBCBank implements USBank,BrazilBank{
	
	//a class can implement more than one interfaces
	//when a class implements interface it is called is a relationship
	//we can achieve multiple inheritance

	
	public void credit() {
		System.out.println("HSBCBank credit");
		
	}

	public void debit() {
		System.out.println("HSBCBank debit");
		
	}

	
	public void transferMoney() {
		System.out.println("HSBCBank transfer moneyt");
		
	}
	
	public void accountType() {
		System.out.println("HSBCBank account type");
		
	}

	@Override
	public void creditBrazil() {
		System.out.println("BarazilBank credit");
		
	}

	@Override
	public void debitBrazil() {
		System.out.println("BarazilBank debit");
		
	}

	@Override
	public void transferMoneyBrazil() {
		System.out.println("BarazilBank transfer money");
		
	}
	

}

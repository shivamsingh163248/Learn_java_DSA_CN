package learn_polymorphisam;

public class organization_account extends cpolymorphisam_class {
	
	//  creating the variable for the corporation 
	private String corporation_name ;
	private int coporation_account_number ; 
	private String ceo_name ; 
	private String compny_address ;
	public organization_account( String bank_name, int user_id_number, int bank_amount ,String corporation_name, int coporation_account_number,
			String ceo_name, String compny_address) {
		super(bank_name, user_id_number, bank_amount);
		this.corporation_name = corporation_name;
		this.coporation_account_number = coporation_account_number;
		this.ceo_name = ceo_name;
		this.compny_address = compny_address;
	}
	
	
	public organization_account(String bank_name, int user_id_number, int bank_amount) {
		super(bank_name, user_id_number, bank_amount);
		// TODO Auto-generated constructor stub
	} 
	
	@Override
	public void setBank_amount(int bank_amount) {
		// TODO Auto-generated method stub
		super.setBank_amount(bank_amount);
	}
	
	// creating the constuctor 
	
	@Override
	public int getTotal_bank_amount() {
		// TODO Auto-generated method stub
		return super.getTotal_bank_amount();
	}
	
	// creating the carporation printing detail 
	
	public void carporaion_print() {
		System.out.println(getHand_write_sysmbol()+" CORPOTATION NAME :- " + this.corporation_name + getRight_arrow_symobl()+
				" CEP NAMME :- "+this.ceo_name);
		System.out.println(getRight_arrow_symobl()+" COPORATON ACCOUNT NUMBER :- " + this.coporation_account_number);
		System.out.println(getRight_arrow_symobl()+" CORPORATION ADRESS :- "+ this.compny_address);
	}
	
	// print function for the bank detail 
	public void print_bank_corporation() {
		super.printBankDetail();
		carporaion_print();
	}
	
	

}

package learn_abstract;



public abstract  class bank {
	// creating the some private variable 
	private String user_name ; 
	private String bank_name ; 
	private int account_number ; 
	private String bramch_name ; 
 // frist creating the constrocter 
	public bank(String user_name) {
		this.user_name = user_name ; 
		
	}
	// agian creating the constrocter with the two parameter 
	public bank(String usera_name , String bank_name) {
		this(usera_name) ; 
		this.bank_name = bank_name ; 
		
	}
	// creating the new constrocter 
	public bank(String user_name, String bank_name, int account_number, String bramch_name) {
		
		this(user_name, bank_name) ; 
		this.account_number = account_number;
		this.bramch_name = bramch_name;
	}
	
	// now creating the getter and setter method for the getting the value and for the setting the value 
	// now creating the absteact method 
	public abstract void atm() ; 


}

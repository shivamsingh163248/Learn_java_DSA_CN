package learn_polymorphisam;

public class cpolymorphisam_class {
	
	private String bank_name ; 
	private int user_id_number ; 
	private int bank_amount ; 
	private static int total_bank_amount ; 
	private final String government_program  = "JAN DHAN ACCOUNT YOJANA" ;
	
	// creating the constructor  for the  set above value 
	
	// creating the constructor for with the parameter for the above value 
	// creating the constructor use with the two parameter bank and user id number
	
	private final char right_arrow_symobl = '\u27A4';
	private final char hand_write_sysmbol = '\u270D';
	
	
	public cpolymorphisam_class(String bank_name) {
		this.bank_name = bank_name ; 
	}
	// agina creating the constructor with the two patameter 
	public cpolymorphisam_class(String bank_name , int user_id_number) {
		// call the above constructor for the value enter 
		this(bank_name);
		this.user_id_number = user_id_number ; 
		
	}
public cpolymorphisam_class(String bank_name, int user_id_number, int bank_amount) {
		
		this(bank_name, user_id_number);
		this.bank_amount = bank_amount ; 
	}

	
	
	// creating the total amount number of the number display every whare  are the same creating 
		// using the getter and setter for the set these value 
		

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public int getUser_id_number() {
		return user_id_number;
	}

	public void setUser_id_number(int user_id_number) {
		this.user_id_number = user_id_number;
	}

	public int getBank_amount() {
		return bank_amount;
	}

	public void setBank_amount(int bank_amount) {
		this.bank_amount = bank_amount;
	}

	public static int getTotal_bank_amount() {
		return total_bank_amount;
	}

	public static void setTotal_bank_amount(int total_bank_amount) {
		cpolymorphisam_class.total_bank_amount = total_bank_amount;
	}

	public String getGovernment_program() {
		return government_program;
	}
	
	// using the print function for the print all value 
	
	
	
	public void printBankDetail () {
		// printing the final world for the heading which program enrolling 
		System.out.println(right_arrow_symobl+" GOVERNEMENT PROGRAM NAME : - "+getGovernment_program());
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print(hand_write_sysmbol+" BANK NAME :- "+getBank_name()+"::::::"+"USER_ID_NUMBER :- "+getUser_id_number()+":::::::"
				+"TOTALA_AMOUNT_USER :- "+getTotal_bank_amount());
	}
	
	
	
	
	
	public char getRight_arrow_symobl() {
		return right_arrow_symobl;
	}
	public char getHand_write_sysmbol() {
		return hand_write_sysmbol;
	}
	
	// create some function with same name 
	

	
	
	

}

package learn_polymorphisam;


// using the extend property for the inheritance all the property of the parent class 
// using the extend keyword for the inherit property of the parent class  
public class USER_DETAIL_LEARN_POLYMORPHISM extends cpolymorphisam_class{
	// nothing to import any package due to same class in the same package 
	// now declared the constructor for the call super class 
	
	private String user_name ;
	private int user_account_number ; 
	private String user_father_name ; 
	
	
	// now creating the constructor for the above value 
	 public USER_DETAIL_LEARN_POLYMORPHISM(String bank_name, int user_id_number, int bank_amount ,
			 String user_name , int user_account_number , String user_father_name) {
		// now all the variable are the insilized 
		 super(bank_name, user_id_number, bank_amount);
		 this.user_name = user_name ; 
		 this.user_account_number = user_account_number ; 
		 this.user_father_name = user_father_name ; 
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getUser_account_number() {
		return user_account_number;
	}

	public void setUser_account_number(int user_account_number) {
		this.user_account_number = user_account_number;
	}

	public String getUser_father_name() {
		return user_father_name;
	}

	public void setUser_father_name(String user_father_name) {
		this.user_father_name = user_father_name;
	}
	 
	 
	 // now hear i generate the getter the getter and setter for all function
	 
	 // now using the same print function 
	public void print_user_detail() {
		super.printBankDetail();
		// now printing the user name 
	    print_user_name();
	    print_account_number();
	    parents_detail();
	    
	    
	}
	
	private void print_user_name() {
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println();
		System.out.println(getHand_write_sysmbol()+" USER_NAME :- "+getUser_name());
		System.out.println();
		System.out.println("----------------------------------------------------------------");
	}
	private void parents_detail(){
		
		System.out.print(getRight_arrow_symobl()+" FATHER_NAME :- "+getUser_father_name());
	}
	// print the a/c number 
	  private void print_account_number(){
		  // now hear we are the  define the sum unicode for the account sysmbol 
		 System.out.print(getRight_arrow_symobl()+" A/C :- "+this.user_account_number); 
	  }
	  
	  
	  // call some function for the direct printing 
	  @Override
	public void printBankDetail() {
		// TODO Auto-generated method stub
		super.printBankDetail();
	}
	  
	 
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("this is the user detail ");
	}
	
	

}

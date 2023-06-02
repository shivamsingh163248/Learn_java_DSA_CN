package learn_polymorphisam;

public class test_bank_polymorphisam {
	
	public static void space() {
		for (int i = 0; i < 5; i++) {
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creating the function for the 5 time space
	
	
	// call the controctor 
		
		cpolymorphisam_class shivam = new USER_DETAIL_LEARN_POLYMORPHISM("SBI", 4567, 14000, "SHIVAM SINGH", 24345453, "SATYENDRA KUMAR SINGH");
		shivam.setTotal_bank_amount(25600);
		shivam.printBankDetail();
		space();
		shivam.print();
		
	//	shivam.print_user_detail();
		
		// learn the type casting **************************************************
		// now creating the refrence of the user detail 
		USER_DETAIL_LEARN_POLYMORPHISM check_type_casting  ; 
		// check_type_casting = shivam ; 
		// user type casting 
		check_type_casting = (USER_DETAIL_LEARN_POLYMORPHISM)shivam ; 
		
		// check the access of the printing the part of the user detail 
		System.out.println();
		System.out.println("#########################################################");
		check_type_casting.print_user_detail();
		System.out.println();
		
		
		
		shivam = new organization_account("pnb", "raghuvanshi pvt. limited", 34354, "SHIVAM", "NADIHAR RAJGRAH MIRAZAPUR");
		shivam.printBankDetail();
		space();
		shivam.print();
		
		
		// creating the default object 
		Object default_name = new USER_DETAIL_LEARN_POLYMORPHISM(null, 0, 0, null, 0, null) ; 
//		default_name. mot show anay function 
///***********************************************IMPORTANT FOR THE CHECKING *************************
		// USING THE TYPE CASTING 
		USER_DETAIL_LEARN_POLYMORPHISM default_check_polymormisam ; 
		default_check_polymormisam = (USER_DETAIL_LEARN_POLYMORPHISM)default_name ;  // using the class  type casting 
		// check the value 
		default_check_polymormisam.print_user_detail();
		
		
		
	}

}

package learn_polymorphisam;

public class test_bank_polymorphisam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// call the controctor 
		
		cpolymorphisam_class shivam = new USER_DETAIL_LEARN_POLYMORPHISM("SBI", 4567, 14000, "SHIVAM SINGH", 24345453, "SATYENDRA KUMAR SINGH");
		shivam.setTotal_bank_amount(25600);
		shivam.printBankDetail();
		System.out.println();
		shivam.print();
	//	shivam.print_user_detail();
		shivam.setTotal_bank_amount(45);
		shivam = new organization_account("pnb", "raghuvanshi pvt. limited", 34354, "SHIVAM", "NADIHAR RAJGRAH MIRAZAPUR");
		shivam.printBankDetail();
		System.out.println();
		shivam.print();
		shivam.setTotal_bank_amount(45);
	}

}

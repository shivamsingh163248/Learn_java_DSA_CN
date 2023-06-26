package learn_abstract;

public class employ_detail extends bank { // now extends the abstract class 
 
	
	// now hear the call the abstract class and full fill the property 
	private int employ_number ; 
	private String employ_departemnt ; 
	private String designation ;
	public employ_detail(int employ_number, String employ_departemnt, String designation) {
		super(employ_departemnt);
		this.employ_number = employ_number;
		this.employ_departemnt = employ_departemnt;
		this.designation = designation;
	}
	public int getEmploy_number() {
		return employ_number;
	}
	public void setEmploy_number(int employ_number) {
		this.employ_number = employ_number;
	}
	public String getEmploy_departemnt() {
		return employ_departemnt;
	}
	public void setEmploy_departemnt(String employ_departemnt) {
		this.employ_departemnt = employ_departemnt;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	} 
	
	// now creating the constrocter 
	// creating the overide 
	@Override
		public void itisha() {
			// TODO Auto-generated method stub
			super.itisha();
		}
	// if an calling the final method this is the its is 
	// calling the abstract method 
	@Override
		public void atm() {
			// TODO Auto-generated method stub
		System.out.println("yes you have the atm ");
			
		}
	
	
	
}

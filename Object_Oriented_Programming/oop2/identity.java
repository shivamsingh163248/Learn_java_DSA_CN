package oop2;

public class identity {

	String name ; 
	String address ; 
	int aadhar_card_nunber ;
	String hight ; 
	String father_name ; 
	String mother_name ;
	
	// writing  a three member for the testing 
	private String i_name ; 
	protected int i_roll ; 
	public int i_hegiht ; 
	



	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getAddress() {
		return address;
	}
	protected void setAddress(String address) {
		this.address = address;
	}
	protected int getAadhar_card_nunber() {
		return aadhar_card_nunber;
	}
	protected void setAadhar_card_nunber(int aadhar_card_nunber) {
		this.aadhar_card_nunber = aadhar_card_nunber;
	}
	protected String getHight() {
		return hight;
	}
	protected void setHight(String hight) {
		this.hight = hight;
	}
	protected String getFather_name() {
		return father_name;
	}
	protected void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	protected String getMother_name() {
		return mother_name;
	}
	protected void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}


}

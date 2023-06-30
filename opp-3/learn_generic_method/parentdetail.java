package learn_generic_method;

public class parentdetail {
	private String father_name ;
	private String mother_name ; 
	private String your_name ; 
	private int your_number ;
	public parentdetail(String father_name, String mother_name, String your_name, int your_number) {
		
		this.father_name = father_name;
		this.mother_name = mother_name;
		this.your_name = your_name;
		this.your_number = your_number;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public String getYour_name() {
		return your_name;
	}
	public void setYour_name(String your_name) {
		this.your_name = your_name;
	}
	public int getYour_number() {
		return your_number;
	}
	public void setYour_number(int your_number) {
		this.your_number = your_number;
	} 
	
	// creating the constocter 
	// noe creating the printing function 
 public void prints() {
	 System.out.println(getYour_name()+" "+getYour_number());

 }
	

}

package final_opps_4;

public class extendStudent extends student  {

	public extendStudent(int value) {
		super(value);
		// TODO Auto-generated constructor stub
	}
	
	// creating the method and the set the value 
	public void setName(String name) {
		this.name = name ; 
	}
	
	// checking the roll number 
	public void printRoll() {
		System.out.println(this.roll_nulber);
	}
	
	public void sum() {
		System.out.println("this is the second  ");
	}
	
	
	
	

}

package OOP1;

public class Student {

	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getRoll_no() {
		return roll_no;
	}
	private void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	String name ; 
	int roll_no ; 
	
	
	void shivam() {
		setName("shivam ");
		setRoll_no(roll_no);
	}
	

}

package learn_generic;

public class school implements student_inteface {
	private int roll_num ;
	private String name ;
	public school(int roll_num, String name) {
		
		this.roll_num = roll_num;
		this.name = name;
	}
	public int getRoll_num() {
		return roll_num;
	}
	public void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	
	// now creating the constrocter 
	// creating the print function 
	public void print() {
		System.out.println(getName()+" "+getRoll_num());
	}

}

package java_oops;

public class student {

	// creating the variable of the number 
	private int roll_number ; 
	private String name ; 
	private String father_name ; 
	private String mother_name ;
	
	
	public student(int roll_number) {
		
		this.roll_number = roll_number;
	}
	
	// again creating the construcer 
	public student(int roll_number , String name) {
		
		this(roll_number);
		this.setName(name) ; 
		
	}
	
	// again creating the construtor with the three parameter 
	public student(int roll_number , String name , String father_name , String mother_name) {
		// TODO Auto-generated constructor stub
		this(roll_number , name) ;
		this.father_name = father_name ; 
		this.mother_name = mother_name ; 
		
	}
	
	// now creating the constructor for the default values 
	// check the printing the whole value 
 public void print_student() {
	System.out.println("name :"+this.name);
}

public String getName() {
	return this.name;
}

public void setName(String name) {
	this.name = name;
}
	

	
	
// creating for the format for the printing  value 
	
	
}

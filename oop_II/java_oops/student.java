package java_oops;

 class student {

	// creating the variable of the number 
	private int roll_number ; 
	private String name ; 
	private String father_name ; 
	private String mother_name ;
	String programmer  ;
	
	
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
	System.out.println("name :- "+this.name+"  roll_no :- "+this.roll_number+" father_name :- "+this.father_name+" mother_name :- "+this.mother_name);
}

 // all the geeter ********************************** settter method
 
 
public String getName() {
	return this.name;
}

public void setName(String name) {
	this.name = name;
}
public void setRoll_no(int roll_no) {
	this.roll_number = roll_no ; 
}
// get roll number 
public int getroll_no() {
	return this.roll_number ;
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

//-------------------------------******************------------------****************
// making the getter and seteer for the set program name 
public void setprogrammer_name(String programmer_name) {
	this.programmer = programmer_name ; 
}
// also using the programmer got the getting 

public String getProggrammer_name() {
	return this.programmer ;
}
	

	
	
// creating for the format for the printing  value 
	
	
}

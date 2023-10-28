package INHERITANCE;

public class classs  extends school{
	
   
	// now creating the class ]
	String name ; 
	int Roll_no ; 
	
	// now creating the print function 
	
	// now creating the constorcter 

	
	
	
	
	public void print() {
		System.out.println("this is the class ");
	}

	public classs(String department, String course, String name, int roll_no) {
		super(department, course);
		this.name = name;
		Roll_no = roll_no;
	}


	public classs() {
		super();
		System.out.println("this is the super class ");
	}
	
}

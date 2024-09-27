package static_final_expalin_use;

public class controler_student {
	
	//  creating the controller of the class 
	// creating the arrays of the all class 
	Student_class[] AllClass ; 
	
	
	// creating the class of the controller 
	 // creating the function 
	private static int totalClass ; 
	
	
	// creating the counstroctur 
	
	public controler_student() {
	totalClass++ ; 
	}
	
	// creating the function to updating the class details 
	
	public Student_class updating(int studentClass, String className , String classTeacher) {
		
		return new Student_class(studentClass, className, classTeacher) ; 
	}
	
	// creating the updating details 
	
	
	
	
	
	
	

}

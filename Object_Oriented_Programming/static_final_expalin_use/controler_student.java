package static_final_expalin_use;

import java.util.ArrayList;



public class controler_student {
	
	//  creating the controller of the class 
	// creating the arrays of the all class 
	Student_class[] AllClass ; 
	private ArrayList<Student_class> AllClasses ; 
	
	
	// creating the class of the controller 
	 // creating the function 
	private static int totalClass ; 
	
	
	// creating the counstroctur 
	
	public controler_student() {
	totalClass++ ; 
	}
	
	// creating the function to updating the class details 
	
	private Student_class updating(int studentClass, String className , String classTeacher) {
		
		return new Student_class(studentClass, className, classTeacher) ; 
	}
	
	// creating the updating details 
	
	public void updatingClassDetails(int studentClass, String className , String classTeacher) {
		
		AllClasses.add(updating(studentClass, className, classTeacher)) ; 
			
	}
	
	
	// creating the print all the class 
	
	public void printallclass() {
		
		// now printing all the class details 
		// now hear i will print all the class 
		// using the arrays 
		for (int i = 0; i < AllClasses.size(); i++) {
			
			System.out.println("class name : "+AllClasses.get(i).getClassName()+" | ");
			System.out.println("class teacher name : "+AllClasses.get(i).getClassTeacher()+" | ");
			System.out.println("Name of class "+AllClasses.get(i).getStudentClassName()+" | ");
		}
		 
		
		
	}
	
	private  Student_class findObject (int number) {
		
		return AllClasses.get(number); 
	}
	
	public void printAllstudent(int classNumber ) {
		
		// details of the class and print all the student details 
		Student_class PritcularClassStudentDetails = findObject(classNumber); 
		
		System.out.println("class name : "+PritcularClassStudentDetails.getClassName()+" | ");
		System.out.println("class teacher name : "+PritcularClassStudentDetails.getClassTeacher()+" | ");
		System.out.println("Name of class "+PritcularClassStudentDetails.getStudentClassName()+" | ");
		
		
		
		// now printing all the student details of the class 
		
		PritcularClassStudentDetails.PintAllStudent();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}

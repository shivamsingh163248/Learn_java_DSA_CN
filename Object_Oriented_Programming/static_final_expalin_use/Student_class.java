package static_final_expalin_use;

import java.util.ArrayList;

public class Student_class {
	

	// creating the arrays of the class 
	// creating the arrays list  list 
	ArrayList<student> allStudents ; 
	
	student[] allStudent ; 
	// also crating the arrays 
	
	// writing the property of the class 
	private int count = 0  ; // using for the 
	
	
	private int StudentClass  ; 
	private String className ; 
	private String classTeacher ;
	
	
	
	public Student_class(int studentClass, String className , String classTeacher) {
		
		this.StudentClass = studentClass ; 
		this.className = className;
		this.classTeacher = classTeacher ; 
	} 
	
	
	
	// creating the function for the adding the all the student 
	private student addStudent (int mathMrk, int scineceMark, int englishMark ,String studentName) {
		return new student(mathMrk, scineceMark, englishMark, studentName) ; 
	}
	
	
	// now adding the student 
	
	public void AddStudentDetail(int mathMrk, int scineceMark, int englishMark ,String studentName){
		allStudents.add(addStudent(mathMrk, scineceMark, englishMark, studentName)) ; 
		
		allStudent[count] = addStudent(mathMrk, scineceMark, englishMark, studentName) ; 
		count++ ; 
		
	}
	
	
	// creating the function    // print all student of the class 
	public void PintAllStudent() {
		
		// using the for loop for the retrieval all the data 
		
		for (int i = 0; i < allStudent.length; i++) {
		//	System.out.println("|---------------------------------------------------------------------------------|");
			System.out.print("Student name : "+allStudent[i].getStudentName()+" | ");
			System.out.print("Student name : "+allStudent[i].getStudentRollNumber()+" | ");
			
			// now printing all the mark 
			System.out.print("Math Mark : "+allStudent[i].getMathMrk()+" | ");
			System.out.print("science Mrak : "+allStudent[i].getScineceMark()+" | ");
			System.out.println("English Mark : "+allStudent[i].getEnglishMark()+" | ");
			System.out.println("|---------------------------------------------------------------------------------|");
			
		}
	}
	
    
	
	
	
	
	

	protected int getStudentClass() {
		return StudentClass;
	}
	protected void setStudentClass(int studentClass) {
		StudentClass = studentClass;
	}
	protected String getClassName() {
		return className;
	}
	protected void setClassName(String className) {
		this.className = className;
	}
	
	
	

	
	
	
	

}

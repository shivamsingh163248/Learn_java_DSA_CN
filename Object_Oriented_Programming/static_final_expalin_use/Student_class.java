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
	private static String classTeacher ;
	
	
	public Student_class(student[] allStudent, int studentClass, String className) {
		super();
		this.allStudent = allStudent;
		StudentClass = studentClass;
		this.className = className;
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
		
		// 
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
	protected static String getClassTeacher() {
		return classTeacher;
	}
	protected static void setClassTeacher(String classTeacher) {
		Student_class.classTeacher = classTeacher;
	}
	
	

	
	
	
	

}

package static_final_expalin_use;

public class student {
	
	// writing the student property writing the basic rule of the student 
	private String studentName ; 
	private  int studentRollNumber ;
	private static int toalStudent ; 
	
	// creating the result program 
	private final int mathMrk ; 
	private final int EnglishMark ; 
	private final int ScineceMark ;
	
	
	
	// creating the constructor 
public student(int mathMrk, int scineceMark, int englishMark ,String studentName ) {
	
	toalStudent++ ; 
	studentRollNumber++ ; 
	this.mathMrk = mathMrk;
	this.EnglishMark = englishMark;
	this.ScineceMark = scineceMark;
	this.studentName = studentName ; 
	
}



	
	
	
	

}

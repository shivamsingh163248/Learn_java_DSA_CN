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

// creating the getter 
protected String getStudentName() {
	return studentName;
}



protected void setStudentName(String studentName) {
	this.studentName = studentName;
}



protected int getStudentRollNumber() {
	return studentRollNumber;
}



protected void setStudentRollNumber(int studentRollNumber) {
	this.studentRollNumber = studentRollNumber;
}



protected static int getToalStudent() {
	return toalStudent;
}





protected int getMathMrk() {
	return mathMrk;
}

protected int getEnglishMark() {
	return EnglishMark;
}

protected int getScineceMark() {
	return ScineceMark;
}









   


	
	
	
	

}

package static_final_expalin_use;

public class student {
	
	




	// writing the student property writing the basic rule of the student 
	private String studentName ; 

	private static int toalStudent ; 
	
	// creating the result program 
	private final int mathMrk ; 
	private final int EnglishMark ; 
	private final int ScineceMark ;
	//creating the next variable for the computer mark 
	
	
	
	
	// creating the constructor 
public student(int mathMrk, int scineceMark, int englishMark ,String studentName ) {
	
	toalStudent++ ; 
	
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

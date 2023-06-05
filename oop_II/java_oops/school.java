package java_oops;



public class school {

	public static void main(String[] args) {
		
		// now calling the constocter 
		student shivam = new student(205569, "shivam");
		
		// now check for the printing 
		shivam.print_student();
		shivam.setName("mom");
		shivam.print_student();
		shivam.setFather_name("satyendra kumar singh ");
		
		
		classs teacher = new classs(205568, "shashi") ; 
		 
		teacher.print_student();
		// teacher_print 
		teacher.setRoll_no(205583);
		teacher.print_student();
		teacher = new classs(24566, "gyandre");
		teacher.print_student();
		
		// ********************************************************************************
		
		// set the name of the programmer 
		teacher.programmer = " SDE - shivam singh ";
		
		teacher.setallvalue(2456, "anil kumar mishra", "english", 11, 48);
		// check the printing the value of 
		teacher.print_class_teacher();
		teacher.set_student_value(205556, "pragyan", "sant kumar yaday ", "munny devu");
		teacher.print_class_student();
		
	// now now  creating the scanner for the taking input from the user 

	
		// test hear same function name and how to write 
			
		
		// creating the for loop 
	System.out.println(teacher.getFather_name());
	System.out.println(shivam.getFather_name());
	
		
		
		
		

				
		
	}
}

  package java_oops;

public class school {

	public static void main(String[] args) {
		
		// now calling the constocter 
		student shivam = new student(205569, "shivam");
		
		// now check for the printing 
		shivam.print_student();
		shivam.setName("mom");
		shivam.print_student();
		
		classs teacher = new classs(205568, "shashi") ; 
		teacher.print_student();
				
		
	}
}

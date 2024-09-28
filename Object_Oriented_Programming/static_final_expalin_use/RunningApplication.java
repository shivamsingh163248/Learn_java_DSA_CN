package static_final_expalin_use;

public class RunningApplication {

	public static void main(String[] args) {
		
		// creating the object controler 
		
		controler_student shps = new controler_student() ; 
		
		shps.updatingClassDetails(0, "Lkg", "shivam_signh");
		
		
		shps.UpdatingStudent(0, 65, 625, 6985, "aman gupta");
		shps.UpdatingStudent(0, 66, 655, 6655, "akanshaa");
		shps.UpdatingStudent(0, 685, 365, 655, "shivamgi");
		shps.UpdatingStudent(0, 655, 6655, 6455, "cjeka");
		
		shps.updatingClassDetails(1, "frist ", "lovely ");
		
		shps.UpdatingStudent(1, 685, 365, 655, "shivamgi");
		shps.UpdatingStudent(1, 655, 6655, 6455, "cjeka");
		
		// noe check and printing 
		//  shps.printallclass();
	// 	shps.totalClass();
		//  System.out.println();
		  shps.printAllstudent(0);
		  shps.printallclass();
		  shps.printAllstudent(1);
		  
		  
		  // now check and print total student 
		  controler_student nit = new controler_student() ; 

	}

}

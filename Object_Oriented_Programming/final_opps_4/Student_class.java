package final_opps_4;

import learn_opp_3.check_function;

public class Student_class {
	
	public static void main(String[] args) {
		
		// final values can't be changed 
		// creating the object of the student 
		student shivam = new student(2343434) ; 
		
		// this is the final value 
		
		// creating the obejct and the print both methid 
		student chek1 = new student(5454) ; 
		
		
		// let the check the value 
		System.out.print(chek1);
		chek1.sum();
		  chek1 = new extendStudent(3345) ; 
		  System.out.println(chek1);
		  chek1.sum();
	}

}

package shivam;

public class learn_cinstructer {
	
	// creating the the class and object in the same class 
	// TEST THE class and 
	
	// creating the oject 
	int roll_no ; 
	String name ; 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// now creating the object of the obove class 
		learn_cinstructer shivam = new learn_cinstructer() ; 
		// so now set the value of the 
		shivam.name = "shivam ";
		shivam.roll_no = 205569 ; 
		// now the printing of the these class 
		System.out.print(shivam.name+" "+shivam.roll_no);
		
		//sarita  devi 
		// System.out.println("sarita singh ");
		
		// now creating a new array 
		System.out.println();
		int[]shivamm  ; 
		 shivamm = new int [10 ] ;
		 System.out.println(shivamm);
		 // creating the new array 
		 int temp[] ; 
		 temp = shivamm ; 
		 
		 // now again creating the new array of the same name  
		 shivamm = new int [11];
		 // check the print of the length of the array '
		 System.out.println(shivamm);
		 System.out.println(shivamm.length);
		 System.out.println(temp.length);
		 
		

	}

}

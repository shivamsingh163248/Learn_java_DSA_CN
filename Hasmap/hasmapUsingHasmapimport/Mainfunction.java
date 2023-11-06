package hasmapUsingHasmapimport;

import java.util.HashMap;

public class Mainfunction {
	
	// CREATING the main class 
	public static void main(String[] args) {
		
		
		// now creating  the object of the has map 
		HashMap<Integer, String>student = new HashMap<>() ; 
		
		// now add data in the hash map using the opeartion 
		// using the put operation we can add the data 
		//@put
		
		student.put(2, "my name is the shivam ") ; 
		student.put(8, "this is the march birthday ");
		
		
		// now is the key are the contain the print the some thing 
		
		// now printing the thing  
		 // cretating the print function for the using the get 
		
		System.out.println(student.get(2));
		// now using the remove function for the rtemove any key 
		student.remove(2) ; 
		// now we are the testing the 
		
		
	}

}

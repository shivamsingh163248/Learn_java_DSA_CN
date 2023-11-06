package hasmapUsingHasmapimport;

import java.util.HashMap;
import java.util.Set;

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
		System.out.println(student.get(2));
		
		// now creating the contain function 
		if (student.containsKey(8)) {
			System.out.println("this valur are the contain ");
			
		}
		
		// now chacking the if the value are the not conatian then printing the else part 
		
		if (student.containsKey(6)) {
			
			System.out.println("this is the key contain part");
			
		} else {
            // now else part the using the value of the error
             System.err.println(" hear the value are the not contain ");
		}
		
		
		student.put(4, "mahesh") ; 
		student.put(5, "suresh") ;
		student.put(6, "dhirendra") ;
		student.put(7, "gaurav") ; 
		
		// now finding the size 
		System.out.println(student.size());
		
		// now creating the set function for the print all the key 
		// set function are using new keywording 
		Set<Integer>keyvalue = student.keySet() ; 
		
		// now printing the using the for each loop 
		for (Integer i : keyvalue) {
			System.out.println(student.get(i));
		}
		
	
		
	}

}

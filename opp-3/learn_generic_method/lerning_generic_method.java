package learn_generic_method;

import takeinput_recursively.print_revers_recorsion;

public class lerning_generic_method {
	
	// now creating the method of the printing the value 
	public static <itisha> void print( itisha shivam []) {
		// using the for each loop for the printing the number 
		for (itisha name : shivam) {
			// now prining the array 
			
			System.out.printf("%s ", name);
			
			
		}
		
		
	}
	
	// now creatig the for each llo
	public static void prints(int[]arr) {
		// printing the array 
		for (int i : arr) {
			System.out.println(i);
		}
		
	}
	
	// creating the main function 
	
	public static void main(String[] args) {
		
		
		
		Integer arr[] = {2,4,5,6,7,56,6} ;
		  int arrn[] = {2,4,5,6,7,56,6} ;
	print(arr);
	prints(arrn); 
		
		
	}
	
	// creating the array 
	
	
	// calling the function 

}

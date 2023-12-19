package recoresen.subset.array;

import java.util.Scanner;

public class number_subset_array {

	 // creating the taking the input  and output given in the array formet 
	public int[] takeinput() {
		// now taking the user input 
		System.out.println("enter the number");
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// creating the array
		int[]arr = new int[n] ; 
		for (int i = 0; i < arr.length; i++) {
			// now insurt array 
			
			arr[i] = input.nextInt();
		}
	}
	
	
	
}

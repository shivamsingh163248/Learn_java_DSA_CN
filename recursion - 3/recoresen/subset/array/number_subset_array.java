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
			System.out.println(i);
			arr[i]= input.nextInt();
			
		}
		return arr ;
	}
	
	
	// creating the function for the finding the all the subset 
	public int[][]subsetHelper(int[]arr , int startIndex){
		
		// creating the base function 
		if (arr.length == startIndex) {
			int[][] output = new int[1][0];
			return output ; 
		}
		
	}
	
	
	
}

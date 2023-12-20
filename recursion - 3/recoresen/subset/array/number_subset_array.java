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
		int[][]smallOutput = subsetHelper(arr, startIndex+1);
		int[][] output = new int[2*smallOutput.length][];
		
	int k = 0 ; 
		// creating the looping statement 
		for (int i = 0; i < smallOutput.length; i++) {
			
			output[k] = new int[smallOutput[i].length] ;
			for (int j = 0; j < output[i].length; j++) {
				
				output[k][j] = smallOutput[i][j];
			}
			k++ ; 
			
		}
		
		// agaaic creating the for loop 
		for (int j = 0; j < smallOutput.length; j++) {
			output[k] = new int[smallOutput[j].length+1];
			output[k][0] = arr[startIndex] ; 
			for (int j2 = 0; j2 <= smallOutput[j].length ; j2++) {
				output[k][j2] = smallOutput[j][j2-1];
			}
		}
		
		return output ; 
	}
	
	
	
}

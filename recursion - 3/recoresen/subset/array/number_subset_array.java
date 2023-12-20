package recoresen.subset.array;

import java.util.Scanner;

public class number_subset_array {

	// creating the taking the input and output given in the array formet
	public int[] takeinput() {
		// now taking the user input
		System.out.println("enter the number");

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// creating the array
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			// now insurt array
			System.out.print("index" + i);
			arr[i] = input.nextInt();

		}
		return arr;
	}

	// creating the function for the finding the all the subset
//	private int[][]subsetHelper(int[]arr , int startIndex){
//		
//		// creating the base function 
//		if (arr.length == startIndex) {
//			int[][] output = new int[1][0];
//			return output ; 
//		}
//		int[][]smallOutput = subsetHelper(arr, startIndex + 1);
//		int[][] output = new int[2*smallOutput.length][];
//		
//	int k = 0 ; 
//		// creating the looping statement 
//		for (int i = 0; i < smallOutput.length; i++) {
//			
//			output[k] = new int[smallOutput[i].length] ;
//			for (int j = 0; j < output[i].length; j++) {
//				
//				output[k][j] = smallOutput[i][j];
//			}
//			k++ ; 
//			
//		}
//		
//		// agaaic creating the for loop 
//		for (int j = 0; j < smallOutput.length; j++) {
//			output[k] = new int[smallOutput[j].length+1];
//			output[k][0] = arr[startIndex] ; 
//			for (int j2 = 1; j2 <= smallOutput[j].length ; j2++) {
//				output[k][j2] = smallOutput[j][j2-1];
//			}
//		}
//		
//		return output ; 
//	}
//	
//	public int[][] subset(int[]arr){
//		
//		// calling the above function 
//		return subsetHelper(arr, 0) ; 
//	}
//	

	
		public static int[][] subsetsHelper(int[] input, int startIndex) {
			if (startIndex == input.length) {
				int[][] output = new int[1][0];
				return output;
			}
			int[][] smallerOutput = subsetsHelper(input, startIndex + 1);
			int[][] output = new int[2 * smallerOutput.length][];
			int k = 0;
			for (int i = 0; i < smallerOutput.length; i++) {
				output[k] = new int[smallerOutput[i].length];
				for (int j = 0; j < smallerOutput[i].length; j++) {
					output[k][j] = smallerOutput[i][j];
				}
				k++;
			}
			for (int i = 0; i < smallerOutput.length; i++) {
				output[k] = new int[smallerOutput[i].length + 1];
				output[k][0] = input[startIndex];
				for (int j = 1; j <= smallerOutput[i].length; j++) {
					output[k][j] = smallerOutput[i][j - 1];
				}
				k++;
			}
			return output;
		}

		public static int[][] subsets(int input[]) {
			return subsetsHelper(input, 0);
		}
	}



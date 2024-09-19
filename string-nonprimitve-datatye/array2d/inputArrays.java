package array2d;

import java.util.Scanner;

public class inputArrays {
	
	// creating the function for the taking the input 2d arrays as the input 
	// creating the static function for the taking the input 
	public static int[][] inputArrays(){
		
		// creating the size 
		Scanner input  = new Scanner(System.in)  ;
		System.out.println("enter the row");
		int row = input.nextInt() ; 
		System.out.println("enter the coloum");
		int coloum = input.nextInt() ; 
		
		// insilizion the arrays 
		int[][]matrix = new int[row][coloum] ; 
		
		// creating the loop  for the iterating element 
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				
				System.out.println("enter the value ["+i+"]"+"["+j+"]");
				matrix[i][j] = input.nextInt() ; 
			}
		}
		
		// now returning the values 
		return matrix ; 
	}
	
	// creating the function for the printing of the 2d arrys 
	public static  void printArrys(int[][]arr) {
		// this function are the using the printing the arrys 
		// creating the loop for the printing arrys 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// now calling the function of the  arrays and the check the for the printing 
		int[][]value = inputArrays() ; 
		printArrys(value);

	}

}

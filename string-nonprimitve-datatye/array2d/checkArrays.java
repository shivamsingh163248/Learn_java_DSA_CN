package array2d;

import java.util.Scanner;

public class checkArrays {
	
	public static int[][] arrysinput(){
		
		// creating the 2d arrays and the taking the input in the arrays
		// creating the scanner function for the size of the arrays 
		Scanner input = new Scanner(System.in) ; 
		// calling for the users 
		System.out.println("enter the dimension of the matrix in the form of n*m");
		int row = input.nextInt() ; 
		int column = input.nextInt() ; 
		int[][]ans = new int[row][column] ; 
		
		// now creating the loop for the insurting the values 
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				
			}
		}
		
		// now returning the ans 
		return ans  ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[4][5];
	    for(int i=0;i<5;i++)
	    {
	        arr[i][0]=2;
	    }
	    System.out.print(arr[3][0]);


	}

}

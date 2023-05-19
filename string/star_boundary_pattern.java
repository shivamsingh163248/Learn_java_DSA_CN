import java.awt.Color;
import java.util.Scanner;

public class star_boundary_pattern {
	// make the function of the taking input 
	
	public static int[][] take_input(){
		Scanner input = new Scanner(System.in);
		System.out.print("enter the size of the row ");
		int row_size  = input.nextInt();

		System.out.print(" enter the size of the column");
		int column_size = input.nextInt();
	
		System.out.println("your matrix size "+row_size+"*"+column_size);
		System.out.println("---------------------enter the matrix -------------------");
		// ------------ creating the new array----------------------------
		int[][]arr = new int[row_size][column_size];
		// taking the input form the user 
		
		
		
		for (int i = 0; i < row_size; i++) {
			for (int j = 0; j < column_size; j++) {
				// ----------- user show index number------------
				System.out.print("your  matrix index "+i+j+"=");
				arr[i][j] = input.nextInt() ; 
			}
		}
		
		// ----------- return array ----------
		return arr ; 
	}
	
	// ---------------- making the new function of the output------------------------
	public static void output(int[][]arr) {
		System.out.println("------------------output of the matrix---------------------");
		// find the length of the row column 
		int row_size = arr.length;
		int column_size = arr[0].length;
		
//		System.out.println(row_size);
//		System.out.println(column_size);
		for (int i = 0; i < row_size; i++) {
			for (int j = 0; j < column_size; j++) {
				System.out.print(arr[i][j]+" ");
			}
			 System.out.println();
		}
		
		
	} 
	
	
	// ------------------- make the new fnction ---------------------
	public static void boundy(int[][]arr) {
		
		// -- find the size of the row and column ---------
		int row_size = arr.length ; 
		int column_size = arr[0].length;
		
		//----------- take the four pointer ----------------
		
		int row_big = 0 ;
		int column_big = 0 ;
		int row_end = row_size-1 ; 
		int column_end = column_size-1;
       
		int total = row_size*column_size ; 
		
		int count = 0 ; 
		
		while(count < total) {
		
		for (int i = column_big; i <= column_end && count< total; i++) {
			System.out.print(arr[column_big][i]+" ");
			count++;
		}
		row_big++ ;
		System.out.println();
		System.out.println("----------");
		for (int i = row_big; i <= column_end && count< total; i++) {
			System.out.print(arr[i][column_end]+" ");
			count++;
		}
		column_end-- ;
		System.out.println();
		System.out.println("----------");
		for (int i = column_big; i <= column_end && count< total; i++) {
			System.out.print(arr[row_end][i]+" ");
			count++;
		}
		row_end -- ;
		System.out.println();
		System.out.println("--------------");
		for (int i = row_big; i <= row_end && count< total; i++) {
			System.out.print(arr[i][column_big]+" ");
			count++;
		}
		column_big++ ; 
		System.out.println();
		System.out.println("-------------");
		
		
		} // end of the while loop 
		
		
		
	}
	

	public static void main(String[] args) {
//------------ call function ------------------
		 // creating the new array 
		int[][]shiva ; 
		shiva = take_input() ; 
		output(shiva);
		
		//------- call the boundary function ---------
		
		boundy(shiva);

	}

}

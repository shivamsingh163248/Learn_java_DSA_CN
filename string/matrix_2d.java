import java.util.Iterator;
import java.util.Scanner;

public class matrix_2d {
	// make the function of the of the scanning 2d array row and column 
	public static int[][] take_input_2darray(){
		// so the massage to the user for the enter the number of the row and column 
		// --------- display massage -----------
		System.out.println(" enter the size of the row ");
		// creating the scanner non primitive data type i think scanner is the object 
		Scanner input = new Scanner(System.in);
		// take input of row and creating the new integer variable data type 
		int row_size = input.nextInt();
		// again  the display the massage for the column 
		System.out.println(" enter the size of the column ");
        // -----------------input-----------------
		int column_size = input.nextInt();
		
		// now the display the massage of the size of the array 
		System.out.println("your matrix size of "+row_size+"*"+column_size);
		
		System.out.println(" enter the value in the matrix  ");
		
		// ------------- creating the new array 2-d
		 int[][]arr = new int[row_size][column_size];
		
		
		for (int i = 0; i < row_size; i++) {
			
			for (int j = 0; j < column_size; j++) {
				System.out.print("your row  "+i+" column "+j+" = ");
				 arr[i][j] = input.nextInt();
				
			}
			System.out.print(" ");
			
		}
		
		
		
	 return arr ; 
	}
	
	// now maketh the gacke d rray 
	// creating the jacked array 
	public static void jacked() {
		// test and creating the reference of the array 
		 int[][]arr = new int[5][];
		 
		 
		
	}
	
	
	// creating the new function 
	public static void out_put(int arr[][]) {
		
		// now calulating the array size 
		int row_size = arr.length ; 
		int colomu_size = arr[0].length ; 
		
		System.out.println(" your enter array is  ");
		for (int i = 0; i < row_size ; i++) {
			for (int j = 0; j < colomu_size; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][]shiv = take_input_2darray() ; 
//		out_put(shiv);
//	//	System.out.println(shiv);
		
		 int[][]shiva = new int[3][];
		 for (int i = 0; i < shiva.length; i++) {
			System.out.println(shiva[i]);
			shiva[i] = new int[5];
		}
		 for (int i = 0; i < shiva.length; i++) {
				System.out.println(shiva[i]);
			
			}
		 

	}

}

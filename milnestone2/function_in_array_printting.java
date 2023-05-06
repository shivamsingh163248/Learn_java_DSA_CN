import java.util.Scanner;

public class function_in_array_printting {
	
	// this is the main class   
	
	// now we will the make the function which Are the return Array 
	public static int[] table() {
		// now 
		// take the scanner for the user input 
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array ");
		int n = input.nextInt();
		// now the initialization of the array 
		int[]shiv = new int[n];
		// insert the array 
		for (int i = 0; i < shiv.length; i++) {
		 System.out.print("input as the index "+i+" : ");
			shiv[i] = input.nextInt();
		}
		// after the taking the input and return value 
		return shiv ; 
	}
	
	// now again making another function with the parameter 
	public static void print(int[]array) {
		// now using the for the loop print the array 
		for (int i = 0; i < array.length; i++) {
			System.out.println("index :"+i+" = "+array[i]);
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now calling the function of the printing and calling the function of the scanner 
		// initializartion of the array and store value with another array 
		int []name ; 
		name = table();
		// now then printing the value of the array through the calling of the function of the printing 
		print(name);

	}

}

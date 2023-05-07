import java.util.Scanner;

public class max_num_array {
	
	// fist make the make the function of take input form the user
	public static int[] input() {
		// hear the return the array 
		// initialization  of the scanner for the taking the input of the scanner 
		Scanner input = new Scanner(System.in);
		// now initialization of the variable for the taking the size of the array 
		System.out.println("enter the size of the array : ");
		int n = input.nextInt() ; 
		// now define the array 
		int[]size ; 
		size = new int[n];
		// now using the for loop for the taking input form the user 
		for (int i = 0; i < size.length; i++) {
			// for the showing the use what  a index the printing the 
			System.out.print("enter the number index "+i+":");
			size[i] = input.nextInt();
		}
		// now return the integer value of the array
		input.close();
		return size;
		
	}
	
	// now again making the new function for the printing any array 
	// so using the for loop we printing the array 
public static void print(int[] arr) {
	// now we are the using the for loop printing the array 
	
	System.out.print("your enter value is : ");
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
}

// again we are the writing the function of the finding max value of the array 
// using simple return the max value 
public static int maxvalue(int[] arr) {
	// hear we passed the parameter of the array 
	// using the loop for trevencing every index 
	int j = Integer.MIN_VALUE ;
	for (int i = 0; i < arr.length; i++) {
		 if (j<arr[i]) {
			j = arr[i];
		}
		 }
	// then now the return value of the in
 return j ;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now hear we are the calling the function frist using taking the input 
		// storing the array value the creating the new array 
		int[]max_num ;
		max_num = input();
		// now printing the value 
		print(max_num);
		// testing the print the max value 
		System.out.println(max_num);
		
		// now calling the function of the max value 
		// System.out.println();
	//	System.out.println(maxvalue(max_num));
		 System.out.println("\n your maximum value is :"+maxvalue(max_num));
//		System.out.println(maxvalue(max_num));
//		System.out.print("67");

	}

}

package nequestion;

import java.util.Scanner;

public class resursion {

	 // creating the new function for the solving the problem 
	public int[]  taking_input() {
		// now this the paremetraic function for the taking the input 
	Scanner input = new Scanner(System.in);
	System.out.println("eneter the number");
	
	// now insizalization the method 
	
		int n =  input.nextInt();
		int[]arr = new int[n];
		// now creating the loop for the solving the problem 
		// now creating the loop 
		for (int i = 0; i < arr.length; i++) {
			
			// each loop have the each number
			// now creating the index of the nunber
			System.out.println("index"+i);
			arr[i] = input.nextInt();
			
		}
		
		return arr ; 
		
		
	}
}

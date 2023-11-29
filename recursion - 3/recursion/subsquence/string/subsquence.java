package recursion.subsquence.string;

import java.util.Scanner;

public class subsquence {
	
	// creating the input function 
	public String takeinput() {
		System.out.println("enter the string");
		Scanner input = new Scanner(System.in);
		String userInput = input.next();
		return userInput ; 
	}
	
	public String[] subsquence(String world) {
		
		// creating the base condition
		
		if (world.length()==0) {
			// creating the array 
			String[]newworld = new String[1];
			newworld[0] = " ";
			return newworld;
			
		}
		
		// now calling the main function 
		
		
		
	}

}

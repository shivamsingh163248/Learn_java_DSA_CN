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
	
	public String[] subsquences(String world) {
		
		// creating the base condition
		
		if (world.length()==0) {
			// creating the array 
			String[]newworld = new String[1];
			newworld[0] = " ";
			return newworld;
			
		}
		
		// now calling the main function 
		String[]sub = subsquences(world.substring(1)) ;
		// System.out.println(sub.length);
		
		// creating the copying of the return array of the double length 
		String[]result =  new String[sub.length*2] ; 
		// now copying the element 
		for (int i = 0; i < sub.length; i++) {
			result[i] = sub[i] ; 
		}
		
		// now creating the loop for the adding the substring in the array 
		for (int i = 0; i < sub.length; i++) {
			result[sub.length + i] = world.charAt(0) + sub[i] ; 
			System.out.println(world.charAt(0) +" + "+ sub[i]);
		}
		
		return result ; 
		
	}

}

package string;

import java.util.Scanner;

public class propertyString {
	
	// creating the method of the scanning of the striing 
	public static String userInput() {
		
		// calling the scanner librebary 
		Scanner input  = new Scanner(System.in) ; 
		
		String userInputString = input.next() ; 
		return userInputString ; 
	}
	
	// again creating the function for the reversing the  string 
	// this is the using for the reversing the string 
	public static String reverseString(String str) {
		// this are the using the reversing the string
		String ans = "" ; 
		// now creating the loop for the adding the char 
		for (int i = str.length()-1; i >= 0 ; i++) {
			
			// using the char method to finding the value that are the required 
			ans +=  str.charAt(i) ;
			
			
		
		}
		
		// now returning the ans 
		return ans ; 
		
		
	}
	
	// creating the method of the checking the pelindrome
	// now updating the file 
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

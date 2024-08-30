package string;

import java.util.Scanner;

import pelindorm.check.pelindromeFunction;

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
		for (int i = str.length()-1; i >= 0 ; i--) {
			
			// using the char method to finding the value that are the required 
			ans +=  str.charAt(i) ;
			
			
		
		}
		
		// now returning the ans 
		System.out.println(ans);
		return ans ; 
		
		
	}
	
	// creating the method of the checking the pelindrome
	// now updating the file 
	
	public static boolean checkPelindrome(String str) {
		
		// this function checking the pelindrome 
		// creating the for loop 
		
		for (int i = 0; i < str.length(); i++) {
			
			// creating the condition we  solving the problem 
			if (str.charAt(i) != str.charAt(str.length()-(i+1)) && str.length()-(i+1) >= i  ) {
				return false  ; 
			}
			
			
			
		}
		return true ; 
		
	}
	
	// creating the function  to check 
	 public static void checkingEquall() {
		
		 // creating the scanner to check the  
		 int[]shi = {1,2,3} ; 
		 int[]iti = {5,65,7} ; 
		 
		 // checking the condition 
		System.out.println(shi == iti);
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// calling the method ans the using this is the static method we can directly accessed all the method 
		String value = userInput() ; 
		// finding the return and the pelindrone 
		reverseString(value) ; 
		System.out.println(checkPelindrome(value));
		// calling the  function and check the result 
		checkingEquall();
		

	}

}

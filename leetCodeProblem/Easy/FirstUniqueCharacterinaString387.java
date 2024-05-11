package Easy;

import java.util.Scanner;

public class FirstUniqueCharacterinaString387 {
	
	
	// creating the input function 
	
	public static String takieinput() {
		
		// creating the scanner object 
		Scanner input = new  Scanner(System.in) ; 
		// calling input from the user 
		System.out.println("enter the string ");
		String world = input.next() ; 
		return world ; 
	}
	
	 public  static int firstUniqChar(String s) {

	      
   	  
   	  for (int i = 0; i < s.length(); i++) {
			// find the fist charector 


   		  char value = s.charAt(i) ; 
   		  
   		  for (int j = 0; j < s.length(); j++) {
				
   			
   			  if(value == s.charAt(j) && j != i ){
					break; 
				} 
               if(j == s.length()-1) {
					return i ; 
				} 
   			  
   			 
   			  
   			 
			}
		}
   	  
       return -1 ; 
   	  
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String val = takieinput() ; 
		System.out.println(firstUniqChar(val));

	}

}

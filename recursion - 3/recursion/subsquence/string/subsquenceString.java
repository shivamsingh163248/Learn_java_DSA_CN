package recursion.subsquence.string;

import java.util.Scanner;

public class subsquenceString {
	
	// creating the method for the finding subsequence 
	public void subsequence(String world , String stringSoFor) {
		System.out.println("world : - "+world+" , "+"substring : - "+stringSoFor);
		// now creating the base condition 
		if (world.length() == 0 ) {
			System.out.println(stringSoFor);
			return ; 
		}
		
		
		String chars = world.substring(1) ; 
		// now creating the 
		 subsequence(chars, stringSoFor);
		
		 subsequence(chars, stringSoFor+world.charAt(0));
		
		 
		
		
	}

}

package tries.patter.matching;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFunctionPatternMatching {
	
	   public static ArrayList<String> takeinput(){
		   
		   // creating the object of the  arraylist 
		   ArrayList<String>world = new ArrayList<>() ; 
		   
		   // for loop for the user display 
		   Scanner input = new Scanner(System.in) ; 
		   
		   System.out.println("enter the number of the string ");
		   int n = input.nextInt() ; 
		   for (int i = 0; i < n; i++) {
			
		System.out.println("enter the string : "+i);
		String newworld = input.next();
		world.add(newworld) ; 
			   
		}
	return world ; 	   
		   
	   }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<String>check = takeinput() ; 
		 Scanner input = new Scanner(System.in) ; 
		
		
		System.out.println("enter the string you want check the pattern ");
		String checkstring = input.next() ; 
		
		// creating the obejct 
		PatterMatchingFunction result = new PatterMatchingFunction() ; 
		
		
		System.out.println(result.pattermatching(check, checkstring) );

	}

}

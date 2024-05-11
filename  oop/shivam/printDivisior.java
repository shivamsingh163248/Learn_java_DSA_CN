package shivam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class printDivisior {
	
	// creating the mothod 
	 public static List< Integer > printDivisors(int n) {
	        // Write your code here
		 List<Integer>number = new ArrayList<>() ; 
		 
		 // creating the loop the number 
		 for (int i = 1; i <= n; i++) {
			 
			
			 // creating the number 
			 
			 // creating the exception 
			 
			 
			 if (n%i == 0) {
				number.add(i) ; 
			}
			 
		}
		 return number ; 

	       
	    }

	 // creating the method to print arraylsit 
	 public static  void print(List<Integer>number) {
		 
		for (Integer i : number) {
			System.out.print(i+" ");
		} 
	 }
	 
	public static void main(String[] args) {
	
     // calling the method 
		System.out.println("enter the number");
		Scanner input = new Scanner(System.in) ;
		int n = input.nextInt() ; 
		
		
		print(printDivisors(n));
		
		
	}

}

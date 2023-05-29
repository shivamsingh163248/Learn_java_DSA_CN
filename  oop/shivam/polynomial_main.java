package shivam;

import java.util.Scanner;

public class polynomial_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// fist we are the taking from the user 
	// USER CALL FOR THE INPUT 
		Scanner input = new Scanner(System.in) ; 
		
		System.out.println("enter the coficent and degeree ");
		// creating the new array 
		System.out.print("enter the number of te forviur serious ");
		int n =  input.nextInt() ;
		
		int num1 = 2 ; 
		int num2  = 1 ; 
		int value = 0 ; 
		 for (int i = 1; i <= n; i++) {
			// for the for the valueupdate
			//	System.out.println(value +" = "+num1+"+"+num2);	
	 value = num1 + num2 ; 
	 System.out.println(value +" = "+num1+"+"+num2);
	 num2 = num1 ; 
	 num1 = value ; 
	
		
		
		
	//	System.out.println(value +" = "+num1+"+"+num2);
		}

	}

}

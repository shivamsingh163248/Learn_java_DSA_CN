package shivam;

import java.util.Scanner;

public class polynomial_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// fist we are the taking from the user 
	// USER CALL FOR THE INPUT 
		Scanner input = new Scanner(System.in) ; 
		
		
//		// creating the new array 
//		System.out.print("enter the number of te forviur serious ");
//		int n =  input.nextInt() ;
//		
//		int num1 = 2 ; 
//		int num2  = 1 ; 
//		int value = 0 ; 
//		 for (int i = 1; i <= n; i++) {
//			// for the for the valueupdate
//			//	System.out.println(value +" = "+num1+"+"+num2);	
//	 value = num1 + num2 ; 
//	 System.out.println(value +" = "+num1+"+"+num2);
//	 num2 = num1 ; 
//	 num1 = value ; 
//	//	System.out.println(value +" = "+num1+"+"+num2);
//		}
		
		System.out.println("enter the size of the polynomial ");
		int n = input.nextInt() ; 
		
		// now the taken the input from the user 
		// frist creating the an array for the taking the input from the user 
		int[]degree = new int[n] ;
		// again creating the array for the cofficent 
		int []cofficent = new int [n] ; 
		// now using the for loop we take the input form the user 
		for (int i = 0; i < cofficent.length; i++) {
			// --------- user display ------------
			System.out.print(" cofficent =  "); 
			cofficent[i] = input.nextInt() ; 
			// again for the degree using the the aray '
			System.out.print(" degree =  ");
			degree[i] = input.nextInt() ; 
		}
		
		// again for the using for the next polynomial 
	// creating the new array for the next user input 
		System.out.println(" enter the next of size of the polynomial ");
		int l = input.nextInt();
		int[]cofficent_next_user_input = new int [l];
		int[]degeree_next_user_input = new int[l];
		
		// using the for loop take the input from the user 
		for (int i = 0; i < degeree_next_user_input.length; i++) {
			System.out.print("cofficent = ");
			cofficent_next_user_input[i] = input.nextInt() ; 
			System.out.println("degree  = ");
			degeree_next_user_input[i] = input.nextInt() ; 
		}
		// check  for the outing value 
		
		
		// now passing the value in the in the object 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for (int i = 0; i < cofficent.length; i++) {
			System.out.print(cofficent[i]+"x"+degree[i]+"+");
			// if there same element on the polymomial then we are the input 
			
		}
		System.out.println();
		for (int i = 0; i < degeree_next_user_input.length; i++) {
			System.out.print(cofficent_next_user_input[i]+"x"+degeree_next_user_input[i]+"+");
		}
		

	}

}

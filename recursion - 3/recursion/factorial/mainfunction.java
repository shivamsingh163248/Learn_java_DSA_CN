package recursion.factorial;

import java.util.Scanner;

import recursion.subsquence.string.subsquence;

public class mainfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		factorual check = new factorual();
		Scanner input = new Scanner(System.in) ;
		System.out.println("enter the number");
		int n = input.nextInt();
		System.out.println(check.facorial(n));
		check.factorial(n, 1);
		
		// creating the input form the user 
		System.out.println("enter the number");
		int size = input.nextInt();
		// now creating the loop 
		int[]arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("index : "+i);
			int num = input.nextInt();
			arr[i] = num ; 
			
		}
		
		System.out.println(check.minarray(arr, 5));
		
		
		
	

	}

}

package greekofGreeProblem;

import java.util.Scanner;

public class Equilibrium_Point {
	
	// creating the function take input as the arrys according to index 
	public static int[] takeinputArray() {
		
		// taking the input size 
		// taking the input from the user 
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter the size of the arrys ");
		int n = input.nextInt() ; 
		
		int[]arr = new int[n] ; 
		
		// creating the loop of the taking the input 
		for (int i = 0; i < arr.length; i++) {
			// taking input 
			int num = input.nextInt() ; 
			arr[i] = num ; 
		}
		
		return arr ; 
	}
	
	
	// creating the function taking the 
	public static int EqulibirumPoin(int[]arr) {
		
		int n = arr.length ; 
		// creating the arr
		int[]prifixsum  = new int[arr.length];
		int[]postfixSum = new int[arr.length] ; 
		
		
		prifixsum[0] = arr[0] ; 
		postfixSum[n-1] = arr[n-1] ; 
		
		
		
		// now creating the loop for the sum of the number stored in the arrys 
		for (int i = 1; i < arr.length; i++) {
			
			
			prifixsum[i] = prifixsum[i-1]+arr[i] ; 
			
		}
		
		//again creating the for loop 
		for (int i = n-2; i >= 0 ; i--) {
			
			// now stored the values 
			postfixSum[i] = postfixSum[i+1]+arr[i] ; 
		}
		
		// creating the loop for the checking the condtion 
		for (int i = 0; i < arr.length; i++) {
			// creating the conditon 
			if (postfixSum[i]==prifixsum[i]) {
				return i ; 
			}
		}
		return -1 ; 
		
	}
	
	

	public static void main(String[] args) {
		
		int arr[] = {-7, 1, 5, 2, -4, 3, 0};

		System.out.println(EqulibirumPoin(arr));

	}

}

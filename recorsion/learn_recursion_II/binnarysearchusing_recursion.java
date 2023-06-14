package learn_recursion_II;

import java.util.Scanner;

public class binnarysearchusing_recursion {
	
	// creating the function of the array input and return array 
	public static int[] arrayinput() {
		// frist creating the scanner non primitive deta type 
		Scanner  input = new Scanner(System.in) ; 
	// enter the sixe of the aray 
		System.out.println("enter the nubmer size of the array ");
		int n = input.nextInt() ;
		System.out.println("enter the aray in the shorting manner ");
		
		// creating the array 
		int[]arr = new int[n];
		// set the value in the array 
		for (int i = 0; i < arr.length; i++) {
			System.out.println("ente number at index "+i);
			arr[i] = input.nextInt() ; 
		}
		
		return arr ; 
	}
	
	// again creating the new array 
	public  static int bannary(int[]arr ,int si , int li ,int n   ) {
		// frist creating the base condation 
		if (si>li) {
			return -1 ; 
		}
		
		// now calculating mid value 
		int midvalue = (si+li)/2 ;
		// check if n present in the middle of the element 
		if (arr[midvalue] == n ) {
			// now  return the midvalue 
			return midvalue ; 
		}else if (midvalue< n ) {
			return bannary(arr, midvalue+1, li, n) ; 
		}else {
			return bannary(arr, si, midvalue-1, n);
		}
		
		
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// now calling the function of the 
		int[]shiv = arrayinput();
		int a = bannary(shiv, 0, shiv.length-1, 25);
		System.out.println(a);

	}

}

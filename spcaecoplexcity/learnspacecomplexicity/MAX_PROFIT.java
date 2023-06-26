package learnspacecomplexicity;

import java.util.Scanner;

 class MAX_PROFIT {
	
	// NOW CREATING THE FUNCTION OF THE MAXPROFIT 
	private int[]arr ; 
	private static int shivam ; 
	
	// now creating the constructor with the parameter 
	MAX_PROFIT(){
		System.out.println("this is the constrocter");
	}
	
	// creating the getter and setter for the set value using the number 
	// again the constructor with are array parameter '
	public MAX_PROFIT (int[]arr) {
		this(); 
		this.arr = arr ;
	}
	
	
	
public  static int[] arrayScane() {
	// creating the function of the set the value 
	  Scanner input = new Scanner(System.in) ; 
	  // now printing the massage to the user for the enter the size of the array 
	  System.out.print("enter the size of the array = :");
	  int size = input.nextInt() ; 
	  System.out.print("enter the array ");
	  // creating the new array 
	  int[]arr = new int[size] ; 
	  // using the for loop for the entering the value 
	  for (int i = 0; i < arr.length; i++) {
		System.out.print("index = "+i+" = ");
		arr[i] = input.nextInt() ; 
	}
	  System.out.println(shivam);
	  System.out.println();
	  return arr ; 
}
	public int[] getArr() {
	return this.arr; 
}

public void setArr(int[] arr) {

	this.arr = arr;
}

// using the getter and setter method 

public static int getShivam() {
	return shivam;
}

public static void setShivam(int shivam) {
	MAX_PROFIT.shivam = shivam;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	// 	System.out.println(shivam.arr); 
		int[]arr = arrayScane() ; 
		
		// call the function for the setting the value 
		// again the constructor with the parameter 
		MAX_PROFIT shivam = new MAX_PROFIT(arr) ;
		
		
		shivam.setArr(arr);
		System.out.println(shivam.arr); 
		// checking the printing of the array 
		for (int i = 0; i < shivam.arr.length; i++) {
			int j = shivam.arr[i];
			System.out.println(j);
			
		}
		System.out.println(shivam.shivam);
		// now set the value of the static value that are changed in the over all class and package 
		shivam.setShivam(24);
		System.out.println(shivam.shivam);
		
		

	}


}

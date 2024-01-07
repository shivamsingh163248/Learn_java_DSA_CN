package simplebacktracking;

public class printAllPosibleNumber {
	
	// creating the method 
	
	// creating the print method 
	public static  void print(int[]arr) {
		// creating the for each loop 
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	public static  void printAllPosiblenumber(int[]arr , int n  , int i  ) {
		
		if (n == i) {
			print(arr);
			return  ; 
		}
		
		// now calling the same function 
		arr[i] = 1 ; 
		printAllPosiblenumber(arr, n, i+1);
		
		arr[i] = 2 ; 
		printAllPosiblenumber(arr, n, i+1);
		
		return ; 
		
		
	}
	
	// creating the main function 
	public static void main(String[] args) {
		
		int[]arr = {1,2} ; 
		printAllPosiblenumber(arr, arr.length, 0);
	}

}

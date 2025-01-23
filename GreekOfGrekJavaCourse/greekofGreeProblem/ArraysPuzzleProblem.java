package greekofGreeProblem;

public class ArraysPuzzleProblem {
	
	// creating the function 
	// first writing case
	public static int[] puzzle(int[]arr) {
		
		int[]result = new int[arr.length];
				
				// creating the time complexity O^2
	 for (int i = 0; i < result.length; i++) {
		 int sum = 1 ; 
		
		 for (int j = 0; j < result.length; j++) {
			
			 if(i!=j) {
				 
				 // now adding all the sum 
				 sum *= arr[j] ; 
			 }
		}
		 result[i] = sum ; 
	}
		return result ; 
		
	}

	// now writing the otmized code 
	
	public static int[] puzzel(int[]arr) {
		
		// creating the new arrays 
		int[]reult = new int[arr.length] ; 
		
		// creating the all the sum 
		// creating the loop 
		int product =1 ; 
		
	
		
		// creating the double loop 
		for (int i = 0; i < reult.length; i++) {
			product *= arr[i] ; 
		}
		for (int j = 0; j < reult.length; j++) {
		    reult[j] = product / arr[j] ; 
		}
		
		return reult ; 
		
		// this found the error 
		
	}
	
	// creating the another approch 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

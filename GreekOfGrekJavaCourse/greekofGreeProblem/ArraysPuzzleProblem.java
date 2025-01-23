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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

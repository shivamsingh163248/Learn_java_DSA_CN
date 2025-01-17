package greekofGreeProblem;

public class longestSubArrays {
	
	public static int maxLen(int[] arr  ,  int k ) {
        // creating the algo for the writing the longest arrys 
		int largestArr = 0 ; 
		
		
		// creating the loop for the solved the problem 
		for (int i = 0; i < arr.length; i++) {
			// again creating the loop for the sum 
			int sum = 0 ; 
			
			
			for (int j = i; j < arr.length; j= j+2) {
				
				// hear we are the checking creating 
				sum += arr[j] ; 
				
				// creating the condtion if the longest array 
				if (sum == k) {
					// now writing the condition using the math max function to test the condition 
					int logarys = j-i ; 
					largestArr = Math.max(largestArr, j) ; 
				}
			}
			
		}
		
		// return the longest element 
		return largestArr ; 
		
    }
	
	public static int  checking(int[]arr) {
		
		int zero = 0 ; 
		int one = 0 ; 
		
		// creating the loop 
		for (int i = 0; i < arr.length; i++) {
			// creating the condition 
			
			if (arr[i] == 0 ) {
				zero++ ; 
			}else {
				one++ ; 
			}
		}
		
		// checking the condition 
		if (zero == one && zero > 0) {
			return zero+one ; 
		}else {
			return -1 ; 
		}
		
		
		
	}

	public static void main(String[] args) {
		
       
	}

}

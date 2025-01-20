package greekofGreeProblem;

import java.util.HashMap;

public class LongestSubArryasSumk {
	
	// using the hash map we solved the problem 
	// creating the function of the hasMap to solved the problem 
	public static int LongestSubArray(int[]arr , int k ) {
		
		// creating the hasMap which have the key and values
		// hasMap is the generic 
		int prefixSum = 0 ; 
		int res = 0 ; 
		
		
		HashMap<Integer,Integer>map = new HashMap<>() ;
		// hasMap the property to set the values 
		// creating the loop 
		for (int i = 0; i < arr.length; i++) {
			
			// creating the store the value in the hasMap
			
			prefixSum += arr[i]  ; // hear we are the storing the value 
			
			
			if ( prefixSum == k) {
				res = i+1 ; 
			}else if (map.containsKey(prefixSum-k)) {
				
				// using the math length 
				//now getting the length 
				res = Math.max(res, i - map.get(prefixSum-k)) ; 
			}
			
			// creating the 
			if(!map.containsKey(prefixSum)) {
				// adding the values in the hasMap
				map.put(prefixSum, i) ; 
			}
			
			
			
		}
		
		return res ; 
		
	}

	public static void main(String[] args) {
		
		int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(LongestSubArray(arr, k));
		

	}

}

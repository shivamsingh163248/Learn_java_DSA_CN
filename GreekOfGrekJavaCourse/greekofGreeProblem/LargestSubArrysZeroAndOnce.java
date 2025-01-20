package greekofGreeProblem;

import java.util.HashMap;

// creating the function of the longest sum arrys 
// creating the static function 

public class LargestSubArrysZeroAndOnce {
	
	// creating the function 
	public static int longestArr(int arr[]) {
		
		int sum = 0 ; 
		int LongestArrys = 0  ; 
		
		// creating the hasMap
		HashMap<Integer, Integer>map = new HashMap<>() ; 
		
		
		// creating the condition 
	    // creating the loop 
		for (int i = 0; i < arr.length; i++) {
			
			// creating a sum 
			sum += (arr[i] == 0 )? 1:-1 ; 
			
			// now creating the condtion 
			if(sum == 0) {
			  LongestArrys = i+1 ; 	
			}
			
			//creating the condition checking in the hasMap 
			if(map.containsKey(sum)) {
			 // updating the values 
				Math.max(LongestArrys, i - map.get(sum)) ; 
			}
			
			if(!map.containsKey(sum)) {
				// adding the key 
				map.put(sum, i) ; 
			}
			
			
			
		}
		
		return LongestArrys ; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

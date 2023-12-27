package All.Unique.subset;

import java.util.ArrayList;
import java.util.Arrays;

public class AllUniqueSubset {
	
	// print all unique subset
	// creating the function of the getsubset array 
	public ArrayList<ArrayList<Integer>> getArray(int[]input){
		Arrays.sort(input);
		// creating the object of the subset and current subset of the arraylist 
		ArrayList<ArrayList<Integer>>subset = new ArrayList<>();
		ArrayList<Integer>currentSubset = new ArrayList<>() ; 
		
		// now calling the function of generate subset 
		generateSubsets(input, 0, currentSubset, subset);
		return subset ; 
		
		
	}
	
	// creating the helper function that is the name of the generate subset 
	
	private static void generateSubsets(int[] input , int index , ArrayList<Integer>currentSubset , ArrayList<ArrayList<Integer>>subset) {

		subset.add(new ArrayList<>(currentSubset));
		
		// now creating the for loop 
		for (int i = 0; i < input.length; i++) {
			
			if ( i > index && input[i] == input[i-1]) {
				continue ; 
			}
			
			currentSubset.add(input[i]);
			
			// now calling the same function for the adding the list 
			generateSubsets(input, i+1, currentSubset, subset);
			currentSubset.remove(currentSubset.size()-1) ; 
			
			
		}
		
		
		
		
	}
	
	
	
	// creating the print function for the sunset 
	
	
	
	}

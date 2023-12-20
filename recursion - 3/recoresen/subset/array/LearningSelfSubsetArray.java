package recoresen.subset.array;

public class LearningSelfSubsetArray {
	
	// creating the public function 
	public int[][] subsetHelper( int[]arr , int startingIndex){
		// creating the base condtion 
		if (arr.length == startingIndex) {
			// initializes the 2d array 
			int[][]output = new int[1][0] ; 
			return output ; 
			
		}
		
		
		// now calling the same function 
		int[][]smalloutput = subsetHelper(arr, startingIndex+1);
		// creating the new size of the output 
		int[][]output = new int[2*smalloutput.length][] ; 
		
		// now creating the copying 
		int k = 0 ; 
		for (int i = 0; i < smalloutput.length; i++) {
			// now creating the output length of the single array 
			output[k] = new int[smalloutput[i].length] ; 
			// again creating the for loop 
			    for (int j = 0; j < smalloutput[i].length; j++) {
					
			    	// now coping the value 
			    	
				}
		}
		
	}

}

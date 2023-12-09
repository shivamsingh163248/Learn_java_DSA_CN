
public class subsetsumTOk {

	
		// creating the base condition 
	
	// creating the function of the sum of the subset of K 
	public int[][] sunSubset(int[]input , int k){
		
		// creating the helper function
		return subsetHelper(input , k , 0) ; 
		
	}

		private int[][] subsetHelper(int[] input, int k, int begainIndex) {
			
		// creating the base function
			// if the begain index is the equall 
			if (input.length == begainIndex) {
				
				if ( k == 0 ) {
					return new int[1][0] ; 
				}else {
					return new int[0][0] ; 
				}
			}
			
			
			//  calling the array for the small input 
			int[][] samlloputput1 = subsetHelper(input, k, begainIndex+1) ; 
			int[][]smalloutput2 = subsetHelper(input, k-input[begainIndex], begainIndex+1) ; 
			
			int[][]output = new int[smalloutput2.length+samlloputput1.length][] ; 
			
			int index = 0 ; 
			
			// creating the loop using the for loop 
			for (int i = 0; i < samlloputput1.length; i++) {
				output[index++] = samlloputput1[i]; 
			}
			
			for (int i = 0; i < smalloutput2.length; i++) {
				output[index] = new int[smalloutput2[i].length+1] ;
				output[index][0] = index[begainIndex] ; 
				
				for (int j = 0; j < smalloutput2[i].length; j++) {
					output[index][j+1] = smalloutput2[i][j] ; 
				}
				index++ ; 
			}
			
			return output ; 
		}
	
	
	
	}



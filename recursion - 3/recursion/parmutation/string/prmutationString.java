package recursion.parmutation.string;

public class prmutationString {
	
	// creating the method 
	// for the printing the array string parmutation 
	public String[] parmutation(String world) {
		
		// creating the base condition 
		if (world.length() == 0) {
			// creating the blank string world 
			String[]output = {" "} ; 
			return output ; 
		}
		
		// now calling the function 
		String[]smalloutput = parmutation(world.substring(1)) ; 
		// now again 
		System.out.println(smalloutput.length);
		String[]output = new String[smalloutput.length*world.length()] ;
		// now creating the loop and the insilatization thavalue is the k 
		int k = 0 ; 
		// creating the loop 
		for (int i = 0; i < smalloutput.length; i++) {
			String currentstring = smalloutput[i] ; 
			// now gain creating the loop 
			for (int j = 1; j <= currentstring.length(); j++) {
				output[k] =  currentstring.substring(0,j)+world.charAt(0)+currentstring.substring(j) ; 
		
				k++ ; 
			}
			
			
			
		}

		
		return output ; 
		
	}

}

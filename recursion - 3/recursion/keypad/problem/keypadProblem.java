package recursion.keypad.problem;

import learn_recursion_II.string_replacement;

public class keypadProblem {

	
	// creating the helper function of the char 
	public String[] helper(int n ) {
		
		// creating the char array 
		// creating the switch statement 
		
		String[]result ; 
		
		switch (n) {
		case 2:
			
			result = new String[3] ; 
			result[0] = "a" ; 
			result[1] = "b" ; 
			result[2] = "c" ; 
			
			break;
        
		case 3:
			
			result = new String[3] ; 
			result[0] = "a" ; 
			result[1] = "b" ; 
			result[2] = "c" ; 
			
			break;
		case 4:
			
			result = new String[3] ; 
			result[0] = "a" ; 
			result[1] = "b" ; 
			result[2] = "c" ; 
			
			break;		
		case 5:
				
				result = new String[3] ; 
				result[0] = "a" ; 
				result[1] = "b" ; 
				result[2] = "c" ; 
				
				break;
		case 6:
			
			result = new String[3] ; 
			result[0] = "a" ; 
			result[1] = "b" ; 
			result[2] = "c" ; 
			
			break;
		case 7:
			
			result = new String[4] ; 
			result[0] = "a" ; 
			result[1] = "b" ; 
			result[2] = "c" ; 
			
			break;
		case 8:
			
			result = new String[3] ; 
			result[0] = "a" ; 
			result[1] = "b" ; 
			result[2] = "c" ; 
			
			break;
		case 9:
			
			result = new String[4] ; 
			result[0] = "a" ; 
			result[1] = "b" ; 
			result[2] = "c" ; 
			
			break;
        
        


		default:
			
			result = new String[0]; 
			break;
		 
			
		}
		
		
		return result ; 
		
		
	}
	
	
	
	public String[] keypad(int n){
		// Write your code here
		
		// creating the helper function 
		keypadHelper()

	}
	
	public String[] keypadHelper(char[]input , String[]output , int n ) {
		
		
		// creating the base condition 
		if (n/10 == 0) {
		 // creating the new string array 
			String[]result = helper(n) ; 
			 return result ; 
		}
		
		
		
		
		
		
		
		
		
		return output;
	}
	
}

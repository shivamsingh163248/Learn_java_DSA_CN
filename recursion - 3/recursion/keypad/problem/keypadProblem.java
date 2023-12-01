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
			result[0] = "d" ; 
			result[1] = "e" ; 
			result[2] = "f" ; 
			
			break;
		case 4:
			
			result = new String[3] ; 
			result[0] = "g" ; 
			result[1] = "h" ; 
			result[2] = "i" ; 
			
			break;		
		case 5:
				
				result = new String[3] ; 
				result[0] = "j" ; 
				result[1] = "k" ; 
				result[2] = "l" ; 
				
				break;
		case 6:
			
			result = new String[3] ; 
			result[0] = "m" ; 
			result[1] = "n" ; 
			result[2] = "o" ; 
			
			break;
		case 7:
			
			result = new String[4] ; 
			result[0] = "p" ; 
			result[1] = "q" ; 
			result[2] = "r" ;
			result[3] = "s" ;
			
			break;
		case 8:
			
			result = new String[3] ; 
			result[0] = "t" ; 
			result[1] = "u" ; 
			result[2] = "v" ; 
			
			break;
		case 9:
			
			result = new String[4] ; 
			result[0] = "w" ; 
			result[1] = "x" ; 
			result[2] = "y" ;
			result[3] = "z" ; 
			
			break;
        
        


		default:
			
			result = new String[0]; 
			break;
		 
			
		}
		
		
		return result ; 
		
		
	}
	
	
	
	public String[] keypad(int n){
	  
		if (n == 0) {
			
			// creating the string 
			String[]result = new String[0];
			return result ; 
			
		}
		
		// now calling the same function 
	String[]smallarray = 	keypad(n/10) ;
	String[]smallworld = helper(n%10) ; 
	// now creating the algorithum 
	// fist creating the length 
	String[]result = new String[smallarray.length * smallworld.length] ; 
	int k = 0 ; 
	// now creating the loop 
	for (int i = 0; i < smallworld.length; i++) {
		for (int j = 0; j < smallarray.length; j++) {
			
			// now adding the both of the string 
			result[k] = smallarray[j]+smallworld[i] ; 
			k++ ; 
		}
	}
	
	return result ; 
	

	}
	

	
}

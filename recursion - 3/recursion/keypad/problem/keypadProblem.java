package recursion.keypad.problem;

public class keypadProblem {

	
	// creating the helper function of the char 
	public char[] helper(int n ) {
		
		// creating the char array 
		// creating the switch statement 
		
		char[]result ; 
		
		switch (n) {
		case 2:
			
			result = new char[3] ; 
			result[0] = 'a' ; 
			result[1] = 'b' ; 
			result[2] = 'c' ; 
			
			break;
        case 3:
			
			result = new char[3] ; 
			result[0] = 'd' ; 
			result[1] = 'e' ; 
			result[2] = 'f' ; 
			 
			break;
			
        case 4:
			
			result = new char[3] ; 
			result[0] = 'g' ; 
			result[1] = 'h' ; 
			result[2] = 'i' ; 
			
			break;
        case 5:
			
			result = new char[3] ; 
			result[0] = 'j' ; 
			result[1] = 'k' ; 
			result[2] = 'l' ; 
			
			break; 
        case 6:
			
			result = new char[3] ; 
			result[0] = 'm' ; 
			result[1] = 'n' ; 
			result[2] = 'o' ; 
			
			break;
     
       case 7:
			
			result = new char[4] ; 
			result[0] = 'p' ; 
			result[1] = 'q' ; 
			result[2] = 'r' ; 
			result[3] = 's' ;
			
			break;
			
       case 8:
			
			result = new char[3] ; 
			result[0] = 't' ; 
			result[1] = 'u' ; 
			result[2] = 'v' ; 
			
			break;
       case 9:
			
			result = new char[4] ; 
			result[0] = 'w' ; 
			result[1] = 'x' ; 
			result[2] = 'y' ;
			result[2] = 'z' ;
			
			break;

		default:
			
			result = new char[0]; 
			break;
		 
			
		}
		
		
		return result ; 
		
		
	}
	
}

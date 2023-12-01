package recursion.factorial;

public class factorual {
	
	// creating the method 1  for the factorial 
	
	public int facorial(int n ) {
		
		// creating the base condition 
		if (n == 0 ) {
			return 1 ; 
		}
		
		
		// now calling the same function 
		  int res   = facorial(n-1) ; 
		  int result = res*n ; 
		  return result ; 
	}

}

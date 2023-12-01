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
	
	// now writing the second function 
	public void factorial(int n , int value) {
		
		// creating the base condition 
		if (n==0) {
			System.out.println(value);
			return ; 
		}
		
		// now process the algorithum
		int smallfact = value*n ; 
		// now updating the value 
		
		
		// now calling the same function 
		factorial(n-1, smallfact);
	}

	
	// creating the function of the min array 
	
	public int minarray(int[]input , int startIndex) {
	
		// creaitng the base function 
		if (input.length-1 == startIndex) {
			return Integer.MIN_VALUE ; 
		}
		
		// now calling the same function 
		
		int n = minarray(input, startIndex++);
		
		// check the fist value and the returning value 
		int temp = 0 ; 
		
		if (n  >  input[startIndex]) {
			
			temp = input[startIndex] ; 
			
		}else {
			temp = n ; 
		}
		
		return temp ; 
		
		
	}
	
}

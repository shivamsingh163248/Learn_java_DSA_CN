package learn_recursion;

public class recursion {

	private int c ; 
	
	// creating the function of the factoral 
	
	public void factorial(int n ) {
		// find the valie of i less then factorial 
		// check the condation for loop 
		if (n== 0 ) {
			return ; 
		}
	System.out.println( n );
	factorial(n-1);
	 
	}
}

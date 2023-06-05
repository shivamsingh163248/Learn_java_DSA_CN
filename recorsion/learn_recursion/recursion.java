package learn_recursion;

public class recursion {

	private int c ; 
	
	// creating the function of the factoral 
	int fat = 1 ;
	public void factoriale(int n ) {
		// find the valie of i less then factorial 
		// check the condation for loop 
		if (n== 0 ) {
			return ; 
		}
	System.out.println( n );
	factoriale(n-1);
	System.out.println( n );
	// lets the value array mulipied and making the facetorial 
	fat *= n ; 
//	int facte =   fact*n ; 
	System.out.println(fat+" **");
	
	 
	}
	
	// make another factorail function 
	public int factorial(int n ) {
		if(n == 0) {
			return 1 ; 
		}
		
		int function_return = factorial(n-1);
		int output = n * function_return ; 
		System.out.println(output+" == "+n+" *  "+function_return);
		return output ; 
	}
	
}

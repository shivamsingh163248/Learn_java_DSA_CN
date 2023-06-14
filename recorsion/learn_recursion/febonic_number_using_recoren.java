package learn_recursion;

public class febonic_number_using_recoren {
	// creating the function of the writing the febonenic number 
	
  public static int fabonic(int n ) {
	  if (n == 1 || n==2) {
		return 1 ; 
	}
	  
	  // now calling the function each other and learn how actually work 
	  System.out.println("value of n before "+n);
	  int value1 = fabonic(n-1) ; 
	  System.out.println("value 1 =" +value1 +" , n = "+ n );
	  System.out.println("value of n  "+n);
	  int value2 = fabonic(n-2) ; 
	  System.out.println("value 2 =" +value2 +" , n = "+ n );
	  
	  
	 // System.out.println(value1+" "+value2);
	  int res = value1+value2 ; 
	  return res ;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calling the function 
		int c = fabonic(5) ; 
		System.out.println(c);
		

	}

}

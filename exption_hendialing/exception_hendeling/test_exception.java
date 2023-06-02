package exception_hendeling;

public class test_exception {
	
	//  public static int fact(int n){
		
		  //  creating the divide function 
		  public static int divide(int a , int b ) throws divideByZero {
			  if (b==0) {
		//		throw new ArithmeticException() ; 
				throw new divideByZero() ;
			}
			  int c = a/b ; 
			  return c ; 
			  
			  }
		  
		  
	  

	public static void main(String[] args) throws divideByZero { 
		// TODO Auto-generated method stub
		
//		// now creating the string null 
//		String name = null ; 
//		// try to finding the string length 
//		System.out.println(name.length()); //**** GENERATING THE NULL EXCEPTION *******
//		
//		// again creating the arithmetic  exception 
//		System.out.println(5 / 0);
		
		
		// calling the function with the parameter 
		divide(50, 0);

	}

}

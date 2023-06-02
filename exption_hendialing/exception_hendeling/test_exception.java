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
		  
		  
	  

	public static void main(String[] args) /* throws divideByZero */ { 
		// TODO Auto-generated method stub
		
//		// now creating the string null 
//		String name = null ; 
//		// try to finding the string length 
//		System.out.println(name.length()); //**** GENERATING THE NULL EXCEPTION *******
//		
//		// again creating the arithmetic  exception 
//		System.out.println(5 / 0);
		
		
		// calling the function with the parameter 
		try {
			divide(50, 0);
			System.out.println("this is the  try part of the exception ");
			
		} catch (divideByZero e) {
			// TODO Auto-generated catch block
			System.out.println("hear is the generation exception and generate the record ");
			e.printStackTrace();
		}
		
		System.out.print("if i am deal with the exception then it is the print exception using the try and catch  method ");
		
		// exceptiom are handle with through decleration 
		// exception are handal with the try and cautch method 
		
		
		

	}

}

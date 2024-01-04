package exception_hendeling;

public class learn_ex {
	
	// creating the method 
	public static int divide(int a , int b ) throws ArithmeticException   {
		
		// now write the expression 
		int result ; 
		
		if (b== 0) {
			throw  new ArithmeticException(); 
		}
		result = a/b ; 
		return result ; 
		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		// now calling the function 
// int shiva = divide(4, 0);	
		
		try {
			int shivam = divide(4, 0) ; 
		} catch (ArithmeticException e) {
		  System.out.println("rror");
		  e.printStackTrace();
		}
		
		
		
		

	}

}

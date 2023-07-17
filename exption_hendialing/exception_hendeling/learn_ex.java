package exception_hendeling;

public class learn_ex {
	
	// creating the method 
	public static int divide(int a , int b ) throws divideByZero {
		
		// now write the expression 
		int result ; 
		
		if (b== 0) {
			throw new divideByZero() ; 
		}
		result = a/b ; 
		return result ; 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// now calling the function 
		try {
			int shivam = divide(4, 6) ;
		} catch (divideByZero e) {
			// TODO Auto-generated catch block
			System.out.println("you are the input 0 ");
			e.printStackTrace();
		} 

	}

}

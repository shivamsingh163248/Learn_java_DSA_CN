package exception_hendeling;

public class learn_exception {
	
	// creating the function of the array and string and arithmetic expression 
	
	// creating the function  of the array 
	public  void check_array_eception (int number_of_time , int array_size) throws showError {
		// using the for loop 
		// creating the new array of the size n ; 
		if (array_size > number_of_time) {
			throw new ArrayIndexOutOfBoundsException() ; 
		}
		
		// if am generating the own exception then creating the class for the generating the 
		if(array_size == 0) {
			throw new showError();
		}
		
		
		int[]arr = new int[array_size] ; 
		for (int i = 0; i < number_of_time; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	// creating the next function of the string 
	public int check_string(String name) throws showError  {
		
	if (name == null) {
		// creating the exception 
		throw new showError() ; 
	}
		int c = name.length() ; 
		
		return c ; 
	}
	
	// again creating the divide function you know 0 cant not be divide any other value 
public int divide(int a , int b ) {
	int c = a/b ; 
	return c ; 
	
}
	

	public static void main(String[] args) {
		
	}
	
	
}

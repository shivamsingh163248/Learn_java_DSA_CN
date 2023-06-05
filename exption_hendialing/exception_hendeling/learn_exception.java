package exception_hendeling;

import java.util.Scanner;

public class learn_exception {
	
	// creating the function of the array and string and arithmetic expression 
	
	// creating the function  of the array 
	public static void check_array_eception (int number_of_time , int array_size) throws showError {
		// using the for loop 
		// creating the new array of the size n ; 
		if (array_size < number_of_time) {
			// throw new ArrayIndexOutOfBoundsException() ; 
			throw new showError();
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
	public static int check_string(String name) throws showError  {
		
	if (name == null) {
		// creating the exception 
		throw new showError() ; 
	}
		int c = name.length() ; 
		
		return c ; 
	}
	
	
	
	// again creating the divide function you know 0 cant not be divide any other value 
public static int divide(int a , int b ) throws showError {
	if (b == 0) {
		throw new showError() ; 
	}
	int c = a/b ; 
	c = 10 ;
	return c ; 
	
}

// creating one more function for the dealing with the exception 
public static int check_divide_exception(int a , int b) {
	int res = 0 ;
	// call the above function 
	
	try {
		res = divide(a, b) ;
	} catch (showError e) {
		// TODO Auto-generated catch block
		System.out.println("hear we are the generating the exception ");
		e.printStackTrace();
	} 
	return res ; 
}
//---------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------

	public static void main(String[] args)  {
		
		// call the main function one by one and check the exception handling of the above function 
		Scanner input = new Scanner(System.in) ; 
		System.out.println("enter the size of the array ");
		int array_size = input.nextInt() ; 
		System.out.print("enter the loop of the array ");
		int no_loop = input.nextInt() ; 
		System.out.println("enter the string");
		String name = input.next() ; 
		System.out.println("enter the value for the divide");
		int a  = input.nextInt() ; 
		int b = input.nextInt() ; 
		
		// now calling the function 
		try {
			check_array_eception(no_loop, array_size);
			System.out.println(" this the try of the loop ");
		} catch (showError e1) {
			// TODO Auto-generated catch block
			System.out.println(" this is arry of the loop  this the catch function ");
			e1.printStackTrace();
		}
		try {
			check_string(name);
			System.out.println(" this is for the string for the correct expression ");
		} catch (showError e) {
			// TODO Auto-generated catch block
			System.out.println(" this the generatig the error fot the name ");
			e.printStackTrace();
		}
		check_divide_exception(a, b);
		
		System.out.println(" this is for the overall ok ");
		
		
		
	}
	
	
}

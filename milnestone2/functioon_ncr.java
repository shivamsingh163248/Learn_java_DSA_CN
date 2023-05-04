import java.util.Scanner;

public class functioon_ncr {
	
	
	// hear we write the function and the gain the result 
	// hear we are the passing the argument with the parameter  // so lets the inilized the variable 
	
	private static int  factorial(int n ) {
		// lets the start the the calculating the factorial of the value 
		// take the  return variable where we are the storing the value in tha multiple due to hear we find the 
		// fectorial of the number
		int fector = 1;
		int i = 1 ; 
		while (i>= n) {
			// using the assigment operator for the calculating value 
			fector *= i;
			i++ ; 
		}
		return fector;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hear lets the creating the function and solved the ncr that are the formula of the parmutation and 
		// combination so now the question this the way to 
		
		// now we are the using the scanner method for the taking input from the user 
		Scanner input = new Scanner(System.in);
		// inialization the variable for the storing the input which get from the user 
		System.out.println("enter the number of the n ");
		int n = input.nextInt();
		System.out.println(" enter the number of the r ");
		int r = input.nextInt();
		
		// now hear we are the using the function for the calculation the factorial 
		// fist we are calculation of the n! 
		int z = factorial(n); // factorial are the inilazation in the z varialbe 
		// now again we are calculation the r! 
		int w = factorial(r);
		
		// now hear we are the calculAtion the n-r! 
		int t = (n-r);
		// now we are the finding the n-r factorial 
		// calling the function for the factorial 
		int u = factorial(t);
		
		// now we are the calcuAltion the factorial 
		int ncr = z/(u*w);
		System.out.println(ncr);
		
		input.close();

	}

	
	
	
}

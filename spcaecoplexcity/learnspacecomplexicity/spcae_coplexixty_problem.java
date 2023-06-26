package learnspacecomplexicity;

public class spcae_coplexixty_problem {
	
	public static  int factorial(int num ) {
	 if (num == 1) {
		return 1 ; 
	}
	 // calling the function and reach the base condition 
	 int  smallnum = factorial(num-1) ; 
	 int result = num*smallnum ; 
	 return result ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// learn the factorial using the recurrence relation of the writing the program 
		// calling the function for the checking the result 
		int value = factorial(5) ; 
		// check for the printing 
		System.out.println(value);

	}

}

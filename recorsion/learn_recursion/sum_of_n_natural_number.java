package learn_recursion;

public class sum_of_n_natural_number {
	
	// creating the function oafa the calculateing the sum of the n number 
	public static int sumOfNtural(int n ) {
		
		// fist  write the base condition 
		if (n == 0) {
			return 0 ; 
		}
		// calling the function for the sum value 
		int res = sumOfNtural(n-1) ; 
		int resu = res+n ;
		// checking for the how actually are the work 
		System.out.println( n +" " +res+" "+resu);
		return resu ; 
		
		
		
	}
	
	// if you are  the limit form hear to there find the number 
	
	public static int snm_natural(int starting_num , int end_num) {
		if (end_num == starting_num) {
			return starting_num ; 
		}
		
		// calling the same function 
	
		// calculating the value of the number 
		int retrun_value = snm_natural(starting_num, end_num-1);
		int result = retrun_value+end_num ; 
		return result ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// calling the function for the writing the code 
		int n = sumOfNtural(10) ; 
		System.out.println(n);
		int s = snm_natural(5, 10) ; 
		System.out.println(s);
	}

}

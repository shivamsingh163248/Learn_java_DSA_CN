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

	// now creating the above method of the number for the finding the sum of the natural number
	public static int starting_num_natural (int starting , int end , int sum ) {
		
		 
		// writing the base condation 
		if (starting == end ) {
			
			sum = sum + end ;
			return sum ; 
		}
		sum +=starting ;
		
		// calling the function of the number 
		int result = starting_num_natural(starting+1, end, sum);
		return result ; 
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// calling the function for the writing the code 
		int n = sumOfNtural(10) ; 
		System.out.println(n);
		int s = snm_natural(5, 10) ; 
		System.out.println(s);
		
		// calling the function for the printing the number of the value 
		int result = starting_num_natural(5, 10, 0);
		System.out.println(result+" this is the answer of the abovemethod");
	}

}

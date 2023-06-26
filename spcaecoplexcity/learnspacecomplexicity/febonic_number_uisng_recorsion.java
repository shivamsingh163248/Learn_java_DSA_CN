package learnspacecomplexicity;

public class febonic_number_uisng_recorsion {
	
	// creating the recursion function for the solving the febonicec number 
	public static int feboninc_number(int n ) 
	{
	// frist we are the writing the base condition 
		if (n == 0 || n == 1) {
			return n  ; 
		}
		
		// calling the function of the recorsion 
		return feboninc_number(n-1)+feboninc_number(n-2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = feboninc_number(9);
		System.out.println(result);

	}

}

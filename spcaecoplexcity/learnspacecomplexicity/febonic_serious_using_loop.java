package learnspacecomplexicity;

public class febonic_serious_using_loop {
	// creating the function for using the loop for solving the question 
	public static int febonic(int n ) {
		
		// taking the two pointer 
		int final_value = 1 ; 
		int frist_value = 1 ; 
		int second_value = 2 ; 
		
		// now creating the for loop fr solving this problem 
		for (int i = 3; i < n; i++) {
			
			
			final_value = frist_value+second_value ; 
			// now change the value in the fist place value and second value 
			System.out.println(frist_value+" + "+second_value+" = "+ final_value);
			 
			frist_value = second_value ; 
			second_value = final_value ; 
		//	System.out.println(frist_value+" "+second_value);
		}
		return final_value ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = febonic(8);
		System.out.println(n);

	}

}

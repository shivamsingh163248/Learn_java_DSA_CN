import java.util.Scanner;

public class decimal_to_binnary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now we are the converting the decimal to binary number in the batter approach 
		// using the while loop we are the try to print decimal to binary number
		Scanner input = new Scanner(System.in);
		// hear we are taking the input from the user 
		int n = input.nextInt();
		int pow = 1 ; 
		int i = n;
		int sum =0 ;
        while (i > 0) {
			// now print the remainder of the number
        	int rem = i%2;
        	// now calculating the reverse number 
        	sum = sum + (pow*rem);
        	
        	// now reversing the value of the number that are the finding in the number 
        	 pow = pow*10;
        	
        	
        	
        	
        	// now the decrement the value of the number dividing by2 
        	
        	
        	i /=2;
		}
        System.out.println(sum);
	}

}

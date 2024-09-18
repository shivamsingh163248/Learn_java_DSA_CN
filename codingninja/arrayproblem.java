import java.util.Scanner;

public class arrayproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// today creating the problem of the arrays 
		Scanner input = new Scanner(System.in) ;  
		// this is the scanner function that are the using for the taking the input from the user 
		int n = input.nextInt() ; 
		// creating the form we are the finding the last digit number 
		for (int i = n; i > 0; i = i/10) {
			System.out.println(i%10+" "+i);
		}
		Math.abs(n);

	}

}

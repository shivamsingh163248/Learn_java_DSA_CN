import java.util.Scanner;

public class presidence {
	// creating the main function in the using the my code 
	public static void main(String[] args) {
		
		// creating the scanner object take the input from the user 
		Scanner input = new Scanner(System.in) ; 
		System.out.println("enter the number of the a ");
		int fist_num  = input.nextInt() ;
		// creating the user input for the second input 
		System.out.println("enter the scecond nun ");
		int second_num = input.nextInt() ; 
		
		// now we do the pracidence operation 
		int c = fist_num+56/second_num ; 
		System.out.println(c);
		
		
		
	}
	

}

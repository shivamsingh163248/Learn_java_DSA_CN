import java.util.*;
public class ternaryoprator {

	public static void main(String[] args) {
		//  in to do we use the tenary operators
		//using the scanner function take  value from the user and showing the result   
  // now making the scanner function of the variable 
		Scanner input = new Scanner(System.in);
		String value1 = "this is name of the shivam";
		String value2 = "this is not name of the shivam";
		// here function created 
		System.out.println("please  enter the value of the a  ");
		int a = input.nextInt();
		System.out.println("plsease enter the value of the b ");
		// now we take the second input from the user
		int b  = input.nextInt();
		// now using the ternary operators 
		int z = (a>b)?0:1 ; 
		System.out.println("chack the condation " +z);
		// if a given input in string then what are the given result 
		String p = ((a == b) || (a > b) )? value1:value2;
		// now the print the vlaues ofthe variable andd see the result what happen with the new experiment
		System.out.println("print the value of the p "+ p );
		// my experiment was successful 
	}

}

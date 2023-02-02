import java.util.*;

public class switchstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // now we will learn the switch statement and used the switch statement 
        // take a  input from the user using the make the scanning function 
		Scanner input = new Scanner(System.in);
		// now making the program of the week which what to find 
		System.out.println("enter the the number");
		int a = input.nextInt();
		switch (a) {
		case 1: {
			System.out.println("monday");
			break;
		}
		case 2:{
			System.out.println("tuesday");
			break ; 
		}
		case 3:{
			System.out.println("wednesdy");
			break ; 
		}
		case 4:{
			System.out.println("thersday");
			break ; 
		}
		case 5:{
			System.out.println("friday");
			break ; 
		}
		
		default:
			System.out.println("wwrong value");
		}// simple we are the using the switch program and write a code of the days program
	}

}

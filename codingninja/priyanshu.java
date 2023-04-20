import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class priyanshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// no we are genearting the scanner of the taking input from user 
		Scanner input = new Scanner(System.in);
		System.out.println("enter your  first name ");
		String c1 = input.nextLine();
		char c2 = c1.charAt(0);
		System.out.println("enter your second name ");
		String c3 = input.next();
		
		if (c2 == 'P') {
			System.out.println("happy birthddd to u "+birthday);
		}
		else {
			System.out.println("sorry not your birthday");
		}

	}

}

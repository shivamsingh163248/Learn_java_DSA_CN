import java.util.Scanner;

public class modulusopreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// modulus operator are the use to finding the remainder of any division so using the modulus operator find the remainder 
		int x = 10/3 ; 
		System.out.println(x);
		// if we are the using double data type and then dived 
		// let us the check what we finding the result after the division 
		// so lets do implementation 
		double y = 10.2%3 ; 
		 System.out.println(y);
		 // then now write the program of the check even and odd 
		 // so the lets the write the program of the even and odd
		 Scanner input = new Scanner(System.in);
		 int num = input.nextInt();
		 if (num%2 == 0 ) {
			System.out.println("this number are the even number "+ num);
		}else {
			System.out.println("this number is the odd number "+num);
		}
		}

	}



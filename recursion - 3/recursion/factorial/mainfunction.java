package recursion.factorial;

import java.util.Scanner;

public class mainfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		factorual check = new factorual();
		Scanner input = new Scanner(System.in) ;
		System.out.println("enter the number");
		int n = input.nextInt();
		System.out.println(check.facorial(n));

	}

}

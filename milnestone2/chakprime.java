import java.util.Scanner;

public class chakprime {
	
	// make the boolean function 
	public static boolean checkPrime(int n) {
		// now inisalizaton the boolean 
		boolean check = true ; 
		int i = 2 ; 
		while (i<n-1) {
			
			
			if (n%i == 0) {
				check = false ;
				return check;
			}
			i++;
			
		}
		return check;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now hear we will the writing the code for the check prime  number in the true of false
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		
/// now calling the function of the check prime number 
		System.out.println(checkPrime(n));
		if (checkPrime(n)) {
			System.out.println("prine number");
		}else {
			System.out.println("composit number ");
		}
	}

}

import java.util.Scanner;

public class SumOFevenNumberTillN {
	
	public static long evenSumTillN(int n) {
		// Write your code here.
		long value = 0 ; 
		for (int i=0; i<=n;i = i+2) {
			value =  value+i ; 
		}
		return value ; 
	}

	public static void main(String[] args) {
	
// CALLING THE METHOD AND FIND THE RESUTLT 
		Scanner input = new Scanner(System.in) ; 
		int n = input.nextInt() ; 
		System.out.println(evenSumTillN(n));
	}

}

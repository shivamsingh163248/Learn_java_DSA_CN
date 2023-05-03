import java.util.Scanner;

public class checknumber_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		// taking the boolean operator as the flag 
		boolean res = false ; 
	
		
		// fist we are taking the 
		for (int i = 0; i < n-2; i++) {
			// now taking the input from the user in the loop 
			if (n1<n2) {
				res = true ; 
			}
			if (res) {
				if (n1>n2) {
					res = true ; 
				}
			}
			
			
			
			n1= n2;
			n2 = input.nextInt();
			
			}
		
		System.out.println(res);   
		}
		

	}



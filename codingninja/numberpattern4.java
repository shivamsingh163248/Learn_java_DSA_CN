import java.util.Scanner;

public class numberpattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// using the while loop  solve this problem 
		int i= 1;
		while (i <= n ) {
			// write the space loop using  
		int j = n-1;	
while (j>=i) {
	System.out.print("*");
	j-- ; 
}
//now printing the number again
int k = 1; 
while (k<=i) {
	System.out.print(k);
	k++;
}

		System.out.println(" ");	
			i++;
		}

	}

}

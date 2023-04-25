import java.util.Scanner;

public class reversenumberpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i = n;
		while (i>0) {
		// now using the next while loop for the printing the following number
		int j = 1 ; 
		while (j<=i) {

		System.out.print(i);

			j++;
		}
		System.out.println(" ");

			i--;
		}
		
	}

}

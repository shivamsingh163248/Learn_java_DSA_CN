import java.util.Scanner;

public class charecterpattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //now taking the input from the user 
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// now using the while loop method
		int i = 1 ; 
		while (i<=n) {
			int j = 1;
			while (j<=i) {
				// using the typecasing 
				char value = (char)('A'+(i-1));
				System.out.print(value);
				j++;
			}
		// using  for thte second line 
		System.out.println(" ");

			i++;
		}
		
	}

}

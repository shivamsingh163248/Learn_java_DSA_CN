import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now printing the reverse number pattern 
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// solved using the while loop 
		int i = 1 ; 
		while (i<=n) {
			int j = i;
		   while (j >= 1) {
			   System.out.print(j);
			   j--;
		   }
		   System.out.println(" ");

			i++;
		}
		
	}

}

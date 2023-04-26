import java.util.Scanner;

public class sumpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// taking input from the user using the scanner 
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			// now second loop 
			int k = 0;
			for (int j = 1; j <= i; j++) {

			
				k = k+j;
				
				System.out.print(j);
				// this is the + symbol loop 
				
				for (int m = 1; m <= 1; m++) {
					if (j==i) {
						continue;
					}
					
				System.out.print("+");
					
				}
				
				
			}
			
			
			
			
			// using print the value in the next loop 
			for (int j = 1; j <= 1; j++) {
				System.out.print("="+k);
			}
			
			
			
			System.out.println(" ");
		}

	}

}

import java.util.Scanner;

public class oddnumberpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// now using for the loop 
		for (int i = 1; i <=n; i++) {
			// now second loop using the internal printing 
			for (int j = i; j <= n; j++) {
				int k = (2*j)-1;
				System.out.print(k);
			}
// now using the second loop for another code 
for (int m = 1; m <i; m++) {
	int l  = (2*m)-1;
	System.out.print(l);
}

System.out.println(" ");
		}
        

	}

}

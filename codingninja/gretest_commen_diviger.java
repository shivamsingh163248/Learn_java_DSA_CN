import java.util.Scanner;

public class gretest_commen_diviger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = 0 ;
		int vlaue = 0;
		if(x>y) {
		  z= x ; 	
		}else {
			z=y;
		}
		// using the for loop 
		for (int i = 1; i <= z; i++) {
			if (x%i == 0 && y%i == 0) {
				vlaue = i;
			}
			
			
		}
		System.out.println(vlaue);

	}

}

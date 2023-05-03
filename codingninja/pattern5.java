import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		  int n = input.nextInt();
		  int i = 1 ;
		  while (i<=n) {

		 int j = 1;
		 while (j<i) {
			 System.out.print("#");
			 j++;
		 }
		 int k = n;
		 while (k>=n-(n-i)) {
			 System.out.print("*");
			 k--;
		 }
		 
		 
		 
		 
		 
		 
		 System.out.println(" ");

			  i++;
		  }
		     

	}

}

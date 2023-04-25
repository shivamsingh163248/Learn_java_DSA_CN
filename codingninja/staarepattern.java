import java.util.Scanner;

public class staarepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		// now we are using the loop for making tha pattern 
		 
		 // now write the frist loop using while loop
		 int i = 1 ; 
		 while (i<=n) 
		 {
// now write the second loop for the print blank 
  int j = 1 ;
  while (j<=n-i) 
  {

	  System.out.print("*");
	  j++;
  }




System.out.println(" ");
			 i++;
		 }
	}

}

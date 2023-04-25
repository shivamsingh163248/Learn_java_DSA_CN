import java.util.Scanner;

public class staerpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// frist we are the taking the input 
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

	  System.out.print(" ");
	  j++;
  }
  // agian white the code of the next loop 

  int k = n;
  while (k>n-i) {
	  // now write the printing the statement of the while loop 
	  System.out.print("*");
	  k--;
  }

  // again write the next loop for the printing the next printing 
  int l = 1; 
  while (l<i) {
	  System.out.print("*");
	  l++;
  }




System.out.println(" ");
			 i++;
		 }

	}

}

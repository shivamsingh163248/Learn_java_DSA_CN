import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
	      // write the decending order pattern 
        int i = 1;
        while (i<=n) {
     int j = n;
      while (j>(n-i)) {

  System.out.print(j);
  
          j--;
      }
      System.out.println(" ");
           i++; 
           
        }

	}

}

import java.util.Scanner;

public class square_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
		  int n = input.nextInt();
		  // now chack the condation nuber of the square is greater then or not of the given number
		  int i = 0 ;
		  int ans = 0;
		  while (ans<= n ) {
			  i++;
			//  System.out.println(i);
			  ans = i*i;
			  
			 
		  }
		  System.out.print(i-1);

	}

}

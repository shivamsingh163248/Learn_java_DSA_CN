import java.util.Scanner;

public class faboncsirius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int value = 0 ;
		for (int i = 2; i <=n; i++) {
			int j = i-1;
		
		  for (; j <i; j++) {
			  System.out.print(j);
			  //j = f;
		  } 
		  // now using the second loop to solve this problem 
		  int k = i-2;
		  for (; k <i-1; k++) {
			System.out.print("("+k+")");
			//k = f2;
		}
		  
      value = j+k;
      System.out.println("="+value);
      

		}
	}

}

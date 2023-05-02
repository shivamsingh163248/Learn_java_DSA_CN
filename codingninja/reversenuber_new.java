import java.util.Scanner;

public class reversenuber_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using the while loop solved the problem the again in the short method 
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// using the of the loop calculating the value 
		int result = 0  ; 
		int j = 1 ;
		int out = 0 ; 
		int remender = 0; 
		for (int i = n; i > 0; i = i/10) {
			remender = i%10;
       
	      for (int k = 1; k <= j; k++) {
			  out = out*2 ; 
		  }

		 result = result +  (out*remender);

         j= j+1 ; 



			

 


		}
		System.out.println(result);

	}

}

import java.util.Scanner;

public class reversenuber_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using the while loop solved the problem the again in the short method 
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// using the of the loop calculating the value 
		int result = 0  ; 
		int j = 0 ;
		int out = 1 ; 
		int remender = 0; 
		for (int i = n; i > 0; i = i/10) {
			remender = i%10;
       

// using the left shift operator solve this problem 

		out = remender<<j;
		result = result+out;

        j++;


		}
		System.out.println(result);

	}

}

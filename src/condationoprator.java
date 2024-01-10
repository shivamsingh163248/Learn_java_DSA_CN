import java.util.*;
public class condationoprator {

	public static void main(String[] args) {
		// here are  are the learn the  operating of condition
		// in using the main method using the if else oprators
		// hear we make the scanner function use in the
		Scanner input = new Scanner(System.in);
		// now we are the use the scanner function 
		// making the input fild 
		// now making the function
		int x, y ;
		System.out.println("please enter the frist value ");
		//enput the frist value 
		x = input.nextInt();
		System.out.println("please enter the second value ");
		y = input.nextInt();
		if (x >= y) {
			System.out.println(" x is the grater then y");
			
		}else {
			System.out.println("y is grater the x");
		}
			// heare the we are the close the input that are the using by the scanner function 
		   Scanner sc = new Scanner(System.in);
	         

	        int N = sc.nextInt();

	        int evenSum = 0;

	        int oddSum = 0;

	        // while (N != 0) {

	        //     if (N % 2 == 0) {

	        //         evenSum = evenSum + N%10;

	        //     } else {

	        //         oddSum = oddSum + N%10;

	        //     }

	        //     N = N / 10;

	        // }

	        for (int i = N; i != 0 ; i  = i/10) {

	               if (i % 2 == 0) {

	                evenSum = evenSum + i%10;

	            } else {

	                oddSum = oddSum + i%10;

	            }

	          //  N = N / 10;
	            
	        }

	        System.out.print(evenSum+" "+oddSum);
		
    input.close();
	}

}

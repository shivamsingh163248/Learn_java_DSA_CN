import java.util.Iterator;
import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// now printing the pattern 
		// making the input object from user
		Scanner $user_input = new Scanner(System.in);
		System.out.println("enter them max number for the making pattern");
		int $max_num = $user_input.nextInt();
		for (int i = 0; i <= $max_num; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
		System.out.println("making the reversve printing ");
		//now making the reverse pattern of the star 
		// so how you are the write the reverse program 
		for (int i = 0; i <= $max_num ; i++) {
			for (int j = $max_num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

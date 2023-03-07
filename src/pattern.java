import java.awt.desktop.PrintFilesEvent;
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
		
		// now printing the left side  of the pattern 
		// for using the for loop we implement the left side pattern 
		for (int  i = 0;  i <= $max_num;  i++) {
			for (int j = $max_num; j >i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// now make the pattern of the triangle this is the same we only do the 
		
		for (int  i = 0;  i <= $max_num;  i++) {
			for (int j = $max_num; j >i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		// now again making the triangle  
		
		for (int  i = 0;  i <= $max_num;  i++) {
			for (int j = $max_num; j >i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}

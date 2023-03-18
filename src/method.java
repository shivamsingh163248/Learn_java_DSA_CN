
import java.util.Scanner;

public class method {
	
	
	public static void loop(int a , int b) {
		for (int i = 0; i < a; i++) {
			System.out.println("my name is shivam singh ");
			int j = 0  ;
			while (j < b) {
				System.out.println("chack the number");
				j++;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now we are the learn the the method of the java we are the using the java the are the practice for the javaq 
 // now the calling the function of the loop with the parameter  so we test the method of the looping 
		// now try to taking he input from the user 
		// make the object of the scanner 
		Scanner input = new Scanner(System.in);
		System.out.println("enter the maximum size of the looping ");
		int a = input.nextInt();
		// now take value from the user then use the scanner object for taking the these value 
		System.out.println("enter the second value ");
		int b = input.nextInt();
		System.out.println("your result is ");
		
		loop(a,b);
	input.close();
	}

}

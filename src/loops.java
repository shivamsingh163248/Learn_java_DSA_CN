import java.util.Scanner;

public class loops {
	
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in) ; 
		 int a = input.nextInt() ; 

		 // creating the loop 
		 for (int i = a; i > 0; i--) {
			 for (int j = a; j >=i  ; j--) {
				 System.out.print(j);
			 }
			 System.out.println("");
		 }

	}

}

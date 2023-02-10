import java.util.Scanner;

public class loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// now we are the learn the for loop 
		// loop is the best method to solved the many problem just like the table
		Scanner input = new Scanner(System.in);
		//making the scanner function
		System.out.println("enter yout table nuber");
		int table_input = input.nextInt();
		for (int i = 1; i <= 10; i++) {
			int c = table_input*i;
			System.out.println(i+"*"+table_input+" = "+c);
		}
		// now we are the wrote the program for the 
		for (int j = 1; j <= 10; j++) {
			for (int k = 1; k <= 10; k++) {
				int m = j*k;
				//System.out.print(j+"*"+k+" = "+m+"      ");
				System.out.printf("%4d*%d = %1d  ", j,k,m);
			}
			System.out.println("");
		}
	}

}

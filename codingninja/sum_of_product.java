import java.util.Scanner;

public class sum_of_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int c = input.nextInt();

		int sum = 0 ;
		int  product = 1;
		// now we are the using switch statement 
		switch(c){
			case 1:{
		    // then the print the sum of the number 
			for (int i = 1; i <= n ; i++) {
				sum += i;
				
			}
				System.out.println(sum);
		    break;
			}
			case 2:{
				for (int i = 1; i <= n ; i++) {
				product *=   i;
				
			}
				System.out.println(product);

				break;
			}
			default:{

		System.out.println("-1");
			}
		}

	}

}

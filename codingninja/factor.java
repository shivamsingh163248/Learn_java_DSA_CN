import java.util.Scanner;

public class factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now lets the check the factor of the number
		   Scanner input = new Scanner(System.in);
	        int num = input.nextInt();
	        int i =2;
	        while (i<num) {
	            if (num%i == 0) {
	                System.out.print(i+" ");
	            }
	            i++;
	        }
	            

	}

}

import java.util.Scanner;

public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// so now finding the sum of the digit 
		// now creating the class of the i/o module that are the used in the taking the from the user 
		Scanner input = new Scanner(System.in); 
		// so taking the input from the user 
		System.out.println("enter the number which you want to sum");
		int num = input.nextInt();
		// no taking the while loop for the using sum of the digit 
		int sum_of_digit = 0 ;
		while (true) {
			sum_of_digit += num%10;
			num = num/10;
			if (num<10) {
				break ;
			}
		}
		sum_of_digit += num; 
  System.out.println("the num oof the number is "+sum_of_digit);
	}

}

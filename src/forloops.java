import java.util.Scanner;

public class forloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  now we will the learning the for loop 
		// for stating is the repeating for the some time interval 
		
//6n+1 and 6n-1 are the function of the prime number
		// take input from the user so make a new object 
		
	Scanner $_user_input = new Scanner(System.in);
	// we will using the simple  type casting method of implicit 
	// fist we take value from the user in the format of the integer  data type 
	System.out.println("enter the frist  number");
	double $_fist_num = $_user_input.nextDouble();
	double $_frist_number = $_fist_num/6;
	// now we are the round the value of after dividing the fist number 
	int $_frist_value = (int)Math.round($_frist_number);
	
	System.out.println("enter the second number  ");
	double $_max_num_find_prime_num = $_user_input.nextDouble();
	double $_lenght = $_max_num_find_prime_num/6;
	// for the using in round figure using the math.round 
	int $_args_length = (int)$_lenght;
// for making decision for the between two number finding the prime number
	
	
	
		 
		for (int i = $_frist_value; i <= $_args_length; i++) {
		int y = (6*i)+1;
		int z = (6*i)-1;
		if  (y > $_max_num_find_prime_num ) {
			break;
		}
		
		
		System.out.print(z+"  "+y+"  ");
		    
		}
		
		
		
	}

}

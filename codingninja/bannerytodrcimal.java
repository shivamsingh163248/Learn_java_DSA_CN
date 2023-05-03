import java.util.Scanner;

public class bannerytodrcimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		int n = input.nextInt();
		// using the for loop solve this problem binnary to decimal 
		int rem = 0; 
		int result = 0 ;
		int pow = 1;
		for (int i = n; i > 0; i= i/10) {
			rem = i%10;
			// now finding the formula of the binary 
			result += (rem*pow); 
			// now increment the power for the next digit 
			pow *= 2;
		}
System.out.println(result);



// again this is the solved the while method 
int ans = 0 ;
int powe = 1; // take initalization frist because 2 power of the 0  = 1 so that why write the fist of the power
int j = n;
while (j>0) {
	// fist we find the remainder that is the last digit of the number 
	int last_digit = j%10;
	// now calculating the sum of the number 
	ans = ans+last_digit*powe;
	// now increment the power according the loop 
	powe = powe*2;
	
	
	
	// now decrement the digit according to the dividing the number of the tense digit number 10 
	j = j/10;
	
	
}
// now printing the result of the outcomes 
System.out.println(ans);


	}
	
	

}

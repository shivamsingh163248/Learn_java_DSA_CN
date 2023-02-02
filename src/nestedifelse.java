import java.util.*;
public class nestedifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// write the program who donating the blood according the weight and the age use two condition and the write the proggram
		Scanner input =  new Scanner(System.in);
		// now taking the input the from the user 
	System.out.println("enter your age ");
	int age = input.nextInt();
	System.out.println("enter the weight ");
	int weight = input.nextInt();
	// now we used the algorithm  who is eligible for donating blood
	if (age >= 18) {
		if (weight >= 45) {
			System.out.println("you are the eligible for the donatin the blood ");
		}else {
			System.out.println("you are the not eligible for the donatin the blood ");
		}
	}
	input.close();
			}
	}
		
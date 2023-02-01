import java.util.*;
public class makingdesigen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now we are the write the if else statement this is the conditional statement 
		// check the if else program
		int a = 18 ;
		if (18<a) {
			System.out.println("you are the eleigible for the voting  you have the more write");
		} else {
            System.out.println("you are not eligible for the voting ");
		}
		// now again the write of the program of the condition of if else .
		// use of the scanner program tak input from the user
		Scanner input  = new Scanner(System.in);
		// taking the input from the user use of the scanner function 
		System.out.println("enter your age in integer formate");
		int age = input.nextInt();
		if (age >=18 ) {
			System.out.println("you are the eligible for the voting");
		} else {
           System.out.println("you are the not eligible fot he voting");
		}
		// now we write the else if program of the odd number
		int y = (age%2);
		if (y == 0) {
			System.out.println("your age is the even number");
		} else {
            System.out.println("your age is the odd number");
		}
		// now again  use of the condition statement if else elseif
		if (age < 18) {
			System.out.println("you are not eleigible for the making Mp");
		}else if (age > 25) {
			System.out.println("you are the eligible for the making the politician");
		}else {
			System.out.print("you  hvae a right for the leving freedom in out country");
		}
		// now we write the program for the finding odd or even number by using the tarnery operator
		// we know that the method of the using tarnery operator fist given the condition  and  the question mark symbol and using the true condition and then the false condition 
		// fist we taking input from the user by  the using scanner function
	System.out.println("find the odd number and the evean number ");
	System.out.println("please enter the value for finding the even or the odd number");
	// then using the scanner function 
	float value1 = input.nextFloat();
	// now hear we  have scanned number and check the condition using the the  algorithm 
	String even = "this is the even number";
	String odd = "this is the odd number";
	// now using the ternery operator 
	String find  = ((value1%2) == 0)?even:odd ;
	System.out.println(find);
	
		

	}

}

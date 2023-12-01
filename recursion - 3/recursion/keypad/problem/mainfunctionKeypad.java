package recursion.keypad.problem;

import java.util.Scanner;

public class mainfunctionKeypad {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the object 
		keypadProblem check = new keypadProblem() ; 
		
		Scanner input = new Scanner(System.in) ; 
		
		System.out.println("enter the input");
		int n = input.nextInt();
		
		String[]res = check.keypad(n);
//		
//		// now using the for each loop 
		for (String c : res) {
			System.out.println(c);
		
		
		
		
		}
		
		subsquence sub = new subsquence();
		sub.printKeypad(234);

	}

}

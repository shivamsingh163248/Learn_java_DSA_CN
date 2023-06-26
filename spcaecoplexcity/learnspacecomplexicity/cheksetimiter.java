package learnspacecomplexicity;

import java.util.Scanner;

public class cheksetimiter {
	
	public static double frute (double gram  , double vlaue_in_kg) {
		// frist find the value in i gram 
		double agramVALUE = vlaue_in_kg/1000 ; 
		double resutl = gram*agramVALUE ; 
		return resutl ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ; 
		System.out.println("enter the value in par kag = ");
		double valueinkg = input.nextDouble();
		System.out.println("enter you want to find = ");
		double gramfindvalue = input.nextDouble() ; 
		
		// now the function call 
double result = 	  frute(gramfindvalue, valueinkg);
System.out.println(" your result is  =  "+result);

	}

}

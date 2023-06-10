package learn_recursion_II;

import java.util.Scanner;

public class test_string_num {
	
	// creating the function of the for scanning number and given the integer 
	public static int scanner(String massage) {
		Scanner input = new Scanner(System.in) ; 
		System.out.println(massage);
		int x = input.nextInt() ; 
		return x ; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char value = '4' - '0' ; 
int res = value ; 
System.out.println(res);

System.out.println('\0');
System.out.print(res);

// check  the calling the function 
int y = scanner("this the number") ; 
System.out.println(y);
	}

}



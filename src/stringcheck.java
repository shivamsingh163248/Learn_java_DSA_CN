import java.util.Scanner;

public class stringcheck {
	
	// creating the main function 
	public static void main(String[] args) {
		
		// this is the main function 
		// creating the scanner function 
		Scanner input = new Scanner(System.in) ; 
		// enter the input the time of the take the input 
		System.out.println("enter the number");
		int number = input.nextInt(); 
		
		// creating the loop for the taking the input 
		
		// creating the string array for the taking thei nput 
		String[]takeinput = new String[number] ; 
		
		
		
		for (int i = 0; i < number; i++) {
			
	 String value = input.nextLine() ; 
	 
	 // now creating the algorithum 
	 // now enter the string in the aray 
	 takeinput[i] = value ; 	
			
		}
		
		// now printing the string 
		
		
		
		
		// simple input given and check the string lenght 
		String test = input.nextLine() ; 
		System.out.println(test.length());
		
	}

}

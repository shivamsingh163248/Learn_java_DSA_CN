import java.util.Scanner;

public class stringcheck {
	
	
	
	// creatung the print function for the 
	
	public static void print(String[]input) {
		
		// now creating the print function 
		for (int i = 0; i < input.length; i++) {
		// now printing the all the string 
			System.out.println(input[i]);
		}
		
	}
	
	// creating the main function 
	public static void main(String[] args) {
		
		// this is the main function 
		// creating the scanner function 
		Scanner input = new Scanner(System.in) ; 
		// enter the input the time of the take the input 
		System.out.println("enter the number");
		int number = input.nextInt(); 
		System.out.println();
		String[]takeinput = new String[number] ; 
		
		// now i want the print the array size 
		System.out.println(takeinput.length);
		
		for (int i = 0; i < 4; i++) {
			
			System.out.print("enter the user string : ");
			
	        String value = input.nextLine() ; 
	 
	 // now creating the algorithum 
	 // now enter the string in the aray 
	       takeinput[i] = value ; 	
			
		}
		
		// now printing the string 
		
		
		// now calling the function for the output
		
		print(takeinput);
		
		
		
		
		
		
		
	}

}

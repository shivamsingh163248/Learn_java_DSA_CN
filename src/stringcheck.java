import java.util.Scanner;

public class stringcheck {
	
	// creatug the statuc function for the accessing the main method 
	
	public static String[] takeinput() {
		
		
		// taking the input from the user 
		System.out.println("enter the number theat you want to display :");
		// creating the scanner function 
		Scanner input = new Scanner(System.in) ; 
		int size = input.nextInt()  ; 
		input.nextLine();  // this is the using the 
	
		String[]inputarray = new String[size] ;
		System.out.println("you enter the "+size);
		
		// now creating the loop for the taking the input 
		for (int i = 0; i < inputarray.length; i++) {
			
			// now creating the statement for the user display 
			System.out.println("enter the string");
			// creating the scanner for the taking input from the user
			
			String str = input.nextLine(); 
			
			// store value int the array 
			inputarray[i] = str ; 
			
			// now  return  the function 
			
			
		}
		return inputarray ; 
		
	}
	
	// creating the print fucntion for the printng the value 
	public static void pritnarray (String[]input) {
		
		// creating the for loop for the printng the arary 
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
		
		
		
	}
	
	
	// creating the algorithum string matching or ot 
	public static void  stringmatching(String[]input) {
		
		// using the shorting algoritum 
		// using the friquency 
		
		int[]friquecny  ; 
		
		friquecny = new int[200] ; 
		
	}
	
	
	// creating the simple string matching function all te string contain in the function or not 
	public static void stringmatching(String name1 , String name2) {
		
		if (name1.matches(name2)) {
			// check the matching 
			System.out.println("now string are the matching ");
		}
		
	}
	
	
	
	
	// now creating the main function 
	
	public static void main(String[] args) {
		
		// calling the function for the taking the input 
		String[]take = takeinput() ; 
		
		// now the print the array 
		pritnarray(take);
		
		
		
		// creatung the array 
	
		
		
		
		// now creating the 
		
		
	}
	
}

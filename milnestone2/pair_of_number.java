import java.util.Scanner;

public class pair_of_number {
	
	// make the function of the take input from the user 
	public static int[] take_input(){
		// now creating the non primitive scanner type 
	//
		Scanner input = new Scanner(System.in);
		System.out.println("enter the size of the array :");
		int n = input.nextInt();
		// now take the input from the user
		int[]take = new int[n];
		for (int  i = 0;  i < take.length;  i++) {
			System.out.print("enter the number index"+i+":");
			take[i]=input.nextInt();
		}
		input.close();
		return take ;
	}
	// now again making the new function of the printing 
	// also passed the parameter 
	public static void print_array(int[]print) {
		// now using the for loop for the printing the array 
		System.out.print("your enter number is ");
		for (int i = 0; i < print.length; i++) {
			System.out.print(print[i]+"  ");
		}
	}
// now again the making the new function for the sweping nad pair  the number
	public static void pair(int[]pair) {
		System.out.println();
		
		System.out.println("pair of the every number is ;");
		// using the for nested loop 
		for (int i = 0; i < pair.length; i++) {
			// now again the loop for the printing array 
			for (int j = i+1; j < pair.length; j++) {
				// now again printing the pair
				System.out.print("("+pair[i]+","+pair[j]+")"+"  ");
			}
			System.out.println(" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// now the function calling and the find the result 
		// we are taking the new array for the storing vlaue 
		int []swip;
		swip = take_input();
		// passing the value with the new function 
		print_array(swip);
		pair(swip);
	}

}

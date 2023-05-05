import java.util.Scanner;

public class array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// taking the input of the array from the user 
		Scanner input = new Scanner(System.in);
		// using the for loop 
		System.out.println("enter the size of the array ");
		int size = input.nextInt();
		// now the declare the value 
		int[] book = new int[size];
		
		for (int i = 0; i < size; i++) {
			// store the value in the array 
			System.out.println("enter the fist element : "+i);
			book[i]= input.nextInt();
			
		}
		// now printing the  array  with the help of the for loop 
		for (int i = 0; i < book.length; i++) {
			int j = book[i];
			System.out.print(j+" ");
			
		}

	}

}

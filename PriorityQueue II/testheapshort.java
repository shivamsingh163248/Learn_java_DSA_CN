import java.util.Scanner;

public class testheapshort {
	
	public static int[] takingarry() {
		
		// printing the for the user 
		System.out.println("enter the size of the aarry ");
		// now the defiening the size of the arry 
		Scanner input = new Scanner(System.in) ; 
		int ArraySize = input.nextInt();
		int[]arr = new int[ArraySize] ; 
		// now taking the input in the arry using the for loop 
		for (int i = 0; i < arr.length; i++) {
			// creating for the user display 
			System.out.print("enter the number index :"+i);
			arr[i] = input.nextInt();
		}
		return arr ; 
	}

	public static void main(String[] args) {
		// creating the function for the taking the input 
		// creating the obejct of the heap short
		int[]arr = takingarry();
		heapshort shortingAlgorithum = new heapshort() ; 
		// now agian printing the arry after the updateing 
		shortingAlgorithum.heapshortimplmenatation(arr);
		
		// using the for each loop 
		for (int i : arr) {
			System.out.print(i+" ");
		}

	}

}

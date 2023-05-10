import java.util.Scanner;

public class selection_short {
	// now first we are the creating the array for taking input from the user 
	// now making the function of the array 
	public static int[] take_input(){
		// crating the one array for this 
		int[]takeinput ;
		
		// now creating the not primity deta type scanner 
		Scanner input = new Scanner(System.in);
		// then now printing the out for the user show 
		System.out.println(" enter the size of the array :");
		// using the scanner function for the function 
		int n = input.nextInt() ; 
		takeinput = new int[n];
		// now taking the input in the index of the array so using for loop for this 
		for (int i = 0; i < takeinput.length; i++) {
			// now printing the massage for the user for the representing the index 
			System.out.println("enter the number of index "+i+" :");
			// now taking the input 
			takeinput[i] = input.nextInt();
		}
		
		// now return the array after the taking input of the function 
		return takeinput ; 
	}
	
	// this function make for the printing array pass throw this function and u can see array present 
	public static void out_put(int[]arr) {
		// line for the user massage 
		System.out.println(" your output is the ");
		// now using for loop for the representing 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" , ");
		}
		System.out.println();
	}

	// now writing the algorithm for the shorting of the array '
	// making the function for the selection short 
	public static int[] selction_short(int[]shorintg){
     // now write the algorithm of the shorting algorithm 
		
		// finding the minimum element in the array and use the shifting process 
		int temp1 = 0 ;
		
		for (int i = 0; i < shorintg.length; i++) {
			// this array using for the compare of the next element of the array 
			//int temp = 0;
			for (int j = i; j < shorintg.length; j++) {
				// finding the minimum element 
				if (shorintg[i] >= shorintg[j] ) {
					//temp = j;
					 temp1 = shorintg[i];
					 shorintg[i] = shorintg[j];
					 shorintg[j] = temp1 ;
				}
				
				}
//			// now replacing the array 
//			
//			if (shorintg[i] > shorintg[temp]) {
//				
//			
//		 temp1 = shorintg[i];
//		 shorintg[i] = shorintg[temp];
//		 shorintg[temp] = temp1 ;
//			
			
			
			
			
		}
		return shorintg ;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int shiva[];
		int shivaa[];
				
		shiva = take_input();
		out_put(shiva);
		shivaa = selction_short(shiva);
		out_put(shivaa);
		

	}

}

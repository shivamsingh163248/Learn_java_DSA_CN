import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		  int[]arr = new int[n];
		  
		  int k = 1 ;
	        // size will the defind from the user input 
	        for (int i = 0; i < arr.length; i++) {
             
	            if (k <= n) {
	            	
	            	
	                arr[i] = k;
	                System.out.print(" "+k+"  ");
	           }
	            k += 2;
	           
	        }
	        
	        // now again the in
	        // now the testing the vlaue of the printing the value of the array
	        for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
	        
	        
	    }

	}



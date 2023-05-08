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
	               // System.out.print(" "+k+"  ");
	           }
	            k += 2;
	           
	        }
	        
	        // now again the initialization the value of the even number in the array 
	         // fill the value in the last index in the array 
	        int u = 2;
	        for (int i = n-1; i > 0; i--) {
				//now iniatialization the value 
	        	 if (u <= n) {
		            	
		            	
		                arr[i] = u;
		               // System.out.println(" "+u+"  ");
		           }
		            u += 2;
		           
			}
	        
	        
	        
	        // now the testing the vlaue of the printing the value of the array
	        for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
	        
	        
	    }

	}



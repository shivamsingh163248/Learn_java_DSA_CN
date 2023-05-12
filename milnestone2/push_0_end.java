import java.util.Scanner;

public class push_0_end {
	
	    public static int[] separateNegativeAndPositive(int a[]) {
	        // now write the code of the negarive number that are the shifted in the frist position of the array so 
	        // we see the hear retearning the new array
	        int[] shiva = new int [a.length];
	        // frist copy -1 number n
	         // find the maxium value less then 0 
	      
	        for (int i = 0; i < a.length; i++) {
	            // for (int j = 0; j < a.length; j++) {
	                   int max_vale = Integer.MAX_VALUE;
	            // }
	                   
	                   
	                   for (int j = 0; j < a.length; j++) {
	                	   if (max_vale > a[j] && a[j]<0) {
	   	                    a[j] = max_vale;
	   	                    shiva[i] = a[j];
	   	                }
					}
	                   
	                   
	         
	        }
	        return shiva;

	    }
	    
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
		
		public static void print_array(int[]print) {
			// now using the for loop for the printing the array 
			System.out.print("your enter number is ");
			for (int i = 0; i < print.length; i++) {
				System.out.print(print[i]+"  ");
			}
		}
		
	
 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now we are the shorting of the array 
		int[]shivam = take_input();
		print_array(shivam);
		int[]shiva = separateNegativeAndPositive(shivam);
		print_array(shiva);
		

	}

}

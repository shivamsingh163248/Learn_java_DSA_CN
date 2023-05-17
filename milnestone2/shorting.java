import java.util.Scanner;

public class shorting {
	
	  public static void sorting(int[]arr){
	    	//Your code goes here
	        // simple using the shoeting algorithum 
	        for (int i = 0; i < arr.length; i++) {

	            for (int j = 0; j < arr.length-1-i; j++) {
	                if (arr[j]>arr[j+1]) {
	                    // now preform the sewping 
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1]=temp;
	                }
	            }
	        }
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
			
			return take ;
		}
	    
		// also passed the parameter 
		public static void print_array(int[]print) {
			// now using the for loop for the printing the array 
			System.out.print("your enter number is ");
			for (int i = 0; i < print.length; i++) {
				System.out.print(print[i]+"  ");
			}
			System.out.println();
		}
		
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]shiva = take_input();
print_array(shiva);
sorting(shiva);
print_array(shiva);
	}

}

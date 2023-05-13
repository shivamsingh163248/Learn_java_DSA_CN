import java.util.Scanner;

public class find_rotation_number {
	public static int[] take_input(){
		
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
	// now right the second function of the out put 
	public static void print_array(int[]print) {
		// now using the for loop for the printing the array 
		System.out.print("your enter number is ");
		for (int i = 0; i < print.length; i++) {
			System.out.print(print[i]+"  ");
		}
		System.out.println("");
	}
	
	
	
	 public static int[] shorting(int[]a ){
		 int[]b = new int[a.length];
		 b= a ; 
	        for (int i = 0; i < b.length; i++) {
	            for (int j = 0; j < b.length; j++) {
	                if (b[i] < b[j]) {
	                    // now swrping perfom between the two array
	                    int temp = a[j];
	                    b[j] = b[i];
	                    b[i] = temp;
	                }
	            }
	        }
	        return b ; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]shiva = take_input() ; 
		print_array(shiva);
		int[]shorting = shorting(shiva);
		print_array(shorting);
		print_array(shiva);
		
		

	}

}

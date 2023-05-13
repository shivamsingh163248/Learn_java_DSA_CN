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
		 
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a.length; j++) {
	                if (a[i] < a[j]) {
	                    // now swrping perfom between the two array
	                    int temp = a[j];
	                    a[j] = a[i];
	                    a[i] = temp;
	                }
	            }
	        }
	        return a ; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]shiva = take_input() ; 
		print_array(shiva);
		// copy the array 
		int[] copyarray  = new int[shiva.length];
		for (int i = 0; i < shiva.length; i++) {
			copyarray[i] = shiva[i];
		}
		
		
		int[]shorting = shorting(shiva);
		print_array(shorting);
		print_array(copyarray);
		// now compair the array 
		for (int i = 0; i < copyarray.length; i++) {
			if (shorting[0] == copyarray[i]) {
				
				System.out.println(i);
				break ; 
				
			}
		}
		
		

	}

}

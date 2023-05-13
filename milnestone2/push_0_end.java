import java.util.Scanner;

public class push_0_end {
	
    public static int[] separateNegativeAndPositive(int a[]) {
 //int[] shiva = new int [a.length];
       
     int i = 0;
          for (int j = i; j < a.length; j++) {
              if ( a[j] < 0 ) {
                  int temp = a[j];
                  a[j] = a[i];
                  a[i] = temp;
                  i++;
              }
          }
        return a;

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

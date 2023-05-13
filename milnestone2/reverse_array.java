import java.util.Scanner;

public class reverse_array {
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
   // public static void rotateright(int[]a ){
        // now find the array the lenght if the aray 
    	
    	
    	
    public static int[] rotation(int[]a , int start , int end) {
        int n = end ; 
        // now the reversing the array for intex to  n 
        int j = end-1 ; 
        for (int i = start; i < end; i++) {
            if (i<j) {
        int temp = a[i] ;
         a[i] = a[j] ;
         a[j] = temp;
         j--;  
            }
             
        }
        
        return a;
    }
    
     // call the function of the array 
    
  
   // }
    public static void rotateright(int[]a ) {
    	
    	int[]shiva = rotation(a, 0, a.length);
    	a = shiva;
    	
    }
    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now calling the function of the array 
		int shiva[]= take_input();
		// chaeck the input array right or not 
		// now calling the function of the out put of the array 
		print_array(shiva);
		// passing in the reverse array 
		rotateright(shiva);
		print_array(shiva);

	}

}

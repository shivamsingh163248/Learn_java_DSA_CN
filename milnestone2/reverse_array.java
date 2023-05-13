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
		System.out.println("");
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
    public static void rotateright(int[]a ,int x ) {
    	
    	// hear the calculate the size of the x 
    	x = x%a.length;
    	int[]shiva = rotation(a, 0, a.length);
    	print_array(shiva);
    	
    	
    	int[]shivaa = rotation(shiva, 0, x);
    	//a = shivaa ;
    	print_array(shivaa);
    	// now again reverse form insisial ndex to final index ;
    	int[]reverse = rotation(shivaa, x, a.length);
    	a = reverse ; 
    	
    }
    // again making the function of the left rotation 
    public static void leftrotation(int[]a , int x) {
    	// fist the reverse array 
    	x = x%a.length;
    	int[]leftshiva = rotation(a, 0, a.length);
    	print_array(leftshiva);
    	int[]shivaaa = rotation(leftshiva, 0, a.length-x);
    	//a = shivaa ;
    	print_array(shivaaa);
    	int[]reversei = rotation(shivaaa, a.length-x, a.length);
    	print_array(reversei);
    	
    }
    
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the rotation size ");
		int x = in.nextInt();
		// TODO Auto-generated method stub
		// now calling the function of the array 
		int shiva[]= take_input();
		// chaeck the input array right or not 
		// now calling the function of the out put of the array 
		print_array(shiva);
		// passing in the reverse array 
		// right the code of the rotation take input from the user 
//		
		rotateright(shiva ,x);
		print_array(shiva);
		
		System.out.println("left rorattion outout");
		
		leftrotation(shiva, x);

	}

}

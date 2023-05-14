import java.util.Scanner;

public class sum_of_array {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        // using the for loop tresing each element of the array 
               int output_size = output.length-1;
        int arr1_size = arr1.length-1;
        int arr2_size = arr2.length-1; 
       
      int carry = 0;

while ( arr1_size >= 0 &&  arr2_size >= 0){


     int total = arr1[arr1_size]+arr2[arr2_size];
         int remainder = (total+carry)%10; 
          carry = (total+carry)/10;
         output[output_size] = remainder;
          
          output_size--;
         arr1_size-- ;
         arr2_size--;
    
}

while ( arr1_size >= 0){


     int total = arr1[arr1_size];
         int remainder = (total+carry)%10; 
          carry = (total+carry)/10;
         output[output_size] = remainder;
          
          output_size--;
         arr1_size-- ;
       
    
}
while ( arr2_size >= 0){


     int total = arr2[arr2_size];
         int remainder = (total+carry)%10; 
          carry = (total+carry)/10;
         output[output_size] = remainder;
          
          output_size--;
         
         arr2_size--;
    
}
output[output_size] = carry ;



        
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
		System.out.println("----------------------------enter the second array---------------------------------");
		int[]shiva1 = take_input();
		print_array(shiva);
		print_array(shiva1);
		System.out.println("----------------------------sum of the two array ----------------------------------");
		int[] output = new int[1 + Math.max(shiva.length, shiva1.length)];
		sumOfTwoArrays(shiva1, shiva, output);
		print_array(output);
	}

}

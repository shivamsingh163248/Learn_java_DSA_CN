import java.util.Scanner;

public class inseration {
	
	// now letes creating the insertation short that make help in shorting 
	// so lets creating the inseration short 
	// making the function of the scanner 
	public static int[] take_inpu(){
		Scanner input = new Scanner(System.in);
		System.out.print(" enter the size of the array ");
		// now take input from the user 
		int n = input.nextInt();
		// now using the for loop take a input from the user
		// now  inistilition  of the array 
		System.out.println();
		int[]takeinput ; 
		// now the define the array size 
		takeinput = new int [n];
		for (int i = 0; i < takeinput.length; i++) {
			// now printing the index of the array 
			System.out.print(" enter the value of index "+i+" :");
			takeinput[i] = input.nextInt();
			System.out.println();
		}
		return takeinput;
	}
	// now out output display of the 
	public static void out_put(int[]arr) {
		
		System.out.print("your out is ");
		for (int i = 0; i < arr.length; i++) {
			//System.out.print("your out is ");
			 System.out.print(arr[i]+" ");
		}
		
	}
	
    public static void insertionSort(int[] arr) {
    	//Your code goes here
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    // now sweping in preform 
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else {
                	break;
                }
                
             }
            out_put(arr);
            System.out.println();
            
        }
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// now calling the function of the above finction
		int shiva[];
		shiva = take_inpu();
		out_put(shiva);
		System.out.println();
		
		System.out.println("printing the insertion shoet");
		insertionSort(shiva);
		out_put(shiva);
		
	}

}

import java.util.Scanner;

public class insurtion_of_two_array {
	
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        // now using the for loop for the printing the arra

    


        for (int i = 0; i < arr1.length; i++) {
      //      int k = 0;
      for (int j = 0; j < arr2.length; j++) {

      if (arr1[i]==arr2[j]) {
       //   k = arr1[i];
          System.out.print(arr1[i]+" ");
          arr2[j] = 0;
          break;
      }


      }
    //   if (k>0) {
    //       System.out.print(k+" ");
    //   }
    
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]shiv = take_input();
int[]shivaa = take_input();
intersections(shiv, shivaa);
	}

}

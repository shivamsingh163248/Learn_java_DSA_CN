import java.io.StringBufferInputStream;

public class test_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the new array for the dynamic 
		int[][]shiv = new int[6][] ; 
		
		// now adding the spacing the dynamically 
		for (int i = 0; i < shiv.length; i++) {
		shiv[i] = new int[i+1];
		}
		
		// check for the printing value 
		for (int i = 0; i < shiv.length; i++) {
			for (int j = 0; j < shiv[i].length; j++) {
				
				// printing the value 
				System.out.print(shiv[i][j]);
			}
			System.out.println();
			
		}
		
		
	// creating the new array of the size 4  
		 int arr[] = new int[5];
		 // now inisilazed the value of the array 
		 arr[0] = 1 ; 
		 arr[1] = 2 ; 
		 arr[3] = 4 ; 
		 // again the insilzation the value of the new array 
		 for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
		 // find the number of the student are this array 
		// now copy the refrence of the array 
		 int tmep[] = arr ; 
		 System.out.println(tmep);
		 System.out.print(arr);
		 
		 arr = new int[7];
		 System.out.print(arr);
		 for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}

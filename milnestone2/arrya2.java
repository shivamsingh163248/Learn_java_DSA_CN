import java.util.Scanner;

public class arrya2 {
	public static int shiv() {
		//Your code goes here
		   Scanner input = new Scanner(System.in);
		   // now declearation the size of the array 
		   int[]arr ;
		   
		   int n = input.nextInt();
		   int x= input.nextInt();
		  int u  = 0;
		  arr = new int [n];
		  // now take input frim the user 
		  // using the for loop 
		  for (int i = 0; i < arr.length; i++) {
		    arr[i] = input.nextInt();
		 }
		// now printing the array 
		for (int i = 0; i < arr.length; i++) {
		  // now the test of the arry 
		  if (arr[i] == x)
		    u= i;
		}
		return u;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Your code goes here
	
System.out.println(shiv());
	}

}

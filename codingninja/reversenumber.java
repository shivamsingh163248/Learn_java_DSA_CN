import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		//int div = 0;
		int reminder = 0 ;
		// using the for loop solve this probelm 
		for (int i = n; i >0; i = i/10) {
			reminder = i%10;
			System.out.print(reminder);
		}
		
		
//		int i = n ;
//		while (i>=0) {
//			
//			reminder = i%10;
//			System.out.print(reminder);
//			
//			i=i/10;
//		}
		
//	    int i=10;  
//	    while(i>0){  
//	        System.out.println(i);  
//	    i=i/10;  
	    
	}

}

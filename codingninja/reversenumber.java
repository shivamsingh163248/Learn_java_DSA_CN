import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		
		int reminder = 0 ;
		int  n1 =n ;
		
		for (int j = n; j%10==0; j=j/10) {
			n1 = j;
		
		}
		System.out.println(n1);
		if (n1%10==0) {
			n1 = n1/10;
		}
		
		// using for the total reverse number
		
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

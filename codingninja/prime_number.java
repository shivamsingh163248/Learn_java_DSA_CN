import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// frist we are the finding the number of the step that are the execute the function and get the number
		int j = n/6;
		int n1 = 2;
		int n2 = 3 ;
		int n3 = 5;
		if (n==2) {
			System.out.println(n1);
			return;
		}
		if (n==3) {
			System.out.println(n1);
			System.out.println(n2);
			return;
		}
		if (n==4) {
			System.out.println(n1);
			System.out.println(n2);
			return;
		}
		if (n==5) {
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
			return;
		}
	if (n>=6) {
		System.out.println(n1);
		System.out.println(n2);
		
		boolean w  = true ; 
		boolean t = true ;
		
		
		
  for (int i = 1; i <= j; i++) {
	  
	  int k = (6*i)+1;
	  int l = (6*i)-1;
	  
	  for (int m = 2; m < l; m++) {
			int checknum = l%m;
			if (checknum == 0) {
				w = false   ; 
				break ;
			}
				
				
			}
	  if(l<=n && w ) {
			System.out.println(l);

		}
	  
		
	  
	  
	  // check number prime or not 
	  
	  for (int n4 = 2; n4 < k; n4++) {
			int checknum = k%n4;
			if (checknum == 0) {
				t = false   ; 
				break ;
			}
				
				
			}
	  
	  if(k<=n && t ) {
			System.out.println(k);

	 
	}
	  
	  
	  
	
	}
	}
	
	}
	}



import java.util.Scanner;

public class faboncsirius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int n1=0,n2=1; 
		int n3 = 0;
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(int i=2;i<=n;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 } 
		 System.out.println(n3);
	}

}

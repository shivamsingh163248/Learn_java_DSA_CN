import java.util.Scanner;

public class ap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = 0;
		// simpe using the loop for the input value 
		for (int i = 1; i <=n+k ; i++) {
			// now print the value accordin the condation 
			int j = ((3*i) + 2);
			// chaecking the condation for the out put the shoud not have the multiple of the three 
			if (j%4==0) {
				k++;
			} else {
				System.out.print(j+" ");
			}
		}
		
	}

}

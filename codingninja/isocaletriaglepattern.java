import java.util.Scanner;

public class isocaletriaglepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now the printing the triangle of the number 
		// take input from the user
		Scanner input = new Scanner(System.in);
		int mp = input.nextInt();
		// now using the while loop for the printing triangle 
		int n = (mp+1)/2;
		int i = 1 ;
		while (i<=n) {
			// now write the blank printing loop 
int j = 1;
while (j<=(n-i)) {
	System.out.print(" ");
	j++;
}
// now write the next pattern of this triangle number pattern 
int k = i; 
while (k<n-(n-i)+i) {
	// now print number
	System.out.print(k);
	k++;
};
// now writng the next pattern loop 

int l =2*(i-1);
while (l>=i){
	System.out.print(l);
	l--;
}


System.out.println(" ");

			i++;
		}
		
// no the writing the second down code 
		// using for the second loop take new variable and and stored value 
		int n1 = mp-n;
		for (int j4 = 1; j4 <= n1; j4++) {
			// now writing the second loop write for space
			for (int j2 = 0; j2 < j4; j2++) {
				System.out.print("*");
				
			}
			
			// no again printing the stares 
			for (int j5 = 0; j5 <= n1-j4; j5++) {
				System.out.print("#");
			}
			
			//again make the last 3 part of the pattern 
			for (int j6 = 0; j6 < n1-j4; j6++) {
			System.out.print("@");
				
			}
			
			
  System.out.println(" ");
			
		}

	}

}

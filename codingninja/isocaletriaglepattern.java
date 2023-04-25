import java.util.Scanner;

public class isocaletriaglepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now the printing the triangle of the number 
		// take input from the user
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// now using the while loop for the printing triangle 
		int i = 1 ;
		while (i<=n) {
			// now write the blank printing loop 
int j = 1;
while (j<=(n-i)) {
	System.out.print("*");
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

	}

}

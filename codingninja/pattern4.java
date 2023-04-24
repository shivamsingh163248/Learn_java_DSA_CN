import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// now making the pattern for the 
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// using the while loop 
	 int i = 1 ;
    while (i<=n) {


int j = 0;
while (j<i) {
	System.out.print("*");
	j++;
}
// making the gap between the line;
System.out.println(" ");

		i++;
	}
    

	}

}

import java.util.Scanner;

public class charecterpatern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// using the while loop
		int i = n;
 while (i>0) {

// now writing the again while loop 
int j = i ; 
while (j<=n) {

// now printing tjhe statement
char value = (char)('A'+(j-1)); 
System.out.print(value);

	j++;
}
System.out.println(" ");

	 i--;
 }
 
	}

}

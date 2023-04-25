import java.util.Scanner;

public class characterpattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n  =  input.nextInt();
        int i = 1 ;
        // using thw whilel loop sloved the question 
        while (i<=n) 
    {

 // now writing the again loop for the reverse pritnig of charecter number
 int j = n ;
 while (j>n-i) {
// now statement printig of the charecter 
char value = (char)('A'+(j-1));
System.out.print(value);
     j--;
 }
 System.out.println(" ");

            i++;
        }

	}

}

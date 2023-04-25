import java.util.Scanner;

public class charecterpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
        int i = 1 ; 
        while (i<=n) {

  int j = 1 ; 
  while (j<=i) {
      
// taking the lenght 
char charvlaue = (char)('A'+(j-1));
// now we are the printig the value 
System.out.print(charvlaue+" ");

      j++;
  }
  System.out.println();

            i++;
        }

	}

}

import java.util.Scanner;

public class farenhighttocelcious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// now are the learn the fahrenhight to celsious to 
		// so taking the input from the user so make the class for the input taking from the user 
		Scanner input = new Scanner(System.in);
		int s = input.nextInt();
		int e = input.nextInt();
		int w = input.nextInt();
		// now write the formula of the farenhight to celcious to convert the vlaue throught the formula 
		// now this is the best way to write the program 
		
		
         while (s<=e) {
			System.out.println(((s-32)*5)/9);
			s= s+w;
		}

	}

}

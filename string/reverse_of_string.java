import java.util.Scanner;

public class reverse_of_string {
	// make the function of the string 
	public static String reverse(String str) {
		// lets take the blank string for the adding new string 
		String st = "";
		// now using the reverse for loop 
		for (int i = str.length()-1; i >= 0; i--) {
			st = st+str.charAt(i);
		}
		return st;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// so lets start the  write the code of the reverse of the string 
		// now the calling the function of the 
		Scanner input = new Scanner(System.in);
		// calling the function 
		String str3 = input.next();
		String str4 = reverse(str3);
		System.out.println(str4);

	}

}

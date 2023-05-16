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
	
	public static void isPalindrome(String str) {
		//Your code goes here
		// find the lenght of the string and 
		//smae string match from the reverse string then it is the 
		String stv = "";
		String st = "";
		boolean result = false ;
		for (int i = str.length()-1 ; i >=0 ; i--) {
			stv = stv + str.charAt(i);
		}
		for (int i = 0; i < str.length(); i++) {
			st = st+str.charAt(i);
		}
		System.out.println(stv+"=");
		System.out.println(st);
     
     if (st.equals(stv)) {
		 result = false ;
	 }

	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// so lets start the  write the code of the reverse of the string 
		// now the calling the function of the 
		Scanner input = new Scanner(System.in);
		// calling the function 
		String str3 = input.next();
		String str4 = reverse(str3);
		//System.out.println(str4);
		isPalindrome(str3);
		
		// check the simple string output 
		String sc = new String("hellow");
		System.out.println(sc);

	}

}

import java.util.Scanner;

public class ternaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // now we are the testing the the operator of the java
			int b =3;
			int a =2;
			int c = (a>b)?10:12;
			System.out.println(c);
			
			Scanner input = new Scanner(System.in);
			System.out.println("enter your age");
			int age = input.nextInt();
			char  m1 = '\u23E9';
			char c1 =(age>18)?m1:'s';
			System.out.println(c1);

	}

}

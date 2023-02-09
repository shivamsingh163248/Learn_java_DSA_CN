import java.util.Scanner;

public class lovepurposing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now we will the writing the program of the purposing of the girlfriend
		Scanner name = new Scanner(System.in);
		// this input taking from the user 
		System.out.println("enter your name");
		String user_name = name.next();
		System.out.println("enter your age");
		int age = name.nextInt();
		System.out.println("enter you gender example M/F");
		char love = '\u2665';
		char gender = name.next().charAt(0);
		if ((age>18 && age<25)&& (gender == 'F')) {
			System.out.println("i love you "+user_name+""+love);
		} else {
           System.out.println("sorry you are the not perfect not me ");
		}
		

	}

}

import java.util.Scanner;
public class lovepurposing {
public static void main(String[] args) {
Scanner name = new Scanner(System.in);
		System.out.println("enter your name");
		String user_name = name.next();
		System.out.println("enter your age");
		int age = name.nextInt();
		System.out.println("enter you gender example M/F");
		char love = '\u2665';
		char gender = name.next().charAt(0);
		System.out.println("enter your hight in fite");
		float your_hight = name.nextFloat();
		if ((age > 18 && age < 25) && (gender == 'F' || gender == 'f')) {
            if ((your_hight >= 5) && (your_hight <= 6)) {
				System.out.println("i love you " + user_name + "" + love);
			} else {
				if (your_hight > 6) {
					System.out.println("sorry !you hight is the greater  then 6  fit ");
				} else {
					System.out.println("sorry ! your hight is less then 5 fit");
				}
			}
		} else {
			System.out.println("sorry you are the not perfect for me ");
		}

		name.close();
	}

}

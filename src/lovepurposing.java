import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class lovepurposing {
public static void main(String[] args) {
Scanner name = new Scanner(System.in);
		System.out.println("enter your name");
		String user_name = name.next();
		System.out.println("enter your age");
		int age = name.nextInt();
		System.out.println("enter you gender example M/F");
		char love = '\u2764';
		char gender = name.next().charAt(0);
		System.out.println("enter your hight in fite");
		float your_hight = name.nextFloat();
		if ((age > 18 && age < 25) && (gender == 'F' || gender == 'f')) {
            if ((your_hight >= 5) && (your_hight <= 6)) {
				System.out.println("i love you " + user_name + "" + love+love+love);
			} else {
				if (your_hight > 6) {
					System.out.println("sorry !"+user_name+" you hight is the greater  then 6  fit ");
					System.out.println(" sorry"+user_name+" mummy nahi manegi kyo ki bhaut hight hai na ");
					
				} else {
					System.out.println("sorry ! "+user_name+" hight is less then 5.3 fit");
					System.out.println("sorry ! "+user_name+" mummy nahi manegi yarr ! kyo ki hight kam hai  na ");
				}
			}
		} else {
			System.out.println("sorry! "+user_name+" you are the not perfect for me ");
		}

		name.close();
	}
}


// now fist  import the java.utill function 
import java.util.*;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now making the program of the leap year
		// using the condition operation like a if else or else if or other
		// we know  that the making the program of the leap year if the divide from the 4 and not divide from the 100  and
		// divide from the 400 that follow  the algorithm approach 
// now creating the scanner function
		Scanner input = new Scanner(System.in);
		// now display the message to the user 
		System.out.print("enter the year which you find the leap year ");
		// now taking the input from the user
		long value1 = input.nextLong();
		// now value1 store the value from the user
		if ((value1%4 == 0)&&(value1%100 != 0 )|| (value1%400 == 0)) {
			System.out.println("this year "+ value1+" is the leap year");
		}else {
			System.out.println("this is not leap year");
		}
		// NOW we write the program of the grading system by using the  else if condition 
		// taking the input from the user 
		System.out.println("enter the your the mark ");
		double mark  = input.nextDouble();
		System.out.println("enter over all mark ");
		double overall = input.nextDouble();
		// now calculating the percent of the your mark 
		// write the algorithm of percent
		double percent = (mark/overall)*100;
		// now printing the percent value and show the user 
		
		System.out.println("your percent is the "+percent+"%");
		// now we the calculating the grade of the percent 
		if (percent >= 90 && percent <= 100) {
			System.out.println("yout grad is the +A /n you are the passed !");
		} else if(percent >=80 && percent <= 89) {
              System.out.println("your grad id the A");
		}else if (percent >=70 && percent <= 79) {
			System.out.println("your gread is the B");
		}else if (percent >=60 && percent <= 69) {
			System.out.println("your grad is the C");
		}else if (percent >=50 && percent <= 59) {
			System.out.println("your grad is the D");	
		}else if (percent >=40 && percent <= 49) {
			System.out.println("your grad is the E");
		}else if (percent >=30 && percent <= 39) {
			System.out.println("your grad is F  FAIL!");
		}
		// NOW we changed the percent in the integer form
		// using of the type casting java method
		int per = (int)percent;
		System.out.println("you percent is the "+per+"%");
		// now we the close the input that are the scanner function
		input.close();
	}

}

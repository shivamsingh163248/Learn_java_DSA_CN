import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("now we are the printing the while program ");
 System.out.println("now agian i starting the java ");
 // now we are the writing the program of the else if that are using in the java program 
 // so frit we are the writing thr condation 
 // now we will taking the input from the user 
 Scanner input = new Scanner(System.in);
 System.out.println("enter the value for the chackking the even odd ");
 int x = input.nextInt();
 
 if (x%2 == 0) {
	System.out.println("this is the even nuber");
}else if (x%2 != 0) {
	System.out.println("this is the odd number");
}else {
	System.out.println("this number not understand by the sytem ");
}
 // now we learning the switch statement 
 switch (x) {
case 1:
	System.out.println("this is number of the 1 ");
	break;
case 2 :
	System.out.println("this is the number of the two 2 ");
default:
	System.out.println("this is the default value using by the ");
	break;
}
 //  always recommended in switch case applying the break statement for the stop executing 
 // now we will reading the next topic 
 // if we shell using the float variable passing  as the parameter in the switch case
 System.out.println("enter your the staritng name  ");
 char y = input.next().charAt(0);
 switch (y) {
case 'a':
case 'A':
{
	System.out.println("you are the vary lucky person  beause your frist name are the starting "+y);
}	
	
	break;
case 'b':
case 'B':
{
	System.out.println("your name are the starting from the b");
	}
break;

default:
       System.out.println("system are not desiding the what are the your name ");
	break;
}
	}

}

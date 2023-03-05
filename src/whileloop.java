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
 
   
	}

}

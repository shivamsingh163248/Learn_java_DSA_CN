import java.util.*;
public class equation {
public static void main(String[] args) {
	// NOW We are the programing of the equation of the math matic of a+b whole square
	float a,b,c ;
	
	Scanner input = new Scanner(System.in);
	// now hear we are the taking input from the user 
	// so we re the scanner function used and taking the input of the a 
	System.out.println("enter the value of the a");
	a = input.nextFloat();
	System.out.println("enter the value of the b");
	b = input.nextFloat();
	c = (a*a)+(b*b)+(2*a*b);
	System.out.println("the value of the (a+b)*(a+b) "+c);
	// if we are the using type casting then uses the eplicit o the implicit type casting
	int d = (int)c;
	System.out.println("the value of the a+b whole aquare is the "+d);
	input.close();
	
}
}

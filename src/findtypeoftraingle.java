
import java.util.Scanner;

public class findtypeoftraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now we are the writing the a program of the check type of the triangle so lets written the program
		// now the making the class of the scanner 
		Scanner input = new Scanner(System.in);
		// taking the input is the float value
		System.out.println("id the trinale vertix is the ABC");
		System.out.println("enter the length of the side of the trianle AB ");
		 float a = input.nextFloat();
		 System.out.println("enter the lenght of the trinale BC");
		 float b = input.nextFloat();
		 System.out.println("enter the length of the trinalge of AC");
		 float c = input.nextFloat();
		 System.out.println("this is the number");
		 
		classifcationtriange(a, b, c);
		input.close();
	}
		
// making the method of the over loading of the classification of the triangle between of the equilateral triangle and the isoscale triangle and the scalene triangle 
	public static void  classifcationtriange(float a , float b , float c) {
		// hear we are defining the value of the  a , b, c 
		// we are the writing the condition of the triangle 
		if (a==b && b==c && c==a) {
			System.out.println("this is the equilateral triangle");
		}
		if (a!= b && b!= c && c!=a) {
			System.out.println("this is the scalen triangle ");
		}
		if ((a==b || a==c  || c==b  )) {
			System.out.println("thsi is the isocale trianle");
		}
	}
	
}

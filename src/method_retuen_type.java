import java.util.Scanner;

public class method_retuen_type {
	
	// so  i try to learn the method the return type that are the using heavily in the programming 
	// this type of method are the heavily are the using in the field  of the developer field 
	public static void area_rectangle() {
		// now taking the input form the user so  the user 
		// now the making the object for the scanner
		Scanner input = new Scanner(System.in);
		System.out.println("enter the length of the rectangle");
		int lenght = input.nextInt();
		System.out.println("enter the widht of the rectengle");
		int widht = input.nextInt();
		// them now calculating the are of the rectangle 
		int area = lenght*widht;
		System.out.println(area);
	}
	
	// now write the second the function  of the return type 
	public static int area_of_square(int a , int b) {
		int area = a*b;
		return area ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area_rectangle();
		System.out.println(area_of_square(4, 5));
		area_of_square(3, 4);

	}

}

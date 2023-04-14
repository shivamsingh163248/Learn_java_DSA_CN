import java.util.Scanner;
public class mthodoverloding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now call the function with the parameter 
		shiva(5, 7);
		gretestnum();

	}
public static void shiva(int a , int b ) {
	// this is the method for the apppling the rule of the method 
	// meke the program of the sum which are the adding for tha sum
	
	int g = a+b ;
	System.out.print(g);
	
}
// again we will make the method of the find the greatest number of the input write the code for this 
public static void gretestnum() {
	// now we are the printing the output to display the user 
	System.out.println("enter the frist number");
	// make the input class 
	Scanner input = new Scanner(System.in) ;
	// now make the input is the scanner function 
	int a = input.nextInt();
	System.out.println("enter thE SECOND NUMBER ");
	int b = input.nextInt();
	System.out.println("enter the 3 number");
	int c = input.nextInt();
	System.out.println("enter thE 4 NUMBER ");
	int d = input.nextInt();
	System.out.println("enter the 5 number");
	int e = input.nextInt();
	int i = 0 ;
	
	// now we re the writing the condition
	if (a>b) {
		 i = a ;
	}else{
		i = b;
	}
	if (c>i) {
		i = c;
	} 
	if (d>i) {
		i = d;
	}
	if(e>i) {
    i = e;
	}
	System.out.println(i);
}
}

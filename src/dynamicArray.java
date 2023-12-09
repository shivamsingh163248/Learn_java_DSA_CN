import java.util.Scanner;

public class dynamicArray {

	public static void main(String[] args) {
		 
		System.out.println("enter the number ");
    Scanner input = new Scanner(System.in) ; 
    String number = input.nextLine();
    
  
    String[]num = number.split("\\s");
    for (String string : num) {
		System.out.print(string+" ");
	}

	}

}

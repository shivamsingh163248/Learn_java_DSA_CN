import java.util.*;
public class condational {
	
	static void shivam( float value1 , float value2) {
		
     System.out.println("this is the output of the addation");
     System.out.println(value1+value2);
     System.out.println("this is the output of the multiplication");
     System.out.println(value1*value2);
     System.out.println("the out of the substractuon ");
     System.out.println(value1-value2);
     
     
	}



	public static void main(String[] args) {
		// now we are the using the function \
		float value1 , value2;
		String E1 = "ENTER THE FRIST VALUE ";
	       String E2 = "ENTER THE SECOND VALUE";
			System.out.println("your addiation will preform hear");
			Scanner input = new Scanner(System.in);
			System.out.println(E1);
			value1 = input.nextFloat();
			System.out.println(E2);
			value2 = input.nextFloat();
	shivam(value1,value2);
	input.close();
}
}
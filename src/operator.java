import java.util.*;
public class operator {

	public static void main(String[] args) {
		// now we are the learn the arthmatic oprators 
		///fristaly we larn about the arthamtic oprators
		// we are the using all the opratiors using the sccaner methon in java we are the scannig the input and tack the input 
		// the we are the creating the inport java.utill file and tha make the java function 
		Scanner input = new Scanner(System.in);
		// taking tha varable anf of his det type 
		//frist we are the taking the int deta type
		int valu1 , value2 , value3 ;
		String E1 = "enter the frist value";
		String E2 = "enter hte second value";
		String E3 = "your output value is ";
		
		System.out.println("heare we are the adding preform ");
		
		System.out.println(E1);
		valu1 = input.nextInt();
		System.out.println(E2);
		value2 = input.nextInt();
		value3 = valu1 + value2 ;
		System.out.println(E3+value3);
		input.close();
		

	}

}

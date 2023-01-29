import java.util.*;

public class operator {
	 static void shivam(){
		 System.out.println("my name is shivam");
	  }
	// now again the make function nd usin the parameter
	 // now this the the best opton for me
	 // i will chack the parameters 
	 // use it 

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
		// now we are the using the modulus oprators that given the remendor value o the division 
		// now we are the test the   increment oprators 
		System.out.println("here er are the update  the value "+ ++value3);
		
		// now we are try to make the funstion and used it
	   shivam();
		input.close();
		

	}

}

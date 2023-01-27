import java.util.*;
public class function {
        // now we are the  write the function 
	static void add(float value1 , float value2) {
		// simple we write the add function 
	 System.out.println("your frist value is the "+value1);
	 System.out.println("your second value is  the "+value2);
	 // now we are the value of the given integer 
	 float value3;
	 value3 = value1+value2;
	 System.out.println("addation of the your value is  "+value3);
	}
	// now we are the again write the function of the multiply
	// so we will now started the function of the multiply
	static void multiply(double value1 , double value2){
		// now hear we write the multiply program
		System.out.println("your frist value is the "+value1);
		 System.out.println("your second value is  the "+value2);
		 // now we are the value of the given integer 
		 double value4;
		 value4 = value1*value2;
		 float value3 = (float)value4;
		 // now we will change  and  type casting in java and double value convert into float
		 System.out.println("multiplication  of the your value is  "+value3);
	}
	// we are the again write the divide function and use it 
	static void divide(double value1 , double value2) {
		// now we will the start program of the divided 
		System.out.println("your the frist value is the devided "+value1);
		System.out.println("your the second the value is the diviser "+value2);
		// now we are the printing the value after calculating 
		 double value4;
		 value4 = value1/value2;
		 int value3 = (int)value4;
		 // now we will change  and  type casting in java and double value convert into float
		 System.out.println("multiplication  of the your value is  "+value3);
		
	}
	// now we are make  the function of the subtraction 
	//hear we are the starting  the function 
	static void subtraction (float value1 , float value2) {
		// fist we are out put given of the input value 
		float value3 = value1 - value2;
		// now we are the printing the value 
		System.out.println("the substraction value of the "+value3);
	}
	
	// now again make the function of the modulus 
	//write the function of the modulus 
	// modulus function given the value of the remainder value after the division
	
	static void modulus(float value1 , float value2) {
		//show the input from the user use the system out  function 
		System.out.println("your the fist value is devidend "+value1);
		System.out.println("your the second value is the diveser "+value2);
		// now hear we the write the calculation part 
		// the stored value in the next variable 
		float value3 = value1%value2;
		// use the method of the type casting and change the value float to integer
		int value4 = (int)value3;
		// now we will the print the value 
		System.out.println("the modulus value of the "+value4);
				}
	
	// hear we are the making the now function for the selected value 
	/*static void 
	switch (key) {
	case value: {
		
		yield type;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + key);
	}*/
	
	public static void main(String[] args) {
		//today we are the learn the condition function with the help of the function
		//now we are the write the function of the scanner
		Scanner input = new Scanner(System.in);
		System.out.println("select the opration number" );
		System.out.print("1 = adding " +'\n' + "2 = subtraction"+'\n' +"3 = multiply"+'\n' +"4 = divide"+'\n' +"5 = modulus"+'\n' );
		// now we are the using the switch case for the selecting option 
		int inputvalue ; 
		System.out.println("enter the opration number");
		inputvalue = input.nextInt();
		// now we are the selected the value show the user . user the value the right selected ot not
		System.out.println("you are the selected value is "+inputvalue);
		// we ask the question from the user  
		System.out.println(" is opration  correct ? yes/no");
		String yes  = input.next();
		String y = "yes" , Y = "YES";
		String n = "no" , N = "NO";
		
		// now we take input from user for the calculation 
	    
	
		if ((yes.equals(y))||(yes.equals(Y))) {
			 switch (inputvalue) {
			case 1: {
				System.out.println("Enter hte fist value");
				float value1 = input.nextFloat();
				System.out.println("Enter the second value");
				float value2  = input.nextFloat();
				// now we calling the function of the adding
				add(value1 , value2);
				break;
				
			}
			case 2:{
				System.out.println("Enter hte fist value");
				float value1 = input.nextFloat();
				System.out.println("Enter the second value");
				float value2  = input.nextFloat();
				// now we calling the function of the adding
				subtraction(value1 , value2);
				break;
			}
			case 3:{
				System.out.println("Enter hte fist value");
				float value1 = input.nextFloat();
				System.out.println("Enter the second value");
				float value2  = input.nextFloat();
				// now we calling the function of the adding
				multiply(value1 , value2);
				break;
			}
			case 4:{
				System.out.println("Enter hte fist value");
				float value1 = input.nextFloat();
				System.out.println("Enter the second value");
				float value2  = input.nextFloat();
				// now we calling the function of the adding
				divide(value1 , value2);
				break;
			}
			case 5:{
				System.out.println("Enter hte fist value");
				float value1 = input.nextFloat();
				System.out.println("Enter the second value");
				float value2  = input.nextFloat();
				// now we calling the function of the adding
				modulus(value1 , value2);
				break;
			}
			default:
				System.out.println("Unexpected value: " + inputvalue +'\n'+"you enter the wrong value");
			}
		}else {
			System.out.println(" Again select the opration number" );
			System.out.print("1 = adding " +'\n' + "2 = subtraction"+'\n' +"3 = multiply"+'\n' +"4 = divide"+'\n' +"5 = modulus"+'\n' );
			// now we are the using the switch case for the selecting option 
			int inputvaluee ; 
			System.out.println("enter the opration number");
			inputvaluee = input.nextInt();
			// now we are the selected the value show the user . user the value the right selected ot not
			System.out.println("you are the selected value is "+inputvaluee);
			
			switch (inputvaluee) {
			case 1: {
				System.out.println("Enter hte fist value");
				float value1 = input.nextFloat();
				System.out.println("Enter the second value");
				float value2  = input.nextFloat();
				// now we calling the function of the adding
				add(value1 , value2);
				break;
				
			}
			case 2:{
				System.out.println("Enter hte fist value");
				float value1 = input.nextFloat();
				System.out.println("Enter the second value");
				float value2  = input.nextFloat();
				// now we calling the function of the adding
				subtraction(value1 , value2);
				break;
			}
			case 3:{
				System.out.println("Enter hte fist value");
				float value1 = input.nextFloat();
				System.out.println("Enter the second value");
				float value2  = input.nextFloat();
				// now we calling the function of the adding
				multiply(value1 , value2);
				break;
			}
			case 4:{
				System.out.println("Enter hte fist value");
				float value1 = input.nextFloat();
				System.out.println("Enter the second value");
				float value2  = input.nextFloat();
				// now we calling the function of the adding
				divide(value1 , value2);
				break;
			}
			case 5:{
				System.out.println("Enter hte fist value");
				float value1 = input.nextFloat();
				System.out.println("Enter the second value");
				float value2  = input.nextFloat();
				// now we calling the function of the adding
				modulus(value1 , value2);
				break;
			}
			default:
				System.out.println("Unexpected value: " + inputvaluee +'\n'+"you enter the wrong value");
			}
		} 
		
	}

}

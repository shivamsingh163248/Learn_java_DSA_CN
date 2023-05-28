package shivam;

public class frection_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// mow creating the object 
		frection number = new frection(8,16);
		// now printing the value using the gretter and setter method 
		 number.print();
		 // again  when the changed the function with the public 
		 number.increment();
		 // this is the also the given the write answer 
		 number.print();
		 // again creatign the new object for the frection class 
		 frection nextnumber = new frection(5, 2);
		 // check the printing for the value of the number 
		 nextnumber.print();
		 //now calling the update the fraction with the same object 
		 number.add(nextnumber);
		 //again the print the number and the test the value are update or not 
		 number.print();  
		 
		 // now creating the object of the new object due to its the return type 
		 frection s3 ; 
		s3 = frection.add_two(nextnumber, number);
		// check the printing the value of the number 
		s3.print();
		 
	}

}

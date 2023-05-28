package shivam;

public class calcualtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// creating the new object 
		calculator_oject s1 = new calculator_oject(3, 5);
		// calling the function for the printing 
		s1.print();
		s1.add();
		s1.print();
		// calling the new object for the adding 
		calculator_oject s2 = new calculator_oject(5, 5);
		s2.add();
		
		s1.addobject(s2);
		// check the printing the s1 object for the adding the object 
		
		s1.print(); 
	}

}

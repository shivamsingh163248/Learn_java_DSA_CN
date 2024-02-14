package learn_generic_method;

public class arrayImplimenationTest {

	public static void main(String[] args) {
		
		// creating the integer type array 
		Integer arr[] = {1,3,4,5,6,5,6} ; 
		String stringArr[] = {"shiva" , "itisha" , "mango" , "pineapaple"} ; 
		
		
		// now creating the object of the array inplimenataion class 
		arrayImplimentation<Integer> check = new arrayImplimentation<Integer>(arr, 5) ; 
		arrayImplimentation<String> check1 = new arrayImplimentation<String>(stringArr, "creatde by shivam") ; 
		
		// now printing the both 
		
		check.printing();
		check1.printing();
		
	}

}

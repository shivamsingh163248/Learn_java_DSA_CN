package shivam;

public class polynomial_class {
	//  we are the using the access modifire 
	
	private int arr[] ;
	
	// now creating the constructor with the no any parameter 
	public polynomial_class() {
		// select the size of the array 
		arr = new int[5] ; 
		
	}
	
	// creating the private double size function 
	private void  double_size() {
		// creating the new array 
		int temp[] ; 
		temp = arr ; // all the  reference  all the copy of the old array 
		// now   creating the new array '
		arr = new int [temp.length *2] ; 
	}
	

}

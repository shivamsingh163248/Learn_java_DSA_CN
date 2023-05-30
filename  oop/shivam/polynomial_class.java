package shivam;

public class polynomial_class {
	//  we are the using the access modifire 
	
	private int arr[] ;
	private  int size  ; 
	// now creating the constructor with the no any parameter 
	public polynomial_class() {
		// select the size of the array 
		arr = new int[5] ; 
		 size = 0 ;
	}
	
	// creating the private double size function 
	private void  double_size() {
		// creating the new array 
		int temp[] ; 
		temp = arr ; // all the  reference  all the copy of the old array 
		// now   creating the new array '
		arr = new int [temp.length *2] ; 
		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i] ; 
		}
	}
	
	// make the function using the gitter and setter for the checking the lengh of the arry and value of the array 
	public void check_array() {
		System.out.print("whole array is = " );
		for (int i = 0; i < this.arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	// now check the array  length 
	public int array_size() {
		int size = this.arr.length ; 
		return size ; 
	}

	
	// now creating the set value passed with the parameter 
	public void set_cofficent(int cofficet , int degree) {
		// now checking the degree are the exit or not in the array index 
		if (arr.length -1 < degree) {
			// calling the function of the double array 
			double_size();
		}
		// store the value of the the array in the index 
		// check the lenght of the array 
		if (degree>=size) {
			size = degree+1 ; 
		}
		
		arr[degree] = cofficet ; 
		
		
	}
	
	// again make the function of the for the printing 
 // make public access modifier 
	public void print_array_value() {
		// now using the for loop for the printing of the array 
		for (int i = 0; i < arr.length; i++) {
			if (this.arr[i] != 0 ) {
				System.out.print(this.arr[i]+"x"+i+" ");
			}
		}
	}
	
	// creating the add function for the add two equation 
	public polynomial_class add (polynomial_class s1) {
		
		// check the degeree are the same then add 
		// check the size of the lenght 
		int bigsize = Math.max(this.size, s1.size);
		for (int i = 0; i < bigsize; i++) {
			this.arr[i] = this.arr[i]+s1.arr[i];
		}
		// now creating the new array 
		polynomial_class result = new polynomial_class() ; 
		result.arr = this.arr ; 
		return result ; 
		
	}
	

}

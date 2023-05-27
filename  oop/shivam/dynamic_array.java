package shivam;

public class dynamic_array {
	//now creating the array in the array 
	// now we are creating the array with the private access modifier 
	private int arr[] ; 
	// again the creating the class of the 
	private int nextindex ; 
	
	
	// now crating the constructor  
	public dynamic_array() {
		// TODO Auto-generated constructor stub
		arr = new int [5];
		nextindex = 0 ; 
	}
	// creating the size of the function 
	public int size() {
		return nextindex ;
	}
	// check the next element is empty
	public boolean isEmpty() {
		return nextindex == 0; 
	}
	public int get(int i ) {
		if (i>=nextindex) {
			// throw error
			return -1 ;
			
		}
		return arr[i];
	}
	// creating the add function for the adding the value in the index of the array 
	// and the increment the of the value of the next index 
	// creating the add the function 
	public void add( int n ){
		// check the array the lengh is the full then increase the capacity 
		if (nextindex == arr.length) {
			// now these codition we are the creating the the double capacity of the array size 
			// so increase the lenght of the array crating the function 
			doublelenght();
		}
		
		arr[nextindex] = n ; 
		// now increment the value of the next index 
		nextindex++ ; 
	}
	
	// creating the private function 
	private void doublelenght() {
		
		int temp[] = arr ; 
	}

}

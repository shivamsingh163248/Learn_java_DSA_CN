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
		// now creating the new array of the double length 
		arr =  new int[temp.length *2];
		// now copy all element of the temp array 
		//using the for loop 
		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
		
	}
	
	// creating the set function for the set value in the index  of the array 
	public void set(int indexvalue , int setvalue) {
		// calling the function 
		// if any want to set the value greater then the index then trought error
		if (indexvalue >= nextindex) {
			return  ; 
		}
		arr[indexvalue] =  setvalue ;
	}

	// now creating the function for the remove of the last element in the array 
	public int remove_last() {
		  if (nextindex == 0) {
			// throw error 
			return -1; 
		}
	int temp = arr[nextindex-1];
	arr[nextindex-1] = 0 ;
	nextindex-- ; 
	return temp ; 
	}
}

package Dynamic_arrys;

public class ArraysFunction {
	
	// creating the all the variable 
	
	// creating the arrays 
	int[]arr ; 
	// creating the constructor 
	public ArraysFunction() {
		
		arr = new int[5] ; 
	}
	
	
	private static int  count  = 0 ; 
	
	// now using the set function set the values 
	
	public void set(int num) {
		
		// first check the size 
		
		if (count == arr.length) {
			size() ; 
		}else {
           arr[count] = num ; 
           count++ ; 
		}
		 
		
	}

	private void size() {
		
		
		// creating the size of double and double 
		int[]copyarr = new int[arr.length]  ; 
		
		// creating the for loop for the 
		for (int i = 0; i < copyarr.length; i++) {
			copyarr[i] = arr[i] ; 
			
		}
		
		// now arrays 
		arr = new int[arr.length*2] ; 
		
		
	}
	
    
}

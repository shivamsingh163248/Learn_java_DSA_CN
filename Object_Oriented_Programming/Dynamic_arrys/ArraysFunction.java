package Dynamic_arrys;

public class ArraysFunction {
	
	// creating the all the variable 
	
	// creating the arrays 
	int[]arr ; 
	// creating the constructor 
	public ArraysFunction() {
		
		arr = new int[5] ; 
		System.out.println(arr);
	}
	
	
	private static int  count  = 0 ; 
	
	// now using the set function set the values 
	
	public void set(int num) {
		
		// first check the size 
		
		if (count == arr.length-1) {
			size() ; 
		}
           arr[count] = num ; 
           count++ ; 
		
	
		// creating the try catch finaly 
//		try {
//			arr[count] = num ; 
//	           count++ ; 
//			
//			
//		} catch (Exception e) {
//			size();
//			
//		}finally {
//			
//			arr[count] = num ; 
//	           count++ ; 
//			
//		}
		 
		
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
		System.out.println(arr);
		
		
		// again creating the loop  the values in the arrays 
		for (int i = 0; i < copyarr.length; i++) {
			arr[i] = copyarr[i] ; 
		}
		
	}
	
	public void print(){
		
		// creating the loop for the print
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i]+" ") ; 
		}
	}
	
	// now creating the remove and last element function 
	
	public void lastElement() {
		 
		System.out.println(arr[count-1]);
	}
	
	public void remove() {
		
		if (count > 1) {
			count-- ; 
		}
	
	}
	
	
	
	
	
    
}

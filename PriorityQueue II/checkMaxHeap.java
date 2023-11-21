
public class checkMaxHeap {
	
	// creating the method 
	public boolean checkmaxheap(int[]arr) {
		
		// creating the loop 
		for (int i = 0; i < arr.length; i++) {
			// now difine the parent index 
			
			// now the parent index 
			int parentindex = i ; 
			int leftchildIndex = 2*parentindex+1 ; 
			int rightChildIndex = 2*parentindex+2 ; 
			
			// now creating the condition for the checking the root node is the maxmimum 
			if (leftchildIndex < arr.length && arr[leftchildIndex]> arr[parentindex]) {
				return false ; 
			}
			// creating the right condition for the right child 
			if (rightChildIndex < arr.length && arr[rightChildIndex]>arr[parentindex]) {
				return false ; 
			}
			
		}
		return true ; 
	}

}

import learn_generic_method.parentdetail;

public class heapshort {
	
	 
	// creating the default constocter 
	public heapshort() {
		
	}
	
	// creating the function for the insurt function array in heap 
	
	public void insurt(int[]arry , int i) { // i is the child index 
		
		// now child node 
		int childnode = i ; 
		int prenetindex = (childnode-1)/2 ; 
		
	// after the finding the index 
		
		// creating the condition if the parenet node is the high value 
		while (childnode > 0) {
			
		
		
		if (arry[childnode] >arry[prenetindex]) {
			
			// now switch the element 
			int temp = arry[childnode];
			arry[childnode] = arry[prenetindex] ; 
			// now parent index is the child 
			arry[prenetindex] = temp ; 
			
			// mow the children become updagread 
			childnode = prenetindex ; 
			prenetindex = (childnode-1)/2 ; 
		}else {
			return ; 
		}
		}
		
		
	}
	
	// creating the remove function for the removing the min 
	
	public int removemin(int[]arr , int heapsize) {
		
		// array frist is the min element 
		int minValue = arr[0] ; 
		//now printing the element 
		System.out.println(minValue);
		// now storing the last index at the frist arry 
		arr[0] = arr[heapsize-1] ; 
		// now reusing the and remove last element of the heap after the copy 
		heapsize-- ;
		
		// now creating the parent index 
		int parentindex = 0 ; 
		int leftchildIndex = 2*parentindex + 1 ; 
		int rightchildIndex = 2*parentindex + 2 ; 
		
		
		//now checking the and creating the heapyfiy process 
		
		while (leftchildIndex < heapsize) {
			
			// creating the minmum element 
			int minmumIndex = parentindex ; 
			// now finding the minmum in three node 
			if (arr[minmumIndex] > arr[leftchildIndex]) {
				//now update the minmum index 
				minmumIndex = leftchildIndex ; 
				
			}
			// now compare between right child index the root index 
			if (rightchildIndex < heapsize && arr[rightchildIndex] < arr[minmumIndex] ) {
				// now update the value 
				minmumIndex = rightchildIndex ; 
			}
			
			// after the finding the minimum element sweping the perform 
			// if the minimum is the equal to the parent it means no changed found 
			if (minmumIndex != parentindex) {
				// now sweping is prefoem 
				int temp = arr[parentindex] ; 
				arr[parentindex] = arr[minmumIndex] ; 
				arr[minmumIndex] = temp ; 
				
				// now chenae the parent index 
				parentindex = minmumIndex ; 
				// again the value of the changed of the 
				 leftchildIndex = 2*parentindex + 1 ; 
				 rightchildIndex = 2*parentindex + 2 ; 
				
				
			}else {
				break ; 
			}
			
			
		}
		return minValue ; 
		
		
	}
	
	
	
	
	
	
	
	
	
	

}

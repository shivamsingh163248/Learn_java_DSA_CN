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
	
	
	
	
	
	

}

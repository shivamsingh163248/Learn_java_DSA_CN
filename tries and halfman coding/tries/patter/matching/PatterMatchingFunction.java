package tries.patter.matching;

import java.util.ArrayList;

public class PatterMatchingFunction {
	
	
	// creating the refrence of the root 
	TriesNode root ; 
	
	// now creating the constructor  
	public PatterMatchingFunction() {
		
		root = new TriesNode('\0') ; 
	}
	
	
	
	// CREATING THE function of the add search 
	// now need to creating the remove function 
	
	private void addHelper(TriesNode root, String world) {
		
		// creating the base codition 
		if (world.length() == 0 ) {
			root.isTerminal = true ; 
			return ; 
		}
		
		// finding the index of the node 
		int childindex = world.charAt(0) - 'a' ; 
		// now find the value which are the present in the list that are the tire node   
		TriesNode child = root.children[childindex] ; 
		
		// now checking the the condition 
		// if the child is the null then the insert the value 
		
		if (child == null) {
			
			// creating the child object 
			child = new TriesNode(world.charAt(0)) ; 
			// creating the connection 
			root.children[childindex] = child ; 
			root.count++ ; 
		}
		
		// now calling the same function 
		addHelper(child, world.substring(1));
		
	}
	
	private boolean searhHelper(TriesNode root, String world) {
		
		// creating the base condition 
		if (world.length() == 0 ) {
			return root.isTerminal ; 
		}
		
		// now finding the index 
		int childindex = world.charAt(0) - 'a' ; 
		// now finding the node 
		TriesNode child = root.children[childindex] ; 
		// check the null or not 
		if (child == null) {
			return false ; 
		}
		return searhHelper(child, world.substring(1)) ;  
	
	}
	
	// creating the search function 
	public boolean search(String world) {
		// creating the helpr function 
	return 	searhHelper(root , world) ; 
	}
	
	


	public void add(String world) {
		
		// creating the helper function 
		addHelper(root , world) ; 
	}
	
	// creating the arrylist 
	
	public boolean pattermatching(ArrayList<String>world , String vector) {
		
		// first finding the the string that are the presnet in the array list 
		// creating the loop for the finding 
		
		for (int i = 0; i < world.size(); i++) {
			// now finding the string 
			String newString = world.get(i) ; 
		
	// now creating again for loop in the for loop \
			for (int j = 0; j < newString.length(); j++) {
				
				add(newString.substring(j));
			}
			
		}
		
		return search(vector) ; 
	}





	
}

package tries.patter.matching;

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
	
	
	
	public void add(String world) {
		
		// creating the helper function 
		addHelper(root , world) ; 
	}





	
}

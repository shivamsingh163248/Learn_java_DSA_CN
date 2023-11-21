package tries;



public class triesImplimentFunction {

	// creating the private access modifire 
	private triesNode root  ; 
	
	// now creating the constoctur 
	public triesImplimentFunction() {
		// creating the object with the 
		root = new triesNode('\0') ;
	}
	
	// now creating the different function 
	
	public void add (String world) {
		
		// creating the helper function for the insurt the world 
		addhepler(root , world) ; 
		
	}
	
	private void addhepler(triesNode root, String world) {
		
		// creating the condition for the world is null or not 
		if (world.length() == 0) {
			// is means not preset 
			// now terminal is true 
			root.isTerminal = true ; 
			return ;
		}
		
		// find the child index 
		int childindex = world.charAt(0)- 'A' ; 
		// after the finding the child index insurint the element 
		// if element are abalbe 
		
		triesNode child = root.childrean[childindex] ; 
		
		// if the root is the null 
		if (child == null) {
			// now insurting the value in the 
			child = new triesNode(world.charAt(0)) ; 
			root.childrean[childindex] = child ; 
			// hear is the connection 
		}
		
		
		// now again calling 
		addhepler(child , world.substring(1));
		
		
	}

	// creting the remove function 
	public boolean search (String world) {
		
	}
	
	// creating the remove function 
	public void remove(String world) {
		
	}
}

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
		
		// creating the base condition 
		// creating the helper function 
		return searchHelpar(root , world) ; 
		
	}
	
	private boolean searchHelpar(triesNode root, String world) {
	
		// creating the base condtition 
		if (world.length() == 0) {
			return root.isTerminal ; 
		}
		
		
		// now checking the function 
		// frist finding the index of the char so finding char index 
		int childindex = world.charAt(0) -'A' ; 
		// storing the childindex address in the another reference 
		
		triesNode child  = root.childrean[childindex] ; 
		
		// if child is the find the null then return false 
		if (child == null) {
			return false ; 
		}
		
		// now calling for the another child 
		return searchHelpar(child, world.substring(1)) ; 
		
		
	}

	// creating the remove function 
	public void remove(String world) {
		
		// creating the remove helper function 
		// helper function for the supporting function use in this function 
		remoeHelper(root , world) ; 
		
	}

	private void remoeHelper(triesNode root, String world) {
		
		// now the concept is  the is terminal symboal 
		// creating the condition if the world is length is the 0 then is terminal is true 
		// this is the base condition 
		if (world.length() == 0) {
			root.isTerminal = false ; 
			return ; 
		}
		
		// fist finding the index of the world 
		int childIndex = world.charAt(0)-'A' ; 
		// now finding the address of the of the node in the arry  
		triesNode child = root.childrean[childIndex] ; 
		if (child == null) {
			return ; 
		}
		// now calling the same function for the insurting the char
		remoeHelper(child, world.substring(1));
	}
}

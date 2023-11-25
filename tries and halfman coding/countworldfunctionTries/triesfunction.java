package countworldfunctionTries;

public class triesfunction {
	
	// creating the root 
	private TriesNode root ; 
	
	// now creating the constructor 
	
	public triesfunction() {
		
		// now set the null char in java '\0' ; 
		 root = new TriesNode('\0') ; 
	}
	
	// now creating the add function 
	// creating the remove function 
	// creating the search function 
	
	public void add(String world) {
		// creating the helper function 
		addhelper(root , world) ; 
	}

	private void addhelper(TriesNode root, String world) {
		 
		// creating the function for the adding 
		// fist checking the world is the zero then the return 
		if (world.length() == 0 ) {
			return  ; 
		}
		
		// now fist find the index of the world 
	int chidindex = world.charAt(0)-'a' ; 
	// now find the tries node in the this index 
	TriesNode child = root.children[chidindex] ; 
	
	// now adding the data if the chid in not null 
	if (child == null ) {
		
		// now set the value 
		// calling the consticter 
		child = new TriesNode(world.charAt(0)) ; 
		// now creating the linking 
		root.children[chidindex] = child ; 
		// now countig in the increasse 
		root.count++ ; 
	}
	
	// now calling for the next element insurting 
	// now child become the root 
	addhelper(child, world.substring(1));
		
	}
	
	
	
	// now creating the search function 
	public boolean search(String world) {
		
		// now creating the search function 
		// creating the helper function  for the batter approch for the creating the private function 
		boolean result = searchHelper(root,world);
			return result ; 
		
		}

	private boolean searchHelper(TriesNode root, String world) {
		
		if (world.length() == 0 ) {
			return root.isTerminal ; 
		}
		
		// now fist finding the element 
		
		int childindex = world.charAt(0) - 'a' ; 
		// now finding the object that are the present in the index ; 
		TriesNode child = root.children[childindex] ; 
		
		// check the child is null or not 
		if (child == null) {
			return false ; 
		}
		
		// calling the function 
		
		return searchHelper(child, world.substring(1));
	}
	
	
	// now creating the remove function and creating the helper function 
	
	
	
	}




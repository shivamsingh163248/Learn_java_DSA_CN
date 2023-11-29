package tries.pelindrome.matching;



public class palindromeMatchingFunction {
	
	// creating the node 
	// creating the add fucntion 
	// creating the searching function 
	// writing the algorithum of the pelindrome matching 
	
	
	// creating the root 
  TriesNode root ; 
  // now creating the constructor 
  public palindromeMatchingFunction() {
	
	  root = new TriesNode('\0');
}
  
  // now creating the method 
  public void add (String world) {
	  // creating the helper function 
	  addHelper(root , world) ; 
  }

private void addHelper(TriesNode root, String world) {
 
	// this function make help for the 
	if (world.length() == 0) {
		root.isTeminal = true ; 
		return ; 
	}
	
  // finding the index 
	int childindex = world.charAt(0) - 'a' ; 
	TriesNode child = root.children[childindex] ; 
	// check found null or not 
	if (child == null) {
		// now adding the 
		child = new TriesNode(world.charAt(0)) ; 
		// now creating the connection 
		root.children[childindex] = child ; 
		root.count++ ; 
	}
	// calling the same function 
	addHelper(child, world.substring(1));
}


// creating the function 
  public boolean search(String world) {
	  return searchHelper(root , world) ; 
	  
  }

private boolean searchHelper(TriesNode root, String world) {
	
	// creating the base condtion 
	if (world.length()== 0) {
		return root.isTeminal ; 
	}
	
	// finding the index 
	int childindex = world.charAt(0) - 'a' ; 
	// now finding the node its present or null 
	TriesNode child = root.children[childindex] ; 
	// creating the condtion 
	if (child == null) {
		return false ; 
	}
	
	// creating the base condition 
	
	return searchHelper(child, world.substring(1));
}
 
// // creating the string reversing function 
public String reversing(String world) {
	
	// crating the new string 
	String a =" " ;
	
	for (int i = world.length(); i >= 0  ; i--) {
		 a += world.charAt(i);
	}
	
	return a ; 
}
  

}

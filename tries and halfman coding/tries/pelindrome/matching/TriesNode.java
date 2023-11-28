package tries.pelindrome.matching;

public class TriesNode {
	
	char value ; 
	boolean isTeminal ; 
	int count ; 
	TriesNode[]children ; 
	
	// creating the constructor 
	
	public TriesNode(char value) {
		this.value = value ; 
		isTeminal = false ; 
		count = 0 ; 
		children = new TriesNode[26] ; 
		
	}

}

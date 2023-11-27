package tries.patter.matching;

public class TriesNode {
	
	// solving the problem of the pattern matching 
	// creating the char type variable 
	char value ; 
	// checking the is terminal or not 
	boolean isTerminal ; 
	int count ; 
	TriesNode[]children ;
	
	// now creating the constructor
	public TriesNode(char value) {
		// set the value 
		this.value =  value ;
		children = new TriesNode[26] ; 
		isTerminal = false ; 
		count = 0 ; 
		
	}
	

}

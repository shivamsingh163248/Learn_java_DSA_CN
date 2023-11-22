package tries;

public class triesNode {
	
	// creating the node for the tries using the concept of the tree 
	char data ; 
	boolean isTerminal ; 
	// now creating the array of this class 
	triesNode childrean[]  = new triesNode[26];
	
	// now creating the constructor for the adding the data and the insilizer
	public triesNode(char data ) {
		// now set the data 
		this.data = data ; 
		// istremina is the default is the false 
		isTerminal = false ; 
		// now inislization the array 
		
		
	}

}

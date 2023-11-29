package countworldfunctionTries;


import tries.triesNode;

public class TriesNode {
	
	 // fist creatin the data 
	char data ; 
	boolean isTerminal ; 
	// class type creating the childrean 
	public TriesNode[]children  ; 
	// creating the count function 
	int count ; 
	
	// now creating the constocter 
	 public TriesNode(char data) {
		this.data = data ; 
		isTerminal = false ;
		children = new TriesNode[26] ; 
		count = 0 ; 
		
	}
	
	
	
	
	
}

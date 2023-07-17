package print_recusive;

public class node <T> { // this is the using for the generic for the set the value according to you 
  
	// creating the the public integer value 
	public T data ; 
	// again creating the head value 
	public node<T> next ; // this is the referencing to the object 
	
	// creating the node using the generic 
	public node(T data) { // this is the constocter 
		this.data = data ; 
	}
}

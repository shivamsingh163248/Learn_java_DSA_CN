package Implemantation.hasmap;

public class mapnode <T ,V>{ // creating the two type of the generic 
	// creating the t type key 
	// creating the v type value 
	// creating the next refrence of the same class 
	T key ; 
	V value ; 
	// creating the next refrence 
	mapnode<T, V>next ; 
	
	// now creating the the constrocter 
	
	public mapnode(T key , V value) {
		
		// creating the constrocter
		this.key = key ; 
		this.value =  value ; 
		
		
	}

}

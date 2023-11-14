package prioriy.queu;

public class Element <T> { // creating the generic type 
  
	T value ; 
	int prioriy ; 
	
	// creating the constructor  default 
	
	public Element(T value , int priority) {
		// now creating the set the value of the constrocter 
		this.value = value ; 
		this.prioriy = priority ; 
	}
}

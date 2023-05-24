package shivam;

public class frection {
	// Declared the variable with the access modifier 
	private int nominater ; 
	private int denominater ;
	
	// creating the constructor  of the above variable 
	public frection(int nominater, int denominater) {
	//	super();
		this.nominater = nominater;
		this.denominater = denominater;
		simplification();
		
	} 
	
	// creating the simply fraction function for the simplification  creating the function of the 
	// simplification 
private void simplification() {
	
	int lcd = 1 ; 
	// first check the number of the smallest  
	int lowestnumber = Math.min(nominater, denominater);
	// now find the lowest common deviser  if the the both with same number 
	for (int i = 2; i <=lowestnumber; i++) {
		// when  find the lowest number of the comment deviser 
		if (nominater % i == 0 && denominater %i == 0 ) {
			// if the both condition are the right then upgred the value of the lowest common deviser 
			lcd = i ; 
		}
	}
	
	// then divide the both nominator and denominator opf the simply value  
	nominater = nominater/lcd ; 
	denominater = denominater/lcd ; 
		
	}
// now printing the value of the noninator and denominator value 
//  creating the gatter and setter method for the the printing the value 
public  void print() {
	System.out.println(nominater+"/"+denominater);
}

}

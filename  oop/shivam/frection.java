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

// again make the function of the increment 

public void increment() {
	// that are the increment function in the fraction 
	// using the this keyword for the   
	// using the function 
	this.nominater = this.nominater+this.denominater ; 
	
   
	
}
// now printing the value of the noninator and denominator value 
//  creating the gatter and setter method for the the printing the value 
public  void print() {
	System.out.println(nominater+"/"+denominater);
//	increment() ; 
//	System.out.println(nominater+"/"+denominater);
}

//now creating the function with the paramere of the object 
public void add (frection s1) {
	// frist we are the adding the nominator nnd dinominator  
	// using the noninator and the update that value in the preset object 
	this.nominater = s1.nominater + this.nominater ; 
	this.denominater = this.denominater + s1.denominater;
}

// now passing the object as the argument in the  function  
//  creating   function with two parameter object of the same class 
// given the return type of the object 
public  static frection add_two(frection s1 , frection s2) {
	
	// creating the variable 
	int noninaor = s1.nominater + s2.nominater ; 
	int denominator = s1.denominater + s2.denominater ; 
	
	// creating the new frection 
	frection s3 = new frection(noninaor, denominator);
	
	
	
	return s3 ; 
	
}



}

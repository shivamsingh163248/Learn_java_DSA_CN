package freation_oop_concept;

import shivam.frection;

public class freaction {
	
	// creating the variable 
	int nominator ; 
	int denominator ; 
	
	
	// creating the add  function
	
	public freaction(int nomin , int denominator) {
		this.nominator = nomin ; 
		this.denominator = denominator ; 
	}
	
	public void  add (freaction num) {
		
		// returning the values 
		
		
		
		
	}
	
	// creating the simply function 
	public void simpliy() {
		
		// find the greatest common division 
		int minvalues = Math.min(nominator, denominator) ; 
		
		// creating the loop find the greatest commas divisor 
		int gcd   = 0 ; 
		for (int i = 2; i <= minvalues; i++) {
			
			// creating the condition 
			if (this.denominator%i == 0 && this.nominator%i == 0 ) {
				// now updating the values 
				gcd = i ; 
				
			}
		}
		
		// now dividing 
		this.nominator = this.nominator/gcd ; 
		this.denominator = this.denominator/gcd ; 
		
		
	}
	public void increment(freaction num) {
		
	}
	
	public void multi(freaction num) {
		
		
	}
	
	public void print() {
		
		System.out.println(this.nominator+"/"+this.denominator);
		
	}
	
	
	

}

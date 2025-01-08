package oopCodingNinjasProblem;

public class Polynomial {
	
	
	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/

	// creating the aarrys 
	int poly[]  = new int[10];
	public void setCoefficient(int degree, int coeff){

            // index will be degree 
			poly[degree] = coeff ; 
		
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){

		// printing all the polynomial 
		// not zero 
		// creating the loop 
		for (int i = 0; i < poly.length; i++) {
			
			// creating the condition
			if (poly[i] != 0) {
				// nw print all the 
				System.out.print(poly[i]+"x"+i+" ");
			}
		}
		
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		print();
		System.out.println();
		p.print();

		// now adding the new polynomial with the current polynomila 
		Polynomial newadd = new Polynomial() ; 

		// creating the loop for the poynomail p frist check the arrys lenght then add 
		if (p.poly.length < this.poly.length) {
			
			// now going to start with this loop 
			for (int i = 0; i < p.poly.length; i++) {
				int num = p.poly[i]+this.poly[i];
				newadd.setCoefficient(i, num);
			}

			// after the adding this remaining adding the polynomial 
           for (int i = p.poly.length; i < poly.length; i++) {
			   newadd.setCoefficient(i, p.poly[i]+this.poly[i]);
		   }

		   newadd.print();
          

		}else{
			if (p.poly.length > this.poly.length) {
			
			// now going to start with this loop 
			for (int i = 0; i < poly.length; i++) {
				newadd.setCoefficient(i, p.poly[i]+this.poly[i]);
			}

			// after the adding this remaining adding the polynomial 
           for (int i = poly.length; i < p.poly.length; i++) {
			   newadd.setCoefficient(i, p.poly[i]+this.poly[i]);
		   }

		}
		newadd.print();

		
	}
	return newadd ; 
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
				Polynomial newadd = new Polynomial() ; 
				return newadd ; 
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
			Polynomial newadd = new Polynomial() ; 
			return newadd ; 
	}

}

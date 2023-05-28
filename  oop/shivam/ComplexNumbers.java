package shivam;

public class ComplexNumbers {

	private int real  ; 
	private int imganeary ; 
	// now creautn the constructer '
	public ComplexNumbers( int real , int imaginary1){

this.real = real ; 
this.imganeary =  imaginary1 ; 


	}

	// creating the pluse fuction for the 
	// creating the ptint number 
	public void print(){

		System.out.println(this.real+" + i"+this.imganeary);
	}

	// creaint the function passing one object in the parameter
	public void plus(ComplexNumbers s1){
		this.real = this.real + s1.real ;
		this.imganeary = this.imganeary + s1.imganeary ; 
	}
	// creating the muplipy function pass the object in the function 
	public void multiply(ComplexNumbers s1){
		int temp  ; 
		int temp2 ; 
     temp  = (this.real * s1.real )-(this.imganeary * s1.imganeary);
	 temp2  = (this.real * s1.imganeary)+(this.imganeary * s1.real);
	 this.real = temp ; 
	 this.imganeary = temp2 ; 

	}
	
}

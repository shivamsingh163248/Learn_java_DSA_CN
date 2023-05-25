package shivam;

public class calculator_oject {

	// creating the object the which the insalized the access modifier 
	// creating the variable of the integer data type 
	private int value1 ; 
	private int value2 ;
	private int result  ; 
	// creating the constructor of the this class according to object behavior 
	public calculator_oject(int value1, int value2) {
		 // super();
		this.value1 = value1;
		this.value2 = value2;
	} 
	
	//  now creating the add function and storing in the new number hear is the  return in the third variable

 public  void  add() {
	this.result = this.value1+this.value2;
	
 }
 // adding the printing function for the 
 public void print() {
	 System.out.println(this.result);
 }
 
 // creating the object add 
 public void addobject( calculator_oject s1) {
	 // creating the add two object for the 
	 this.result = this.result + s1.result  ; 
	 
 }
	
	

	
}

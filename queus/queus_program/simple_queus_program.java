package queus_program;

import shivam.dynamic_array;

public class simple_queus_program {
	
	// creating the main fucntion for the writing the code of the ques 
	
	// now we are the creating the some data member 
	private int front ; 
	private int rear ;
	private int[]data ; 
	private int size ; 
	
	
	// now creating the default constocter 
	
	
	public simple_queus_program() {
		// TODO Auto-generated constructor stub
		// set the some basic value 
		this.front = -1 ; 
		this.rear = -1 ; 
		// creating the new array of the size 5 ; 
		data = new int [5] ; 
		
	}
	
	// now  creating the constocter with the parameter 
	
	public  simple_queus_program (int capacity ) {
		
		// size use as the dynamically 
		data = new int [capacity];
		// creating the set the value of the front and rear\
		this.front = -1 ; 
		this.rear = -1 ; 
	}
	
		
		
		
		
	
}

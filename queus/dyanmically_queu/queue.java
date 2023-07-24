package dyanmically_queu;

public class queue {
	
	// fist we are the creating the member 
	// it should  be the private access modifier 
	private int[]data ; 
	private int rear ; 
	private int front ; 
	private int size ; 
	
	
	// now creating the parameter with 
	public queue() {
		// TODO Auto-generated constructor stub
	// set the value 
		data = new int[5];
		rear  = -1; 
		front = -1 ; 
		
		
	}
	public queue(int capacity ) {
		// TODO Auto-generated constructor stub
		data = new int [capacity] ; 
		rear = -1 ; 
		front = -1 ; 
	}
	
	// now creating the function of the size 
	public int size () {
		return size  ; 
	}
	
	public boolean Empty () {
		return size == 0 ; 
	}
	
	// creating the function of the inque 
	

}

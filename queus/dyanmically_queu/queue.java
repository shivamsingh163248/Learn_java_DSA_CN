package dyanmically_queu;

import java.util.Iterator;

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
	public void inque(int ele) {
		
		// fist we are the write the codition for full queu 
		
		if (data.length == size) {
			
			// creating the double function 
			doublesize();
		}
		
		// creating the condition for the frist element '
	if (size == 0 ) {
		front = 0 ; 
	}
	
	
	// creating the condition for the cirulary 
	
	
	
	
	// now excution will noramal 
	rear++ ;
	
	if (rear == data.length) {
		rear = 0 ; 
		
	}
	data[rear] = ele ; 
	size++ ; 
		
		
	}
	private void doublesize() {
		// TODO Auto-generated method stub
		
		// copy the address of the privous array 
		int[]temp  = data ; 
		
		// creating the new value int the data 
		data = new int [data.length*2];
		
		// now we are the copy element front to end of the length of the array 
		
		// creating the varaible for the find the value fill in the array 
		int value = 0 ; 
		
		for (int i = front; i < temp.length; i++) {
			 data[value++] = temp[i] ; 
			 // value ++ given the flaxibilty to store the value 
			 
		}
		
		// again we are the copy the value form the starting index 
		for (int i = 0; i < front ; i++) {
			data[value++] = temp[i] ; 
		}
		
		
		// now the front and real are the changed 
		front = 0 ; 
		rear = temp.length -1 ; 
		
		// now after the calling the incrising the value 
		
		
	}
	
	// creating the function of the front for the return the value of the front 
	
	public int front () throws NullSQueuException {
		if (size == 0 ) {
			// then now throw the exception
			throw new NullSQueuException();
		}
		
		// now the return the value of the front 
		
		return data[front] ; 
		
		
		
		
		
	}
	
	// now creating the function of the deque 
	
	public int deque() throws NullSQueuException {
		
		
		// fist creating the exception if the size is the zero 
		
		if (size == 0 ) {
			
			// now throw the exception 
			throw new  NullSQueuException() ; 
		}
		
		// creating the temp variable 
		int temp = data[front] ; 
		// now decreasing the front 
		
		// if the front is in the starting 
		front ++ ;
		if (front == data.length) {
			front = 0 ; 
		}
		
		
		// decrasing the size 
		size -- ; 
		// now one is the basic condition is that 
		if (size == 0 ) {
			front = -1 ; 
			rear = -1 ; 
		}
		
		
		
		
		
		// now return the function of the temp deta 
		return temp ; 
		
	}
	

}

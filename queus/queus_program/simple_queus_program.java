package queus_program;

import shivam.dynamic_array;
import stack.stackFullException;

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
		data = new int [10] ; 
		
	}
	
	// now  creating the constocter with the parameter 
	
	public  simple_queus_program (int capacity ) {
		
		// size use as the dynamically 
		data = new int [capacity];
		// creating the set the value of the front and rear\
		this.front = -1 ; 
		this.rear = -1 ; 
	}
	
	// creating the function of the size 
	
	public int size() {
		return size ;   
	}
	
	
	// now creating the function isempty
	public boolean isEmpty() {
		return size == 0 ; 
	}
	// now creatig the function of the inques 
	
	public void inque(int ele) throws stackFullException {
		
		// creating the one more condation of the cxceptiomn 
		if (data.length == size) {
			throw new stackFullException();
		}
		
		// fist the write the condation 
		if (size == 0) {
			// now increment the font 
			// push a element in array 
			
			// now increament the size the 
			front = 0; 
			
		} 
			
			
			
			
			
			rear++;
			if (rear == data.length) {
				rear = 0 ; 
			}
			data[rear] = ele ; 
			size++ ;
			
		
		
	
		
		
	}
	// now creating the front function 
	public int font () throws Empety_queu {
		
		// return the lement at the front 
		if (size == 0 ) {
			throw new Empety_queu();
		}
		
		
		
		return data[front];
		
		
	}
	
	// now creating the deque funtion that is the return intger 
	public int deque() throws Empety_queu {
		
		// if any one what to delement element the use the deque 
		// creating the exception handaling 
		
		if (size == 0 ) {
			throw new Empety_queu();
		}
		
		// taking the temp element 
		int value = data[front];
		// now increment the front 
		front++ ; 
		if (front == data.length) {
			front = 0 ; 
		}
		
		
		size-- ; 
		
		if (size == 0 ) {
			front = -1 ; 
			rear = -1 ;
		}
		
		return value ; 
		
	}
	
		
		
		
	
}

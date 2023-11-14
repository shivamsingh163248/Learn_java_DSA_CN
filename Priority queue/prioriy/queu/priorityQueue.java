package prioriy.queu;

import java.util.ArrayList;

public class priorityQueue <T> {
	
  //CREATING THE array list 
	ArrayList<Element<T>>heap ; 
	
	// creating the constrocter
	
	public priorityQueue() {
	
		heap = new ArrayList<>() ; 
	}
	
	// creatingthe function insurt , get min remove min , and size , isempty 
	
	// fist creating the function of the insert 
	public void insert(T value ,int priority ) {
		
		
	}
	// creating the get min function
	public T getmin() {
		// 
	}
	
	public T removemin() {
		
	}
	
	// creating the function is empty
	public boolean isEmpty() {
		
		// when the size of the arrylist is the zero then ismepty 
		if (heap.size()>0) {
			return false ; 
		}else {
			return true ; 
		}
		
	}
	
	// creating the function of the size 
	public int size() {
		// return the size of the array list 
		return heap.size();
	}
	
}

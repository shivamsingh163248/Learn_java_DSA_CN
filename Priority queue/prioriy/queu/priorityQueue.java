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
		Element<T>e = new Element<>(value, priority);
		// now adding the object in add 
		heap.add(e) ; 
		
		// now creating the condition according the priorty 
		int childIndex =  heap.size()-1 ; 
		int parentindex = (childIndex-1)/2 ; 
		
		
		// now switching the child and prenet node according to the priority 
		
		Element<T>temp = heap.get(childIndex);  // HEAR THE GATE OBJECT  
		// NOW CHILD emelemt in the parent node 
		heap.set(childIndex, heap.get(parentindex));
		// now at the parent index set the value  of the child value 
		heap.set(parentindex, temp) ; 
		
		// now changing the index 
		
		
	}
	// creating the get min function
	public T getmin() throws NoAanyElemrntInList {
		// it means the fist element of the array list are the requerd if the array list is the null 
		// then creating the exception 
		if (isEmpty()) {
			throw new NoAanyElemrntInList() ; 
		}
		
		return heap.get(0).value;
	}
	
	public T removemin() {
		
		// creating the obejct of the element 
		
	 
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

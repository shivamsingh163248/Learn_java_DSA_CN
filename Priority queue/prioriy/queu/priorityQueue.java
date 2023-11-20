package prioriy.queu;

import java.text.BreakIterator;
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
		while (childIndex > 0 ) {
			
		
		
		if ( heap.get(childIndex).prioriy < heap.get(parentindex).prioriy ) {
			
		
		
		Element<T>temp = heap.get(childIndex);  // HEAR THE GATE OBJECT  
		// NOW CHILD emelemt in the parent node 
		heap.set(childIndex, heap.get(parentindex));
		// now at the parent index set the value  of the child value 
		heap.set(parentindex, temp) ; 
		
		// now changing the index z
		childIndex = parentindex ; 
		parentindex = (childIndex-1)/2 ; 
		
		
		}else {
			return ; 
		}
		}
		
		
		
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
	
	public T removemin() throws NoAanyElemrntInList {
		
		// return type is the value of the min 
		// this is the remove function in which we are the removing the fist index of the array list
		 if (heap.isEmpty()) {
			// now return the exception 
			 throw new NoAanyElemrntInList() ; 
		}
		
		 // is this is the not the empty then remove the frist element value 
		 Element<T> temp = heap.get(0) ; 
		 // now removing the value 
		 T ans = temp.value ; 
		 // now set the value of the last index of the value at the zero index 
		 heap.set(0, heap.get(heap.size()-1)) ; 
		 
		 // after the update last element of the heap 
		 // now removeing the last object of the heap that are store in the form of the object 
		 heap.remove(heap.size()-1) ; 
		 int parentindex = 0 ; 
		 int leftchildIndex = 2*parentindex+1 ; 
	     int RightchildIndex = 2*parentindex+1 ; 
	     
	     
	     // creating the loop 
	     
	   while (leftchildIndex < heap.size()) {
		
	
	     
	     
	     int minindex = parentindex ; 
	     // creating the condition in three node which one is the mean 
	     if (heap.get(leftchildIndex).prioriy < heap.get(RightchildIndex).prioriy) {
			// in this condtion the more priority of the left side then the min is left
	    	 minindex = leftchildIndex ; 
		}
	     // mow creating the find the minmun 
	     if (heap.get(leftchildIndex).prioriy > heap.get(RightchildIndex).prioriy) {
			minindex = RightchildIndex ; 
		}
	     
	     if (minindex == parentindex) {
			break ; 
		}
	     
	     // sow shifting the element 
	     Element<T>temps = heap.get(minindex) ; 
	     // now set the value 
	     heap.set(minindex, heap.get(parentindex));
	     // now changing the parent index 
	     heap.set(parentindex, temps) ; 
	     
	     // now changing the index of the left child and the right child 
	     leftchildIndex = 2*parentindex +1 ; 
	     RightchildIndex  = 2*parentindex+2 ; 
	   }
	   
	   
	   return ans ; 
	 
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

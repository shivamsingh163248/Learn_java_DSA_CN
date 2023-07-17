package stack_using_linklist;

public class usingLinklist <T> {
	// now creating  the linklist function 
	 private node<T> head ; 
	 // taking the different variable for the size  
	 private int size ; 
	 
	 
	 // now we are the creating the constrocter 
	  public usingLinklist () {
		  // become head is null 
		  head = null ; 
		  size =  0 ; 
	  }
	  
	  // now creating the some function for the writing the code 
	  public int size() {// 
		//  now hear we are the return the the size of the link list 
		  return size ; 
		  
	  }
	  // now creagit ting the different function 
	  public boolean isEmpty() {
		  // if the size is the 0 then we know that is the stack is the empty 
		  return size == 0 ; 
		  
	  }
	 // now creating the different function 
	  
	  public void push (T ele) {
		  
		  // this is the masure commned of the for the pushing the element 
		  // FRIST WE ARE THE CREATING THE NODE 
		  node<T>newnode = new node<T>(ele);
		  newnode.next  = head ; // we are the adding the element above the linklist 
		  head = newnode ; 
		  // now increasing the size 
		  size++ ; 
		  
		  
	  }
// now creating the different function 
	  public T top () throws nullPointer {
		  
		  // frist we are the creating the exception if the  link list is the null 
		  if (size == 0 ) {
			  
			  throw new nullPointer() ; 
			
		}
		  // now the return the top of the data 
		  return head.data ; 
		  
	  }
	  
	  // now creating the another function pop 
	  public T pop () throws nullPointer {
		  
		  // if the soze is the null then creating the exception 
		  if (size == 0 ) {
			// creating the exception of the user diplay 
			  throw new nullPointer();
		}
		  
		  // now creating the storeing in the temp 
		  T temp = head.data ; 
		  
		  // now decreating the head 
		  head = head.next ; 
		  size-- ; 
		  return temp ; 
		  
	  }
}

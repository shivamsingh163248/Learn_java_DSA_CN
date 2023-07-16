package stack;

public class stackUsingArray {
	
	// now creating the varaibalve of the array 
	 int[]data ;
	  // creating the top index 
	  private int topIndex ; 
	  
	 
	 // creatung the function for the creting the array 
	 // now creating the constocter 
	  public stackUsingArray() {
		// TODO Auto-generated constructor stub
		  data = new int[10] ;
// at noraml position 
		  topIndex = -1 ; 
	}
	  
	  // now again creating the n
	  public stackUsingArray(int size) {
			// TODO Auto-generated constructor stub
			  data = new int[size] ;
	// at noraml position 
			  topIndex = -1 ; 
		}
	 
	  // creating the finction of the empaty 
	  public boolean isEmptey() {
//		  if (topIndex == -1) {
//			return true ; 
//		}else {
//			return false ; 
//		}
		  
		  // creating the simple return 
		  return topIndex == -1 ; 
	  }
	  
	  // now creating agian new function 
	  public int size() {
		  return topIndex+1 ; 
	  }
	  
	  // now creating the push function 
	  public void push (int ele) throws stackFullException {
		   //now creating the condation if the statck is the full then we are the throw the exceptiom 
		  // when the array lenght equall is the top od the endex 
		  if (data.length-1 == topIndex) {
			// now creating the exception class 
			  // you can relasing the two type of the exception 
			  // creating the object 
//			  stackFullException e = new stackFullException();
//			  throw e ; 
			  
			  throw new stackFullException() ; 
		}
		  
		  
		  topIndex++ ; 
		  data[topIndex] = ele ; 
	  }
	  
	  // now we are the creating the top function 
	  public int top() throws stackEmpty {
		  
		  // if the stack is the empety then through the exception 
		  if (topIndex == -1) {
			throw new stackEmpty() ; 
		}
		  
		  
		  // in siple we are the return the top index 
		  return data[topIndex] ; 
	  }
	  
	  // now creating the pop function 
	  public int pop () throws stackEmpty {
		  
		  
		  // frist creating the exception if the array is the empty 
		  if (topIndex == -1) {
				throw new stackEmpty() ; 
			}
		  
		  // fist value store temp variable of the top of the stack then decrease the top index 
		  
		  int temp = data[topIndex] ; 
		  topIndex-- ; 
		  return temp ; 
		  
	  }
	  
	  

}

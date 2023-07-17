package stack;

import java.util.Iterator;

public class learnstack {

	public static void main(String[] args) throws stackFullException, stackEmpty {
		// TODO Auto-generated method stub
		
		stackUsingArray stack = new stackUsingArray();
		

stack.push(10);
System.out.println(stack.isEmptey());
System.out.println(stack.top());

// now gain we are the creating the new object for the new wxperiment
stackUsingArray shivam = new stackUsingArray();

// creating the array 
int[]arr  = {2,5,8,3,6,9,5} ; 

// now pushing the emelemnt 

for (int i = 0; i < arr.length; i++) {
	shivam.push(arr[i]);
}

// now using the function for the pop array 
   while  (!shivam.isEmptey()) {
	System.out.println(shivam.pop());
}
   
   // if iwant nthe size become bigger 
   
   
   // if want the increaing the size of th=e 


}
}

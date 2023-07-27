package queueUsingStack;

public class test2stackUsingQueu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// no creating the object for the access the element 
		queueUsingStack<Integer>shivam = new queueUsingStack<Integer>();
		
		// creating the add element in the stack 
		shivam.inque(34);
		shivam.inque(45);
		shivam.inque(67);
		
		// check the printing of the dequeu element 
		
		System.out.println(shivam.dique());
		
		
		
	}

}

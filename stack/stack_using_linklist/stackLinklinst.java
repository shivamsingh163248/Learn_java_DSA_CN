package stack_using_linklist;

public class stackLinklinst {

	public static void main(String[] args) throws nullPointer {
		// TODO Auto-generated method stub
//		int shi  = 10 ; 
//		System.out.println(shi++);
//	// 	System.out.println(shi);
//		System.out.println(++shi);
//		
		
		// now creating the object 
	// 	stackLinklinst shivam = new stackLinklinst();
		usingLinklist<Integer>shivam = new usingLinklist<>() ; 
		// now creating the array 
		int[]arr = {2,3,4,5,7,9,2} ; 
		
		// now push the element using the for loop 
		for (int i = 0; i < arr.length; i++) {
		shivam.push(arr[i]);
		}
		
		// now printing the size of the stack 
		System.out.println(shivam.size()+" size");
		//
		
		// now again printing the every element pop and size 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(shivam.pop());
		}
		
		// again now creating the size of the linklist ;
		System.out.println(shivam.size()+" size");

	}

}

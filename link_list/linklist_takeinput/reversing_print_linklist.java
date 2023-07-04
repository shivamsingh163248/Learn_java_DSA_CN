package linklist_takeinput;

public class reversing_print_linklist {
	
	// creating the function of the printing the link list 
	public static void reversLinklist(node<Integer>root) {
		// frist eriting the bae function 
		if (root == null) {
			return ; 
		}
		// now calling the function 
		reversLinklist(root.next);
		System.out.println(root.date);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}

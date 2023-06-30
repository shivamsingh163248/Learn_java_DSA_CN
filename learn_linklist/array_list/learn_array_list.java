package array_list;

import java.util.ArrayList;

public class learn_array_list {
	
	// creating the array list 
	public static void main(String[] args) {
		
		// creaint the arry list in the main function  for solved this 
		ArrayList<Integer> arrs = new ArrayList<>() ; 
		arrs.add(20);
		// now check the status of size og the arrylist
		// set the number of at index   ; 
		arrs.add(0, 34);
		
		// using the set value withoud increasing the size onlely replace
		// set functiomn 
		arrs.set(0, 35);
		// now creating the arry od the size of remove 
		arrs.add(43) ; 
		arrs.add(35);
		arrs.remove(0);
		System.out.println(arrs.size());
		System.out.println(arrs.get(0));
		
		// creating the second array of the size 
		ArrayList<String> shivams = new ArrayList<>() ; 
		// crating the new arry 
		shivams.add("shivam singh "); 
		shivams.add("itisha singh ") ; 
		shivams.add("lovely singh ") ; 
		shivams.add("tripti singh") ;
		
		// using the for loop 
		for (int i = 0; i < shivams.size(); i++) {
			System.out.println(shivams.get(i));
		}
		
		// mow i check 
		shivams.set(0, "shani singh");
		System.out.println();
		for (int i = 0; i < shivams.size(); i++) {
			System.out.println(shivams.get(i));
		}
		
		
		
		
	}

}

package RemoveDuolicateUsingHasmap;

import java.util.ArrayList;

public class MainClassFunction {
	
	public static void main(String[] args) {
		
	
	// creating the object 
	
	usehasmapFnction func = new usehasmapFnction() ; 
	int[]arr = func.takingarry(); 
	ArrayList<Integer>removeDuplicate = func.checkingDublicUsingHasmap(arr) ; 
	
	// now printing the arrylist using the for each loop 
	
	for (int i = 0; i < removeDuplicate.size(); i++) {
		System.out.println(removeDuplicate.get(i));
		
	}
	
	}

}

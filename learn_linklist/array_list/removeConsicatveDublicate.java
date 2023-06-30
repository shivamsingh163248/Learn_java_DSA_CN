package array_list;

import java.util.ArrayList;

public class removeConsicatveDublicate {
	
	// creating the arrylist method for the solving the problem
	public static ArrayList<Integer> removeDublicate(int[]arr){
		// creating the arry list 
		ArrayList<Integer>result = new ArrayList<>() ; 
		// creatin the add function add value at index 0 
		result.add(arr[0]) ;
		// now check the now and privous one 
		// creating the for loop for the solving thr problem 
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i-1]) {
				// now creating the add function 
				result.add(arr[i]);
			}
			
		}
		// now  returning the result function 
		return result ;  
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the arry 
		int[]arr = {22,20,20,20,10,10,34,56,56,40} ; 
		
		// calling the functuin 
		ArrayList<Integer>shivam = removeDublicate(arr) ; 
		// now print the arry linst function 
		for (int i = 0; i < shivam.size(); i++) {
			 
			System.out.print(shivam.get(i)+" ");
		}

	}

}

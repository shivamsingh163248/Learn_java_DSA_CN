package array2d;

import java.util.ArrayList;
import java.util.List;

public class greatestNumberRowColum {

	// creating the static function 
	public static List<Integer> column(int arr[][]) {
		
		// creating the list 
		List<Integer>value = new ArrayList<>() ; 
		// creating the loop for the itating the value
		int sum = 0 ; 
		int colums = 0 ; 
		for (int i = 0; i < arr[0].length; i++) {
			
			int temp = 0 ; 
		     for (int j = 0; j < arr.length; j++) {
				
		    	 //sum the value 
		    	 temp += arr[i][j] ; 
		    	 // creating the condition is hear 
		    	 
			}	
		     if (sum < temp) {
					sum = temp ; 
					colums = i ; 
				}
		}
		
		value.add(sum) ; 
		value.add(colums) ; 
		
		
		return value ; 
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

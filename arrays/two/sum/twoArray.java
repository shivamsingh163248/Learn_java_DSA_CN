package two.sum;

import java.util.ArrayList;
import java.util.Scanner;



public class twoArray {

	// creating the method of the sum of the arrays 
    public int[] twoSum(int[] nums, int target) {
        
    	// creating the array of the two length 
    	int[]arr = new int[2] ; 
    	
    	// creating the loop 
    	for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				
				if (nums[i]+nums[j] == target) {
					arr[0] = i ; 
					arr[1] = j ;
				}
			}
		}
    	return arr ; 
         
    }


// creating the for the taking the input 
    public int[] takeinput() {
    	System.out.println("enter the size");
    	Scanner input = new Scanner(System.in) ; 
    	int n = input.nextInt();
    	
    	int[]arr = new int[n]  ; 
    	
    	// creating the for loop for the taking the input 
    	for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
    	return arr ; 
    }


}

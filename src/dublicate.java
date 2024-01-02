import java.util.Iterator;

public class dublicate {
	
public static int removeDuplicates(int[] nums) {
        
        int privious = Integer.MIN_VALUE ; 
        
        // creating the loop of the array 
        int[]arr = new int[nums.length];
        
        int count = 0 ; 
        for (int i = 0; i < nums.length; i++) {
			
        	// creating the condition 
        	if (nums[i] > privious) {
        		arr[count] = nums[i] ; 
				count++ ; 
				privious = nums[i];
				
			}
        	
        	
        	
		}
        
         System.out.println(nums); 
         nums = arr ; 
         System.out.println(nums);
         
         for (int i = 0; i < arr.length; i++) {
 			 nums[i] = arr[i];
 			 System.out.println(arr[i]);
 		}
        
        return count ; 
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr = {0,0,0,1,1,1,2,2,3,3,3,4,4,5,5,5,5} ; 
		int res = removeDuplicates(arr) ; 
		System.out.println(res);
		for (int i : arr) {
			System.out.println(i);
		}
		
		

	}

}

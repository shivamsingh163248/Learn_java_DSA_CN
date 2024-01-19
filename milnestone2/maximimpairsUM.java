
public class maximimpairsUM {
	
	
public static int maxProductDifference(int[] nums) {
        
        // finding the two mimum number and two maximum number fir the maximum difference 

        int minpair = Integer.MAX_VALUE ; 
        int maxpair = Integer.MIN_VALUE ; 
        
        // now creating the loop 
        for (int i = 0; i < nums.length; i++) {
        	for (int j = i+1; j < nums.length; j++) {
				
        		int max = nums[i]*nums[j] ; 
        		int min = nums[i]*nums[j] ;
        		
        		// now creating the condtion 
        		if (minpair > min) {
					minpair = min ; 
				}
        		if (maxpair < max) {
					maxpair = max ; 
				}
        		
			}
			
		}
        return maxpair-minpair ; 
      
        
        
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

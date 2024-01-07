
public class maximimpairsUM {
	
	
public static int maxProductDifference(int[] nums) {
        
        // finding the two mimum number and two maximum number fir the maximum difference 

        int min = Integer.MIN_VALUE ; 
        int smallmin =  Integer.MIN_VALUE ; 
        int max = Integer.MIN_VALUE ; 
        int smallmax = Integer.MIN_VALUE ; 
        
        // now creating the for loop 
        
        int j = 0  ; 
        for (int i = 0; i < nums.length; i++) {
			
        	if ( smallmin ==  Integer.MIN_VALUE || smallmax == Integer.MIN_VALUE  ) {
				// now set all the value 
        		smallmin = nums[i] ; 
        		smallmax = nums[i] ; 
			}
        	
        	// now set the value 
        	if (nums[i] < min) {
				min = nums[i] ; 
			}
        	if (nums[i] > max) {
				max = nums[i] ; 
			}
        	if (smallmax != Integer.MIN_VALUE && smallmin > nums[i] && smallmin < min) {
				smallmin = nums[i] ; 
			}
        	if (smallmax < nums[i] && smallmax < max) {
				smallmax = nums[i] ; 
			}
        	
		}
        
        int diff =  (max*smallmax) - (min*smallmin) ; 
        return diff ; 
        
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


public class swep_alternet {

	public static void main(String[] args) {
		
		int[]arr = {2,3,4,5};
		
            // arr[arr.length -1] = arr[0];
		int j = arr[0];
        
		
		// TODO Auto-generated method stub
	     for (int i = 0; i < arr.length; i++) {
	            if(i+1 <arr.length ){
	            arr[i] = arr[i+1];
	        }else {
	        	
		            arr[arr.length -1] = j;
		        
	        }                                               
	            
	        
	        }
	     
	     for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

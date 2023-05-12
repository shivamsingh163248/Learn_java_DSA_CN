
public class shorting {
	
	  public static void sort012(int[] arr){
	    	//Your code goes here
	        // simple using the shoeting algorithum 
	        for (int i = 0; i < arr.length; i++) {

	            for (int j = i; j < arr.length; j++) {
	                if (arr[i]>arr[j]) {
	                    // now preform the sewping 
	                    int temp = arr[j];
	                    arr[j] = arr[i];
	                    arr[i]=temp;
	                }
	            }
	        }
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

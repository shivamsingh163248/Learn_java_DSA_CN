
public class check_array_rotation {
	  public static int arrayRotateCheck(int[] arr){
		  int j = 0;
				for (int i = 0; i < arr.length-1; i++) {
		      if (arr[i]>arr[i+1]) {
		        j = i;
		        j = j+1 ;
		        break;
		      }
		    }
		 return j;
		        
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    
	}

}

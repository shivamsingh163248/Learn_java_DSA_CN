
public class unique_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = new int[5];
	    int h = 0;
	    for (int i = 0; i < arr.length; i++) {
	      
	      int k = 0;
	for (int j = 0; j < arr.length; j++) {
	  if (arr[i]== arr[j]) {
	    k++ ;
	  }

	  }
	    if (k==1) {
	    h = arr[i];
	    System.out.print(h);
	}

	    }

	

	}

}

package arraysubset;

public class subset {
	
	
	
	
	public static  void subset(int[]input , int begain) {
		if (begain == input.length) {
			return  ; 
		}
		
		subset(input, begain+1);
		subset(input, begain+1);
    
		for (int i= 0; i < begain; i++) {
			System.out.print(input[i]+" ");
		} 
		System.out.println();
		
		
	}

	public static void main(String[] args) {
	
		
		int[]arr = {2,4,5,6,7,8,7} ; 
		subset(arr, 0);

	}

}

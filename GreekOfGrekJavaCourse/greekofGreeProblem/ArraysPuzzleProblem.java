package greekofGreeProblem;

public class ArraysPuzzleProblem {
	
	// creating the function 
	// first writing case
	public static int[] puzzle(int[]arr) {
		
		int[]result = new int[arr.length];
				
				// creating the time complexity O^2
	 for (int i = 0; i < result.length; i++) {
		 int sum = 1 ; 
		
		 for (int j = 0; j < result.length; j++) {
			
			 if(i!=j) {
				 
				 // now adding all the sum 
				 sum *= arr[j] ; 
			 }
		}
		 result[i] = sum ; 
	}
		return result ; 
		
	}

	// now writing the otmized code 
	
	public static int[] puzzel(int[]arr) {
		
		// creating the new arrays 
		int[]reult = new int[arr.length] ; 
		
		// creating the all the sum 
		// creating the loop 
		int product =1 ; 
		
	
		
		// creating the double loop 
		for (int i = 0; i < reult.length; i++) {
			product *= arr[i] ; 
		}
		
		try {
			
			for (int j = 0; j < reult.length; j++) {
				
				// creatng the try and catch 
		
			    reult[j] = product / arr[j] ; 
			}
			
			
		} catch (Exception e) {
			
		}
		

		return reult ; 
		
		// this found the error 
		
	}
	
	// creating the another approch 
	public static int[] puzzele(int[]arr) {
		
		// creating tha arrays 
		int[]res = new int[arr.length] ; 
		
		// creating the while loop 
		
		int skip = 0 ;
		int j = 0 ; 
		int product = 1 ; 
		while (skip<arr.length) {
			
			// creating the conditon of the multiplication 
			if(j!=skip) {
				product *= arr[j] ; 
				System.out.print(j+" ");
			}
			// creating the conditon 
		     
			if(j == arr.length -1) {
				// and the add the sum 
				System.out.println();
				res[skip] = product ; 
				System.out.println(product+" "+skip);
				product = 1 ; 
				j = 0  ; 
				skip++ ; 
				continue ; 
			}
			j++ ; 
		}
		return res ; 
		
	}
	
	
	// this method will pased 
	//update the algo 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rr[] = {10, 3, 5, 6, 2} ; 
		puzzele(rr) ; 

	}

}

package two.sum;

public class TwoSumMainFuncion {
	
	private static  int lengthArray(int[]arr) {
		
		// now creating the loop 
		int n = 0; 
		try {
			while (arr[n] != -1) {
				n++ ; 
			}
			return n ;
		} catch ( Exception e) {
			// TODO: handle exception
			 return n ; 
		}
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // now inisalization the obejct 
		twoArray sum = new twoArray() ; 
		int[]arr = sum.takeinput() ;
		int[]output = sum.twoSum(arr, 10) ; 
		// now printing the array 
		System.out.println(output[0]+" "+output[1]);
		
		
		// now creating the new array 
		int[]shi = {0,0,0,0,0} ; 
		System.out.println(lengthArray(shi));
		
		
		
	}

}

package two.sum;

public class TwoSumMainFuncion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // now inisalization the obejct 
		twoArray sum = new twoArray() ; 
		int[]arr = sum.takeinput() ;
		int[]output = sum.twoSum(arr, 10) ; 
		// now printing the array 
		System.out.println(output[0]+" "+output[1]);
		
		
		
	}

}

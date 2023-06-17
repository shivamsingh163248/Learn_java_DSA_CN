package learnspacecomplexicity;

public class MAX_PROFIT {
	
	// NOW CREATING THE FUNCTION OF THE MAXPROFIT 
	private int[]arr ; 
	
	// now creating the constructor with the parameter 
	MAX_PROFIT(){
		System.out.println("this is the constrocter");
	}
	
	// creating the getter and setter for the set value using the number 
	
	
	
public static void maxProfit(int[]arr) {
	  
}
	public int[] getArr() {
	return arr;
}

public void setArr(int[] arr) {
	this.arr = arr;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MAX_PROFIT shivam = new MAX_PROFIT() ; 
		System.out.println(shivam.arr); 
		int[]arr = {5,6,5} ; 
		// call the function for the setting the value 
		shivam.setArr(arr);
		System.out.println(shivam.arr); 
		// checking the printing of the array 
		for (int i = 0; i < shivam.arr.length; i++) {
			int j = shivam.arr[i];
			System.out.println(j);
			
		}
		
		
		

	}

}

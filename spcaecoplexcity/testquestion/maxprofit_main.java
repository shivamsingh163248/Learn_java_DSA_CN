package testquestion;

public class maxprofit_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calling the function 
		// fist i creating the constructor then 
		maxprofit shivam  = new maxprofit("shivam singh ");
	// now test the calling the static function 
		shivam.maxprofitt(); // successfully call the maxprofit function 
	shivam.setSaller_name("shivam");
	// creating the printing function for that object 
	shivam.printseller_name();
	// creating the array 
	int[]arr = {23 ,45 ,34, 65} ; 
//	shivam.printarray(arr);
	shivam.quickshort(arr, 0, arr.length-1);
	System.out.println();
	// shivam.printarray(a);
	shivam.setArr(arr);
	shivam.printarray();
	}

}

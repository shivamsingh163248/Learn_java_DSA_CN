package nequestion;

public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// now creating the object 
		resursion test = new resursion();
		// now creating the array 
		System.out.println("enter the number");
		int[]arr = test.taking_input();
		
		// now using arry printing the using the for each loop 
		for (int i : arr) {
			System.out.println(i);
		}
		

	}

}

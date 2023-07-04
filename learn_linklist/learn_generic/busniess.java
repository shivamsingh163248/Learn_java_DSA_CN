package learn_generic;



public class busniess {
	// creating the print function of the array 
	public static <iti extends student_inteface> void print(iti arr[]){
		// using the for loop for the 
		for (int i = 0; i < arr.length; i++) {
			arr[i].print();
			 System.out.println(arr[i]);   // using fior
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the class array 
		school[]arr = new school[5] ; 
		// now set the value 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new school(205569 ,"shivam" ) ; 
		}
		// now print the varialbe 
		print(arr);

		
		teacher[]arrt = new teacher[5] ; 
		// now set the value 
		for (int i = 0; i < arrt.length; i++) {
			arrt[i] = new teacher("satyendra kumar singh" ,23450+i ) ; 
		}
		// now print the varialbe 
		print(arrt);
	}

}

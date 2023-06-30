package learn_generic_method;

public class test_all_class {
	



	// now creating the printing  array  
	public static <itisha> void printtt(itisha arr[]) {
		// now using the for loop for the solving these question 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the new array 
		school<String, Integer>shivam = new  school<>("itisha" , null) ; 
		
		// calling the value of the set value git
shivam.setRoll_number(23);
shivam.setUser_namee("shivam");
System.out.println(shivam.getUser_namee() +" "+ shivam.getRoll_number());




school<Integer, Integer> itisha = new school<Integer, Integer>(20, 10) ;
System.out.println(itisha.getUser_namee() +" "+ itisha.getRoll_number());

// now calling the method of the 
// creaitng the 
// creating the new array 
Integer arr[] = new Integer[5] ; 
// now caliing the fubction of the arr

// now se the valuie 
for (int i = 0; i < arr.length; i++) {
	arr[i] = i ;
}

// now creating the string arr
 shivam.arry(arr);
// calling the function 
 printtt(arr);

 // now again creating the string type 
 
 String[]arrstring = new String[5];
 // now set the function 
 // creating the for loop 
 for (int i = 0; i < arrstring.length; i++) {
	arrstring[i] = "shivam" ; 
	
}
 // now calling the function 
 shivam.arry(arrstring);

 
 // now creating the array of the class 
parentdetail[]arrp = new parentdetail[5] ; 
// now creating the check for the printing 
for (int i = 0; i < arrp.length; i++) {

	parentdetail[i] = new parentdetail("satyendea kumar singh", "sarita singh", "shivam singh", 99841638) ; 
}


 printtt(parentdetail);









	}
// now again creating the constrocter 
 
     

	
}

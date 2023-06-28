package learn_generic_method;

public class test_all_class {

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
 

int[]arr = new int[6] ; 
shivam.arry(arr);




	}
// now again creating the constrocter 
 
     

	
}

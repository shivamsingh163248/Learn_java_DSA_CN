package shivam;

public class teststudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now make the new object of the student 
//		student newbatch = new student() ; 
//		// creating the new object successful 
//		newbatch.class_name = 12 ; 
//		newbatch.id = 20569 ; 
//		newbatch.father_name = "satendra kumar singh ";
//		newbatch.mother_name = "sarita singh " ; 
//		
		// after the set of the value  then return  the value 
		
		
		// set the value directly and form the function 
//		student newbatch = new student(40, "satyeindra", 50, "sarita" , "mobile");
//		
//		System.out.println(newbatch.class_name);
//		System.out.println(newbatch.id);
//		System.out.println(newbatch.father_name);
//		System.out.println(newbatch.mother_name);
		
	 // set the values of the of the parameter 
		student shivam  = new student() ; 
		shivam.setclassname(20);
		shivam.setfathername("satyendra kumar singh ");
		shivam.setmothername("sarita singh");
		shivam.setname("shivam singh ");
		
		
		shivam.allvlaues();
		
		
		student pri = new student() ; 
		// again the set the name of the all the object and the check the values of all the number 
		pri.setclassname(30);
		pri.setfathername("hready narayn singh ");
		pri.setmothername("munnny davi");
		pri.setname("satyendra kumar singh ");
		
		
		// all the values are the print \
		pri.allvlaues();

	}

}

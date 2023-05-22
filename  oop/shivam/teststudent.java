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
		student newbatch = new student(40, "satyeindra", 50, "sarita" , "mobile");
		
		System.out.println(newbatch.class_name);
		System.out.println(newbatch.id);
		System.out.println(newbatch.father_name);
		System.out.println(newbatch.mother_name);

	}

}

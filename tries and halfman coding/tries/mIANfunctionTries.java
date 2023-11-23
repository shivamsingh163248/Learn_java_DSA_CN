package tries;

public class mIANfunctionTries {

	public static void main(String[] args) {

		// creating the object tries function 
		triesImplimentFunction student = new triesImplimentFunction() ; 
		student.add("shivam");
		 student.add("shivamshi");
		System.out.println(student.search("shivamshi"));
		System.out.println(student.search("shivam"));
		// System.out.println();
		student.remove("shivamshi");
		System.out.println(student.search("shivamshi"));
		System.out.println(student.search("shivam"));

	}

}

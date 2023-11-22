package tries;

public class mIANfunctionTries {

	public static void main(String[] args) {

		// creating the object tries function 
		triesImplimentFunction student = new triesImplimentFunction() ; 
		student.add("shivam");
		 student.add("radhe");
		System.out.println(student.search("radhe"));
		student.remove("radhe");
		System.out.println(student.search("radhe"));

	}

}

package recursion.parmutation.string;

public class parmutainMainfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // now creating the object 
		prmutationString world = new prmutationString() ; 
		String[]output = world.parmutation("abcd") ; 
		
		// now printing the value for the checking 
		for (String i : output) {
			System.out.println(i);
		}
		
		// creating the string for the checking string length 
		String check = ""; 
		System.out.println(check.length());
		
	}
	
	

}

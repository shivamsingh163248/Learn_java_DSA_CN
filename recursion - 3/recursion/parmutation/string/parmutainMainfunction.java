package recursion.parmutation.string;

public class parmutainMainfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // now creating the object 
		prmutationString world = new prmutationString() ; 
		String[]output = world.parmutation("abc") ; 
		
		// now printing the value for the checking 
		for (String i : output) {
			System.out.println(i);
		}
		
	}

}

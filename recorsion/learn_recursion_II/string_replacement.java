package learn_recursion_II;

public class string_replacement {
	
	// now creating the function of  replace the charecter 
	public static String srtringreplacement(String name , char a , char b ) {
		// fist find the blank string  for the base value 
		if (name.length() == 0 ) {
			return name  ; 
		}
		
		// calling the function for the checking  the value and the find the value 
		System.out.println(name);
		String smallstring = srtringreplacement(name.substring(1), a, b) ; 
		// creating addition for the add old value and the new value '
		System.out.println(name);
	 if (name.charAt(0) == a ) {
		return b+smallstring ; 
		 
	}else {
		return name.charAt(0)+smallstring ; 
	}
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now calling the function for the checking the value for the returning 
		String result  = srtringreplacement("tematotosit", 't', 's');
		System.out.println(result);
		

	}

}

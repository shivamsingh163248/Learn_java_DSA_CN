package BasricDataTypeVariable;

public class OutPut {
	
	// Creating the function 
public static String revStr(String s) {
        
       String final_string = "" ; 
       
       // creating the loop for the revering the string 
       for (int i = 0; i < s.length() ; i++) {
    	   
    	   // using the substring method 
    	   char value = s.charAt(i) ; 
    	   // char changing to string 
    	   String string_value = String.valueOf(value) ; 
    	   
    	   final_string = value+string_value ; 
    	   
    	   
		
	}
       return final_string ; 
            
        }

// creating using the  
public static String reversingString(String s) {
	
	String revers = "" ; 
	
	// creating the loop 
	int count = 1 ; 
	for (int i = 0; i < s.length(); i++) {
		// using the substring method to find the string 
		String rev = s.substring(i ,count) ; 
		revers = rev+revers ; 
		count++ ; 
	}
	
	return revers ; 
}

// reversing the string using the stringBuilder Function 
public static String revString(String s) {
	// creating the string builder function 
	StringBuilder st = new StringBuilder() ; 
	// creating the for loop funciton '
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "sh" ;  ; 
		String b = " name" ; 
		
		
		System.out.println(a+b);
		char name = 'a' ; 
		char singh = 'b' ; 
	

	}

}

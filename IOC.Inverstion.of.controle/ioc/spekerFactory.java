package ioc;

public class spekerFactory {
	
	// crating the condition of of the method of the string the return the object 
	
	public Speaker getSpeakers(String stringtype) {
		
		// creating the base condition if the user is the given the invailde input the the return the value is the null 
		 if (stringtype == null) {
			return null ; 
			
		}
		if (stringtype.equalsIgnoreCase("sony")) {
			return new SonySpeakers() ; 
		}else if (stringtype.equalsIgnoreCase("bose")) {
			return new BossSpeacker() ; 
		}else {
			return null ; 
		}
		
	}

}

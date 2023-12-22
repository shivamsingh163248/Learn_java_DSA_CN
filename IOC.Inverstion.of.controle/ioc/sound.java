package ioc;

public class sound {
    
	
	//  creating the method of of the creating method 
	public void  makesound(String companyName) {
		
		// creating the object of the factory 
		 spekerFactory speakers = new spekerFactory();
		 Speaker  spek = speakers.getSpeakers(companyName);
		 System.out.println(spek.makesound());
		 
		
		
	}
	
	
}

package learn_generic_method;

public class school<itisha , shivam > {
	// now learn the generic method 

	
	// write the some private varaible 
	private itisha user_name ; 
	private shivam roll_number ; 
	
	// now creating the constorctur 
	public school() {
		// TODO Auto-generated constructor stub
	}
	// again now creating the constocter 
	public school(itisha user_name , shivam roll_number){
		this.roll_number = roll_number ; 
		this.user_name = user_name ; 
		
	}
	public itisha getUser_name() {
		return user_name;
	}
	public void setUser_name(itisha user_name) {
		this.user_name = user_name;
	}
	public shivam getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(shivam roll_number) {
		this.roll_number = roll_number;
	}
	
	// now creating the getter and setter method 
	
	// now creating method which 
	public <itisha_singh> void print (itisha_singh shivam_singh ) {
		System.out.println(shivam_singh);
	}
	// again creating the new function of the array of the return type 
	public <itisha_shivam> itisha_shivam[] arry(itisha_shivam shivam[]){
		
		// now creating the new array 
		// frist find the size of the array 
		for (int i = 0; i < shivam.length; i++) {
			// itisha_shivam itisha_shivam = shivam[i];
			System.out.println(shivam[i]);
			
		}
		
		
		return shivam  ; 
	}
	
}

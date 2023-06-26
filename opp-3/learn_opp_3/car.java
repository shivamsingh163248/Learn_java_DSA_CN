package learn_opp_3;



public class car {
	// take the some private integer 
	private  String car_name  ; 
	private  String type ; 
	// now creating the final method 
	
	public final void  name_shivam(String car_name) {
		System.out.println("this is the final name ");
		this.car_name = car_name ; 
	}
	// now agina the creating the constrocter 
	public car() {
		
	}
	// now again creating the constrocter with the parameter 
	public car(String car_name, String type) {
		super();
		this.car_name = car_name;
		this.type = type;
	}
	// using the getter and setter for the method for the set thevvalue 
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}

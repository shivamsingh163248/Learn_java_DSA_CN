package learn_generic;

public class pair_two_type <itisha , shivam >{
	
	private itisha shivam ; 
	private shivam itisha ; 
	
	// now creating the one default constructor 
	public pair_two_type() {
		// TODO Auto-generated constructor stub
	}

	public pair_two_type(itisha shivam, shivam itisha) {
		
		this.shivam = shivam;
		this.itisha = itisha;
	}

	public itisha getShivam() {
		return shivam;
	}

	public void setShivam(itisha shivam) {
		this.shivam = shivam;
	}

	public shivam getItisha() {
		return itisha;
	}

	public void setItisha(shivam itisha) {
		this.itisha = itisha;
	}
	
	
	// now again creating the getter and setter method 
	//
	// now gain creaing the print function for the printing the value 
	public void print() {
		System.out.println(getItisha() + " "+getShivam());
	}

}

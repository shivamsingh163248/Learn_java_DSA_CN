package learn_opp_3;

 public final class vehickal {
	// define the integer with the access modifier 
	private String fule_type ; 
	private String wheller ; 
	private String company_name ; 
	private int no_doors ; 
	private String owner_name ;
	
	
	public   vehickal(String fule_type, String wheller, String company_name, int no_doors, String owner_name) {
		super();
		this.fule_type = fule_type;
		this.wheller = wheller;
		this.company_name = company_name;
		this.no_doors = no_doors;
		this.owner_name = owner_name;
	}


	public String getFule_type() {
		return fule_type;
	}


	public void setFule_type(String fule_type) {
		this.fule_type = fule_type;
	}


	public String getWheller() {
		return wheller;
	}


	public void setWheller(String wheller) {
		this.wheller = wheller;
	}


	public String getCompany_name() {
		return company_name;
	}


	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}


	public int getNo_doors() {
		return no_doors;
	}


	public void setNo_doors(int no_doors) {
		this.no_doors = no_doors;
	}


	public String getOwner_name() {
		return owner_name;
	}


	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	} 
	
	// then we are the creating the constructor 
	// now creating the constructor that are the use in the 
	// now frist you are the creating the constrocter 
	
	// using the getter and asetter for the set the value and the get the value 
	
	
	
}
package learn_opp_3;

public class bick extends car {

	// now calling the supper \
	private String bike_name  ; 
	private String bike_oner_name ; 
	
	
	// mow creating the constrocter 
	
	
	
	@Override
	public String getCar_name() {
		// TODO Auto-generated method stub
		return super.getCar_name();
	}
	// this is the over ride funbction 
// if am the acceess the any override the method if you are 
	// if you are the access any final method then you are the over ride the any method 


	public bick(String bike_name, String bike_oner_name) {
		super();
		this.bike_name = bike_name;
		this.bike_oner_name = bike_oner_name;
	}


	public String getBike_name() {
		return bike_name;
	}


	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}


	public String getBike_oner_name() {
		return bike_oner_name;
	}


	public void setBike_oner_name(String bike_oner_name) {
		this.bike_oner_name = bike_oner_name;
	}
	
	// agian calling the getter and seetyer method for the calling the function 
	

}

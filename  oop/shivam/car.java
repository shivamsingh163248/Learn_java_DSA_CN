 package shivam;

public class car {

	private String door ;
	private int  engine ;
	private String driver ;
	final  public int speed  = 10 ;
	
	
	
	
	// now make the constructor 
	public car() {
		 door = "open" ; 
		engine = speed; // inisalize the constructer with final keyworld 
		driver = "shivam";
         
	}
	
	
	 public car(String door, String engine, String driver, int speed) {
		 
		 this();
		
		this.door = door;
		this.engine = engine;
		this.driver = driver;
		// this.speed = speed;
	}


	// now make the function of the use of 
	public  void setspeeed(int speed) {
		this.speed = speed ;  //  getter and setter method 
	}
	// again make the function of of the return value 
	public  int getspeed() {
		return  speed ; 
	}
	// now gain the creating the door 
	public void setdoor(String door) {
		this.door = door ; 
	}
	// for the printing using the getdoor 
	public String getdoor() {
		return door ; 
	}
	// again making the function of the  
	public void setengin(String engin) {
		this.engine = engin ;
	}
	// function calling  for the return of the return 
	public String getengin() {
		return engine ; 
	}
	// also sets the parameter of the driver 
	public void setdriver(String driver) {
		
		this.driver = driver;
		
	}
	
	

	
	
	// make the function for the test theae function are in running state or not 
	public String  carstate() {
		if (door.equals("closed") && engine.equals("2hz") && speed == 30  ) {
			 return "running" ;
		}else {
			 return "not running ";
		}
		//return "";
		
	}
	
	
}

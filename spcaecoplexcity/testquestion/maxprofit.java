package testquestion;



public class maxprofit {
	// creating the variable in the class 
	private String saller_name ; 
	private int[]arr ; 
	private int total_profit ; 
	private int seller_priese ; 
	
	
	// creating the constructor with variable 
	
	public  maxprofit(String seller_name ) {
		 this.saller_name  = seller_name; 
	}
	public maxprofit(String seller_name , int total_profit ) {
	        this(seller_name) ; 
		 this.total_profit = total_profit ; 
			
	}
	public maxprofit (String seller_name , int total_profit , int seller_prise) {
		// calling the above constructor using the this keyword 
		this(seller_name , total_profit) ; 
		this.seller_priese = seller_prise ; 
	}
	// now again the creating the constructor 
	public maxprofit(String saller_name, int[] arr, int total_profit, int seller_priese) {
		
		this(saller_name , total_profit , seller_priese) ; 
		this.arr = arr;
		
	}
	// now creating the getter and setter function for the set value and get the value 
	public String getSaller_name() {
		return saller_name;
	}
	public void setSaller_name(String saller_name) {
		this.saller_name = saller_name;
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public int getTotal_profit() {
		return total_profit;
	}
	public void setTotal_profit(int total_profit) {
		this.total_profit = total_profit;
	}
	public int getSeller_priese() {
		return seller_priese;
	}
	public void setSeller_priese(int seller_priese) {
		this.seller_priese = seller_priese;
	}
	// now creating the function of the profit 
	public  static void maxprofitt() {
		
	}
	
	
	

}

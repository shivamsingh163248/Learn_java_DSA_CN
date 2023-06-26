package learn_opp_3;

public class check_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the constrocter 
		car shivam =  new car() ;
		// calling the final value 
		 shivam.name_shivam("maruti");  
		// you can see the final call the mormalu 
			System.out.println(shivam.getCar_name());
		 shivam.name_shivam("shivam");
		System.out.println(shivam.getCar_name());
		
		// now agin creating the new object 
		car itisha = new bick("shivam singh ", "yahna ") ; 
		// now cahel the property what are the access 
		itisha.getCar_name() ; 
		 ((bick) itisha).getBike_oner_name(); // this property is the vary inp 

	}

}

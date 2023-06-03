package learn_exception;

public class learn_more_about_exception {

	 public static void main(String[] args) {

		    try{
		       int a = 5/0;
		    }
		    catch(Exception e){
		        System.out.print("Exception caught ");
		    }
		   
		   finally{
		       System.out.print("finally block");
		   } 
		 }

}

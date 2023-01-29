
public class lcm {

	
	// hear we make the function and calling the function of the doen
	 static int ged(int x , int y){
	     
	     if (y == 0) {
	         return x;
	     }
	     return ged(x , x % y);
	     }
	 

	    static long LCM(int x, int y) {
	       // we are the now using the eulium agloritum by using the recursion 
	        // now we are the using the type casting method of the java 
	        long multi = (long)x * (long)y ;
	        int gcf = ged(x, y);
	        return multi/gcf;
	        
	       
	    }
public static void main(String[] args) {
	LCM(30,4);
	
}

}



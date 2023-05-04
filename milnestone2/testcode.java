
public class testcode {
	public static int demo(int a, int b){
	    System.out.println(a + " " + b);
	    return a+b; 
	}
	// now again lets construct the function 
	
	public static void shiv(int a ) {
		// this is to make the solve the following question 
		
	}
	
	 public static boolean isPrime(int x)
	 {
	     for(int i=2;i<x/2;i++)
	     {
	         if(x%i==0)
	         return false;
	     }
	     return true;

	 }

	public static void main(String[] args) {
	    int a = 5;
	    int b = 15; 
	    System.out.println(demo(a, b));
	    System.out.print(isPrime(47));
	    
	    
	}

}

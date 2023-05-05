
public class checkpass_value {

	public static void c(int n){
	   
	    n++;
	    System.out.println("Inside c "+n);
	}
	public static void b(int n){
	    c(n);
	    System.out.println("Inside b "+n);
	    n++;
	}
	public static void a(int n){
	    b(n);
	    System.out.println("Inside a "+n);
	}
	    
	public static void main(String args[]) {
	    int n=10;
	    a(n);
	    System.out.println("Inside Main "+n);
	    }

}

package learn_generic_method;

public class arrayImplimentation <T>{
	
	T arr[] ; 
	T val ; 
	
	// creating the contocter 
	
	public arrayImplimentation(T arr[] ,  T val) {
	
		this.arr = arr ; 
		this.val = val ; 
	}
	
	
	// creating the method of the printing 
	
	public void printing() {
		for (T i : arr) {
			System.out.print(1+" ");
		}
		
		System.out.println("array number is "+val);
	}

}

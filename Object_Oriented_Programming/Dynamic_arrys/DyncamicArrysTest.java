package Dynamic_arrys;

public class DyncamicArrysTest {
	
	// creating the function for the testing the dynamic arrays 
  public static void main(String[] args) {
	
	  ArraysFunction marks = new  ArraysFunction() ; 
	  marks.set(45);
	  marks.set(65);
	  marks.set(55);
	  marks.set(75);
	  marks.set(65);
	  marks.set(765);
	  
	  marks.print();
	  
	  // now printing the last element 
	  marks.remove();
	  System.out.println();
	  marks.print();
	  marks.set(75);
	  System.out.println();
	  marks.print();
	  marks.remove();
	  marks.remove();
	  marks.remove();
	  marks.remove();
	  marks.remove();
	  marks.remove();
	  marks.remove();
	  marks.remove();
	  marks.remove();
	  marks.print();
	  marks.set(75);
	  System.out.println();
	  marks.print();
	  
	  
}
	
	
	

}

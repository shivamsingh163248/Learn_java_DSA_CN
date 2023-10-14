package BST_CLASS;

public class BstTestFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// now creating the object 
		BST_CLASS function = new BST_CLASS()  ; 
		function.insert(35);
		function.insert(30);
		function.insert(25);
		function.insert(15);
		function.insert(10);
		function.insert(5);
		function.insert(55);
		function.insert(40);
		function.insert(60);
		function.insert(45);
		
		// now adding the printing 
		function.print(); 
		function.deletedata(55);
		System.out.println("now testing ");
		function.print(); 
		

	}

}

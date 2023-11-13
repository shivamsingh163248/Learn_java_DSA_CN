package hasmap_using_bst;

public class Mainfunction {

	public static void main(String[] args) {
		
		
		// now creating the main function 
		HasMapUsingBST_Function function = new HasMapUsingBST_Function() ; 
		
		// now creating the add 
		function.put(1, 234);
		function.put(2, 32);
		function.put(3, 734);
		function.put(4, 325);
		function.put(5, 24);
		function.put(6, 302);
		
		// now printing the data 
		System.out.println(function.get(4));
		System.out.println(function.get(1));
		System.out.println(function.get(2));
		System.out.println(function.get(3));
		System.out.println(function.get(5));
		System.out.println(function.get(6));
		
		
		// now remove the data 
		
		function.put(6, 34);
		System.out.println(function.get(6));
		
		// now we are the remove 4 index 
		function.remove(4);
		System.out.println(function.get(4));
		
	}
	
}

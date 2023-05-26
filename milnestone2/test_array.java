
public class test_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the new array for the dynamic 
		int[][]shiv = new int[6][] ; 
		
		// now adding the spacing the dynamically 
		for (int i = 0; i < shiv.length; i++) {
		shiv[i] = new int[i+1];
		}
		
		// check for the printing value 
		for (int i = 0; i < shiv.length; i++) {
			for (int j = 0; j < shiv[i].length; j++) {
				
				// printing the value 
				System.out.print(shiv[i][j]);
			}
			System.out.println();
			
		}

	}

}

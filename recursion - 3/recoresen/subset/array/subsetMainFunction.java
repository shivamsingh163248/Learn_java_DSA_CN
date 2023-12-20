package recoresen.subset.array;

public class subsetMainFunction {
	public static void main(String[] args) {
		
		// calling the function 
		// creating the objective 
		number_subset_array subset = new number_subset_array();
		int[]arr = subset.takeinput() ; 
		int[][]array = subset.subsetHelper(arr , 0 ); 
		// mow printing the two dimensional array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}

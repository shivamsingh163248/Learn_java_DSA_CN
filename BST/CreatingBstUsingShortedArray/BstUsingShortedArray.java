package CreatingBstUsingShortedArray;



public class BstUsingShortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the object 
		 function_BST function = new function_BST();
//		binaryTreeNode<Integer>input =  function.takeinput_LevelWise();
//		 function.printBST(input);
		 
		 // now calling for the taking the input of the arry 
		 // creating the arrua 
		 int[]inputarray  ; 
		 inputarray = function.takinputArry() ; 
		 
		 // printing the array for the checking 
		 
		 function.printArray(inputarray);
		 // now calling the print bst function 
		 System.out.println();
		
		 binaryTreeNode<Integer>rootnodeOfTheArray = function.BSTusingShortedArray(inputarray, inputarray.length);
		 // now printing the binnary 
		 function.printBST(rootnodeOfTheArray);

	}

}

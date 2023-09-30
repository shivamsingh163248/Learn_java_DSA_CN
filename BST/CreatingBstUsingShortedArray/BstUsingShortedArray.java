package CreatingBstUsingShortedArray;

public class BstUsingShortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the object 
		 function_BST function = new function_BST();
		binaryTreeNode<Integer>input =  function.takeinput_LevelWise();
		 function.printBST(input);

	}

}

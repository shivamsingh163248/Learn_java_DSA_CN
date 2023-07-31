package FindNumberNodeBinaryTree;

public class testBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the obejct for the take input
		
		// creatign the object 
		
		BinaryTree itisha = new BinaryTree() ; 
		
		
		
		BinnaryTreeNode<Integer>shivam = itisha.BinaryTreeInput();
		System.out.println(itisha);
		BinnaryTreeNode<Integer>LOVEu = itisha.BinaryTreeInput();
		System.out.println(itisha);
		
		// now creating the print function 
		
		itisha.printBinaryTree(shivam);
		// now using the print function 
		itisha.printBinaryTree(LOVEu);
		System.out.println("----------------------------");
		itisha.printBinaryTree(shivam);
		
		
		// now checking the address 
		
		System.out.println(itisha.BinaryTreeInput());
		System.out.println(itisha.BinaryTreeInput());

	}

}

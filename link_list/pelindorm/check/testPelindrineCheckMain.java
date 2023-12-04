package pelindorm.check;

public class testPelindrineCheckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the obejct 
		pelindromeFunction pelindorne = new pelindromeFunction();
		
		LinklistNode<Integer>head =  pelindorne.takinginput();
		// and finding the length 
		System.out.println(pelindorne.linklistlength(head));
		
		System.out.println(pelindorne.chekpelindrome(head));

	}

}

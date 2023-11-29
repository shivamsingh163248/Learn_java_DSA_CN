   package recursion.subsquence.string;

public class subsquencString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the object 
		subsquence child = new subsquence();
		String[]result = child.subsquences(child.takeinput());
		for (String i : result) {
			System.out.println(i);
		}

	}

}

import java.util.Scanner;

public class reverse_each_world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lets write the code of reverse each world 
		// fist we are the scanning  sentence from the user 
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		// now fist we are the finding the length of the string 
		// and creating the blank string 
		String st2 = "";
		int current_world = 0;
		// using the for loop iterating all the element in the sentence 
		for (int i = 0; i < str1.length(); i++) {
			// check the blank character of the string where condition are apply 
			// fist we are the 
			char ch1 = ' ';
			if (str1.charAt(i)== ch1) {
				// now collect the index number of blank number string 
				int current_end  = i-1;
				// again creating the new bank string for the adding  
				String each_world = "";
				for (int j = current_world; j <= current_end ; j++) {
					// now printing the element 
					each_world += str1.charAt(j);
				}
				// update the current world ;
				
				st2 =  each_world+" "+st2;
				current_world = i+1;
			}
			
			
		}
		st2 =  str1.subSequence(current_world-1, str1.length())+st2;
		System.out.println(st2);

	}

}

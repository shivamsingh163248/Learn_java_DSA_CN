
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now we are the writing program 
		for (int i = 0; i < 8; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("*"+"");
				
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		
		
		
		// making the another pattern with the while loop 
		int i = 0 ;
		while (i<8) {
			int j = 0;
			while (j<8) {
				// fist making the square of the stare 
				// now write the sentence of the stare pattern 
				System.out.print("*"+"");
				j++;
			}
			// now the printing the sentence for the in the next line 
			System.out.println("");
			i++;
		}

	}

}

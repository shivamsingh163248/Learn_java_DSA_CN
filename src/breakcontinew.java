import java.util.StringTokenizer;

public class breakcontinew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// so we learn the in this video the break and continue statement 
		// and learn about the break and continue statement 
		// implementation 
		for (int i = 0; i < 10; i++) {
			// printing the one to 10 
			if (i == 5) {
				System.out.println("my nme is shivam and i testing the code");
				
				continue;
			}
			// we re the removing the 8 by the using break 
			if (i != 7) {
				System.out.println("this is the 7 numbeer ");
				
			}else {
				System.out.println("this is not A 7 number");
				break;
			}
			
			
			 System.out.println(i);
			 // so i will try to printing the  table after removing 5
			 // so now i learning the break and continue statement ;
			
		}
		// now i will try to printing the triangle pattern 
		for (int i = 0; i < 10; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				
				if (j == (i-1)|| j == 0) {
					System.out.print(" *");
					continue;
				}
				if (i==(10-1)) {
					System.out.print(" *");
					continue;
				}
				
				
				System.out.print("  ");
				
			}
			System.out.println("");
			
		}

	}

}

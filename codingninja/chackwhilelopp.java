
public class chackwhilelopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 1;
//		while(i < 5) {
//		    if(i == 3) {
//		    	System.out.println("5");
//		        continue;
//		    }
//		    System.out.print(i + " ");
//		    i++;
//		}
//		for (int j = 0; j < 5; j++) {
//			 if(j == 3) {
//			    	System.out.println("5");
//			        continue;
//			    }
//			    System.out.print(j + " ");
//			
		int i = 1;
		while(i < 3) {
		    int j = 0;
		    while(j < 5) {
		        j++;
		        if(j == 3) {
		            continue;
		        }
		        System.out.print(j + " ");
		    }
		    i++;
		}
		
	
	}

}

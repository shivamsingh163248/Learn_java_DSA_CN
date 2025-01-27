package typeconversion;

public class forloop {

	public static void main(String[] args) {
	
		int i = 2 ; 
		for (; i < 5; i++) {
			System.out.println(i);
		}
		
		int j = 0 ; 
		for (; ; ) {
			
			System.out.print(j+" ");
			if(j>10) {
				break ; 
			}
			j++ ; 
			
		}
		
		System.out.println();
		
		// creating the the for loop in the another formate 
		int k = 0 ; 
		for (System.out.println("hi"+" ");  k < 5; k++) {
			System.out.println("ninjas");
		}

	}

}

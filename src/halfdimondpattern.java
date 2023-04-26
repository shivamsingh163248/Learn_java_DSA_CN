import java.util.Scanner;

public class halfdimondpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner input = new Scanner(System.in);
	        int  n = input.nextInt();
	        // using the loop part 1
	        for (int i = 0; i <= n; i++) {
	// now using the second loop for the inner value 
	      for (int j = 0; j <= i; j++) {
	          // now taking the condation for the external star]
	          if (i==0||j==0) {
	              System.out.print("*");
	              continue;
	          }
	          System.out.print(j);

	      }
	      // now write the next loop for the next value printing 
	      for (int j1 = i-1; j1 >= 0; j1--) {
			// now write the condition for the printing stare which are given in the question 
	    	  if (j1 == 0) {
				System.out.print("*");
				continue;
			}
	    	  // writing the printing hear 
	    	  System.out.print(j1);
			
		}
	     
	      
System.out.println(" ");
	            
	        }
	        
	        
	        
	        // now again loop starting for the down loop that are the using the increasing order pattern 
		      // brake and continue problem that are make help to solving this problems 
		      // so write hear the down loop using the for loop
		      for (int j2 = 0; j2 < n ; j2++) {
				
		    	  // in this loop we re writing the statement 
		    	  for (int i = 0; i < n-j2; i++) {
					// now make the condition for the outer stare
		    		 if (i==0) {
						System.out.print("*");
						continue;
					} 
		    		 // now printing the given question value 
		    		 System.out.print(i);
				}
		    	  
		    	  // now printing the next part of the loop given as a question in the conding ninja 
		    	  // now starting the nest loop 
		    	  // hear using the reverse loop due to high value print at fist 
		    	  for (int k = (n-2)-j2; k >= 0; k--) {
		    		  // now print the stare * for the using condition using the continue statement 
		    		  if (k == 0 ) {
						System.out.print("*");
						continue;
					}
					System.out.print(k);
					
				}
		    	  
		    	  
		    	  
		    	  
		    	// this is the external loop so hear printing the space for the second line 
		    	  System.out.println(" ");
			}
		      if (n==0) {
				System.out.println("*");
			}
	        
	}

}

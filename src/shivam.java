
public class shivam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		for (int i = 0; i < 10 ; i++) {
			// this loop are applied for the all loop 
			for (int j = 0; j < 7; j++) {
				if((i==2 || i == 3)&& (j>1)) {
					System.out.print("  ");
					continue;
				}
				if ((i==6 || i == 7) && (j<5)) {
					System.out.print("  ");
					continue;
				}
				
				System.out.print("**");
			}
			// write the next world hear 
			for (int j = 0; j < 7; j++) {
				
				System.out.print(" ");
				
			}
           for (int j = 0; j < 7; j++) {
        	   
        	   if ((i<4 || i> 5) && (j>1 && j<5)) {
				System.out.print("  ");
				continue;
			}
        	   
				
				System.out.print("**");
				
			}
           
           // printing the space 
           for (int j = 0; j < 7; j++) {
				
				System.out.print(" ");
				
			}
           // now printing the i 
           
           for (int j = 0; j < 7; j++) {
        	   
        	   // then now given the condation 
        	   if ((i>1 && i<8)&&(j<2|| j>4))
        	   {
				System.out.print("  ");
				continue;
			 }
        	   
			System.out.print("**");
		}
           
           
           // now printing the space 
           
           for (int j = 0; j < 7; j++) {
				
				System.out.print(" ");
				
			}
           
           
           // now printing the v world 
          for (int j = 0; j < 7; j++) {
        	  
        	  if ((i<5)&&(j>1 && j<5)) {
				
        		  System.out.print("  ");
        		  continue;
        	  }
        	 
        		  if ((i>6) && (j== 0 || j == 6)) {
  					System.out.print("  ");
  					continue;
  				}
        		  if ((i>7) && (j== 1|| j == 5)) {
    					System.out.print("  ");
    					continue;
    				}
        		  if ((i>8) && (j== 2 || j == 4)) {
  					System.out.print("  ");
  					continue;
  				}
        		  
        		  
        		  // write the code the middle part of the v
        		  if ((i>4 && i< 8)&&(j == 3)) {
					System.out.print("  ");
					continue;
				}
        		  if ((i>4 && i< 7)&&(j == 2 || j== 4)) {
  					System.out.print("  ");
  					continue;
  				}
			
        		 
        	  
			
        	  
			System.out.print("**");
		} 
          
          
          // then the write the code of the space that are the using 
          for (int j = 0; j < 7; j++) {
				
				System.out.print(" ");
				
			}
         // now printing the a
          
         for (int j = 0; j < 7; j++) {
        	 // now the condition applied
        	 if (((i>1&& i<4) ||(i>5&& i<10))&& (j>1 && j<5)) {
				System.out.print("  ");
				continue;
			}
        	 
			System.out.print("**");
		}
         // now write the code of the space after the a 
         for (int j = 0; j < 7; j++) {
				
				System.out.print(" ");
				
			}
         // now printing the  m word 
         //so the writing the code 
         for (int j = 0; j < 14; j++) {
        	 
        	if ((i>2)&& ((j>2&& j<5)||(j>8 && j<11))) {
			System.out.print("  ");
			continue;
			}
			System.out.print("**");
		}
         
			
			
			
			
			
			System.out.println(" ");
			
		}


	}

}

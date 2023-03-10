import java.util.Iterator;
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
					System.out.print(" a");
					continue;
				}
				
				
				System.out.print("  ");
				
			}
			System.out.println("");
			
		}
		
		
		// so i will try the name printing of s
		
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
				
				System.out.print(" *");
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
        	   
				
				System.out.print(" *");
				
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
        	   
			System.out.print(" *");
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
			
        		 
        	  
			
        	  
			System.out.print(" *");
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
        	 
			System.out.print(" *");
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
			System.out.print(" *");
		}
         
			
			
			
			
			
			System.out.println(" ");
			
		}

	}

}

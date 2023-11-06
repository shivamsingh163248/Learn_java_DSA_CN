package RemoveDuolicateUsingHasmap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class usehasmapFnction {
	
	// creating the hasmap function
   // taking the array function 
	
	public int[] takingarry() {
		// user disply
		Scanner input = new Scanner(System.in) ; 
		System.out.println("enter the size of the arry ");
         int size = input.nextInt()	;
         // now creating the while loop for the 
         int[]arry = new int[size] ; 
         int i = 0 ; 
         while (i < arry.length) {
			// now taking the input whole arry 
        	 System.out.println("enter the index:"+i);
        	 int value = input.nextInt();
        	 arry[i] =  value ; 
        	 i++ ; 
        	 
        
        	 
		}
         return arry ;
	}
         
         // now creating the function ofr the checking the dublicate 
         
        public ArrayList<Integer> checkingDublicUsingHasmap(int[]arry){
        	
        	// creating the hasmap function 
        	HashMap<Integer, Boolean>student = new HashMap<>() ; 
        	// now creating the obejct html
        	
        	// now creating the loop for the add in the arry list 
        	
        	ArrayList<Integer>number = new ArrayList<>() ; 
        	
        	for (int i = 0; i < arry.length; i++) {
        		
        		
        		if (student.containsKey(arry[i])) {
					continue ; 
				}
        		
        		student.put(arry[i], true) ; 
        		number.add(arry[i]) ; 
				
			}
        	
        	return number ;
        }
        
        
        
        
        
		
	}



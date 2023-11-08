package RemoveDuolicateUsingHasmap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import learn_recursion_II.string_replacement;

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
        
        
        // crating the function remove string 
        public String  removedublicate(String str) {
        	
        	// creating the hasmap obejct 
        	HashMap< Integer , String>number = new HashMap<>() ; 
        	// now add the stirng deta in the has map 
        	for (int i = 0; i < str.length(); i++) {
        		
        		if (number.containsValue(String.valueOf(str.charAt(i)))) {
					continue ; 
				}
        		
				number.put(i , String.valueOf(str.charAt(i))) ; 
			}
        	
        	
        	// now printing the charecter 
        	
        	
        	// cretaing the for loop 
        	String value = ""  ; 
        	for (int i = 0; i < number.size(); i++) {
				value += number.get(i) ;
				System.out.println(number.get(i));
			}
        	
        	return  value ; 
        	
        }
        	
        
        
        
        
        
        
		
}



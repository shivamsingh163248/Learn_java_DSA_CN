package RemoveDuolicateUsingHasmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClassFunction {
	
	public static void main(String[] args) {
		
	
	// creating the object 
	
	usehasmapFnction func = new usehasmapFnction() ; 
	int[]arr = func.takingarry(); 
	ArrayList<Integer>removeDuplicate = func.checkingDublicUsingHasmap(arr) ; 
	
	// now printing the arrylist using the for each loop 
	
	for (int i = 0; i < removeDuplicate.size(); i++) {
		System.out.println(removeDuplicate.get(i));
		
	}
	
	HashMap<String, Integer> map = new HashMap<>();
	 
    // Add elements using put method
    map.put("vishal", 10);
    map.put("sachin", 30);
    map.put("vaibhav", 20);

    // Iterate the map using
    // for-each loop
    
    // this is the importend value 
    
    
    for (Map.Entry<String, Integer> e : map.entrySet())
        System.out.println("Key: " + e.getKey()
                           + " Value: " + e.getValue());
    
    
    
    // calculating the hascode 
    String a = "abcde" ; 
    String b = "bcdf" ; 
    String c = "pqr" ; 
    String d = "abei"; 
    
    // now printing the has code 
    System.out.println(a.hashCode());
    System.out.println(b.hashCode());
    System.out.println(c.hashCode());
    System.out.println(d.hashCode());
    
    
	
	
	}

}

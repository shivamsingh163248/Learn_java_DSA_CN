package array_list;

import java.util.ArrayList;

public class foreachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  creating the array lsit 
		ArrayList<Integer> itisha = new ArrayList<>(6);
		
		// creaing the add function for the set value 
		for (int i = 0; i < 10; i++) {
			itisha.add(i ,i*2);
		}
		
		// now creating the function for the printing 
		// now printg the function 
		// itisha.set();
		// itisha.remove()
		
		// now print the array 
		for (int i = 0; i < itisha.size(); i++) {
			System.out.println(itisha.get(i));
		}
		// now check the size 
		System.out.println(itisha.size());
				
		
		/// now creating the for each loop 
		for (int i : itisha) {
			System.out.println(i+" * ");
		}
	
		
		}

}

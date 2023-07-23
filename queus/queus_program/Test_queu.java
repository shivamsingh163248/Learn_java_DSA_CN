package queus_program;

import java.util.Iterator;

import stack.stackFullException;

public class Test_queu {

	public static void main(String[] args) throws Empety_queu, stackFullException {
		// TODO Auto-generated method stub
		
		// creating the array 
		int[]shivam = {1,2,3,4,5,6,7,8,9,10} ; 
		
		
		/// now creating the object 
		
		simple_queus_program itisha = new simple_queus_program() ; 
		
		itisha.inque(34);
		System.out.println(itisha.size());
		System.out.println(itisha.font());
		itisha.inque(45);
		System.out.println(itisha.size());
		System.out.println(itisha.font());
		itisha.inque(55);
		System.out.println(itisha.size());
		System.out.println(itisha.font());
		itisha.inque(34);
		System.out.println(itisha.size());
		System.out.println(itisha.font());
		itisha.inque(45);
		System.out.println(itisha.size());
		System.out.println(itisha.font());
		itisha.inque(55);
		System.out.println(itisha.size());
		System.out.println(itisha.font());
		itisha.deque();
		System.out.println(itisha.size());
		System.out.println(itisha.font());
		
		
		// now creating the different object 
		simple_queus_program shivam_iti = new simple_queus_program();
		
		// now we are tthe writing the code 
		
		// creating the  array 
		for (int i = 0; i < shivam.length; i++) {
			shivam_iti.inque(shivam[i]);
		}
		
		// now print the 
		shivam_iti.deque();
		shivam_iti.inque(23);
		
		
		
		
		for (int i = 0; i < shivam.length; i++) {
			System.out.println(shivam_iti.deque());
		}
		
		
		
		
		
		

	}

}

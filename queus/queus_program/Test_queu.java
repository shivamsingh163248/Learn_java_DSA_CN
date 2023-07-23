package queus_program;

public class Test_queu {

	public static void main(String[] args) throws Empety_queu {
		// TODO Auto-generated method stub
		
		// creating the array 
		int[]shivam = {2,4,5,6} ; 
		
		
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
		itisha.deque();
		System.out.println(itisha.size());
		System.out.println(itisha.font());
		
		

	}

}

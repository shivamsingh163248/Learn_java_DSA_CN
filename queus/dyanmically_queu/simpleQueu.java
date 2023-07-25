package dyanmically_queu;

public class simpleQueu {

	public static void main(String[] args) throws NullSQueuException {
		// TODO Auto-generated method stub
		
		// now creating the object 
		queue shivam = new queue();
		
		// creating the array 
		
		// frist we are the insurting the value 
		
		shivam.inque(25);
		shivam.inque(34);
		shivam.inque(34);
		shivam.inque(67);
		// now printing the size of the array 
		System.out.println(shivam.size());
		shivam.inque(45);
		// again printing the size of the array 
		 
		System.out.println(shivam.deque());
		System.out.println(shivam.deque());
		shivam.inque(43);
		System.out.println(shivam.size());
		
		// now inque using the array 
		
		int[]itisha  = {23,45,4,5,6,7,8,12,4,598} ; 
		
		// creatingthe for loop for the enter every value in the que 
		
		for (int i = 0; i < itisha.length; i++) {
			shivam.inque(itisha[i]);
			
		}
		
		// now printing the all the value which are in the queu 
		
		// check the front value 
	//	System.err.println(shivam.front());
		System.out.println(shivam.front());
		
		
		System.out.println("now printing the queu ");
		
		int size = shivam.size();
		
		
		
		for (int i = 0; i <size; i++) {
			System.out.println("element" + shivam.deque() + " size" + shivam.size());
			
		
			
		}
		
		
		

	}

}

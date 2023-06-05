package shivam;

public class dynamic_array_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// now calling the 
		dynamic_array shi = new dynamic_array() ; 
		// shi is the object for the that constructor 
		
		// now adding the number from calling the function passing with value 
		for (int i = 1; i < 100; i++) {
			
			shi.add(100+i);
		}
		//check the size of the value 
		System.out.println(shi.size());
		System.out.println(shi.get(3));
		// check all the value of the number passing 
		
		for (int i = 0; i < shi.size(); i++) {
			System.out.print(shi.get(i)+" ");
		}
		System.out.println();
		
		// now the set the value of the array at the index 4 
		shi.set(3, 108);
		// agian the printing the the index 
	System.out.println(shi.get(3));
	// now agian the printing the whole array \
	for (int i = 0; i < shi.size(); i++) {
		System.out.print(shi.get(i)+" ");
	}
	// now remove the last element 
	System.out.println();
	System.out.println(shi.remove_last());
	// mow check the size of the whole array 
	System.out.println(shi.size());
	
	System.out.println(shi.get(97));
	
	

	}

}

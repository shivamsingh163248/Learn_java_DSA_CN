package conversion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class algorithum {
	
	// creating the 
	int a    ; 
	int b; 
	
	// creating the method 
	public void add(int a , int b ) {
		// increment or not 
		this.a = a ; 
		this.b = b ; 
		
	}
	
}



public class LearingTestingChar {
	
	public static  void io() throws IOException {
		
		FileReader read = new FileReader("d:/shivam.text"); 
		int a = read.read() ; 
		
	}
	
	
	
	
	// creating the the test 
	public static void main(String[] args) {
		
		
		// creating the list 
		List<algorithum>chek = new ArrayList<>() ; 
		
		// in this list we are the adding the type of 
		
		algorithum shivamn = new algorithum() ; 
		shivamn.add(5, 6);
		// now checking the input of the shivam that
		// we are the input 
		System.out.println(shivamn.a);
		
		// now we are the adding this objet in this 
		// arrays 
		// also creating the new object 
		algorithum itisha = new algorithum() ; 
		itisha.add(2, 8);
		
		chek.add(shivamn) ; 
		
		// creating the function
	
		// now calling the id 
		try {
			io();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("finaly are the always are the excuate ");
		}
		
		
	 
		 
		
	
	   
		
	}
	
	

}

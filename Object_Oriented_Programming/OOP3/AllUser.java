package OOP3;

import java.util.Scanner;

public class AllUser {
	
	// crating the arrys and the all user 
	private user[] all_User ; 
	
	// creating the function for the storing data 
	
    public void Count() {
		
    	// creating the scanner function 
    	Scanner input = new Scanner(System.in) ; 
    	// creating the size o the input 
    	int size = input.nextInt() ; 
    	
    	// now creating the size of the arrys 
    	all_User = new user[size] ;
    	
    	// creating the loop and and the set the data 
    	
    	

	}
    
    public user detail() {
    	
    	// creating the new object 
        Scanner input = new Scanner(System.in) ; 
        System.out.println("enter the name");
        String name = input.next() ; 
        System.out.println("enter the father name");
        String father_name = input.next() ; 
        System.out.println("enter the mother name");
        String mother_name = input.next() ; 
        System.out.println("enter the adhar number");
        int addhar = input.nextInt() ; 
        
        return new user(name, father_name, mother_name, addhar) ; 
    }
    
    
    
	

}

package shivam;

public class student {
	
	//  creating the object in the class and accessed by another class 
	int id ; 
	String name ; 
	int class_name ; 
    String father_name ; 
    String mother_name ;
    
    
//	public student(int id, String name, int class_name, String father_name, String mother_name) {
//		
//		this.id = id;
//		this.name = name;
//		this.class_name = class_name;
//		this.father_name = father_name;
//		this.mother_name = mother_name;
//	} 
    
    // creating the new method for the value and 
    
    public void setname(String name) {
    	this.name = name ; 
    }
    // agian the creating the method for the class_name 
    public void setclassname(int class_name) {
    	this.class_name = class_name;
    }
    // again the call the vlUE OF THE   
    public void setfathername(String father_name) {
    	this.father_name = father_name ; 
    }
    
    // now set the mother name 
    public void setmothername(String mother_name) {
    	this.mother_name = mother_name;
    }
    // now return the all the value 
    public void allvlaues() {
    	System.out.println(name+" "+class_name+" "+father_name+" "+mother_name);
    }
    
    
    

}

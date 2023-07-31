package school;

public class  student extends school {
	
	private String student_name ; 
	private int student_rollno ; 
	
	// now creating the constructor 
	public student(int student_rollno , String studnet_name) {
		// TODO Auto-generated constructor stub
		// using the this keyword for the showing class variable 
		this.student_name = studnet_name;
		this.student_rollno = student_rollno ; 
		System.out.println(this.student_name+"   "+this.student_rollno);
		
	//	super.itisha = 20 ; 
		//calling the functio itisha 
		
		
		
		
		
		
	}

@Override
public void name(int a) {
	// TODO Auto-generated method stub
	super.name(a);
}

	

	

}



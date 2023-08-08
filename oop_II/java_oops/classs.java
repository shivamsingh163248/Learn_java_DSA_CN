package java_oops;

public class classs extends  student {




	
	
	public classs(int roll_number, String name, String father_name, String mother_name) {
		super(roll_number, name, father_name, mother_name);
		// TODO Auto-generated constructor stub
	}
	
	public classs(int roll_number, String name ) {
		super(roll_number , name);
	}

	
	
	private int teacher_id ;
	private String teacher_name ;
	private String teacher_subject ; 
	private int student_class ; 
	private int total_student ; 
	
// creating constructor for 
	
	

	
	
	
	




	
	
	
	
	
	
	
	
	
	public classs(int roll_number, int teacher_id, String teacher_name, String teacher_subject, int student_class,
		int total_student) {
	super(roll_number);
	this.teacher_id = teacher_id;
	this.teacher_name = teacher_name;
	this.teacher_subject = teacher_subject;
	this.student_class = student_class;
	this.total_student = total_student;
}
	
// set the value of the all the number
	public void setallvalue(int teacher_id, String teacher_name, String teacher_subject, int student_class, int total_student) {
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.teacher_subject = teacher_subject;
		this.student_class = student_class;
		this.total_student = total_student;
		
	}
	
	// agian the creating the function of the student 
	public void set_student_value(int roll_number , String name , String father_name , String mother_name) {
		setName(name);
		setRoll_no(roll_number);
		setFather_name(father_name);
		setMother_name(mother_name);
	}
	
	
	

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	

	
	
//	public String getFather_name() {
//		// TODO Auto-generated method stub
//		return super.getFather_name();
//	}	

	@Override
	public void print_student() {
		// TODO Auto-generated method stub
		super.print_student();
	}
	
	// now creating the father function 
	
	//-------------------------------------------------------------------
	
	
	
	// now creating the function 
	
	
	// experiment *********************************************************************
	
// if any method override and you creating the same singaneture method then its given the error 
	
	
//	public static void print_student() {
//		System.out.println("this is the my mae is shivam singh ");
//	}
//	
	
	
	
	public String getFather_name() {
		return getTeacher_name();
	}
	
	//---------------------------------------------------------------------

	public String getTeacher_subject() {
		return teacher_subject;
	}

	public void setTeacher_subject(String teacher_subject) {
		this.teacher_subject = teacher_subject;
	}

	public int getStudent_class() {
		return student_class;
	}

	public void setStudent_class(int student_class) {
		this.student_class = student_class;
	}

	public int getTotal_student() {
		return total_student;
	}

	public void setTotal_student(int total_student) {
		this.total_student = total_student;
	}
	
	// creating the printing the value 
	
	
	//  again printing for the class value 
	public void print_class_teacher() {
 System.out.println("teacher_id = :- "+getTeacher_id());
 System.out.println("teacher_name :- "+getTeacher_name());
 System.out.println("teacher_subject :- "+getTeacher_subject());
 System.out.println("student_class :- "+getStudent_class());
 System.out.println("total_student :- "+getTotal_student());
		
	}
	public void print_class_student() {
		System.out.println("student_roll_no :- "+getroll_no());
		System.out.println("student_name :- "+getName());
		System.out.println("student_father_name :- "+getFather_name());
		System.out.println("student_mother_name :- "+getMother_name());
		System.out.println("PROGRAMMER_NAME :- "+programmer);
		// now call the above fucntion 
		print_class_teacher();
		
	}
	
	// check the superkeyword 
	
	String name = super.getName();
	
	
	
	

	
	
}

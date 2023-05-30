package java_oops;

public class classs extends student {




	
	
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
	

	
	
	
	public String getFather_name() {
		// TODO Auto-generated method stub
		return super.getFather_name();
	}
	@Override
	public void print_student() {
		// TODO Auto-generated method stub
		super.print_student();
	}
	
	
	

	
	
}

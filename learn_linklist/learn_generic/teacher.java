package learn_generic;

public class teacher implements student_inteface { // implement inteface class 
	private String teacher_name ; 
	private int teacher_id_no ;
	public teacher(String teacher_name, int teacher_id_no) {
		
		this.teacher_name = teacher_name;
		this.teacher_id_no = teacher_id_no;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public int getTeacher_id_no() {
		return teacher_id_no;
	}
	public void setTeacher_id_no(int teacher_id_no) {
		this.teacher_id_no = teacher_id_no;
	} 
	
	// now creating the ocnstocter 
	// creating the print function 
	public void print() {
		System.out.println(getTeacher_id_no()+" "+getTeacher_name());
	}
	

}

package learn_generic_method;

public  abstract class studet_parent_using_abstrect  implements student_inteface{
	
	// now creating the two variable 
	private int id_numbeer ; 
	private String user_name ;
	public studet_parent_using_abstrect(int id_numbeer, String user_name) {
		;
		this.id_numbeer = id_numbeer;
		this.user_name = user_name;
	}
	
	public studet_parent_using_abstrect() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public int getId_numbeer() {
		return id_numbeer;
	}
	public void setId_numbeer(int id_numbeer) {
		this.id_numbeer = id_numbeer;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	} 
	
	// creating the constrocter 
	// agian creatiing the getter and setter method 
	
	// now creating some 
	public abstract void user_parent_print() ; 
	

}

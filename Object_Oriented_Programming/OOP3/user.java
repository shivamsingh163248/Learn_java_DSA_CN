package OOP3;

public class user {
	
	
  // creating the parameter about the user and then creating type of the constructor
 private String name ; 
  private String Father_name ; 
  private String Mother_name ; 
  private int Aadhar ; 
  
  // creating the default constructor 
  public user() {
	
}
  public user(String name) {
	  
	  this.name  = name ; 
  }
  
  public user(String name , String father_name , String mother_name , int Adhar_nu) {
	  // using the this key world for the 
	  this.name = name ; 
	  this.Father_name = father_name ; 
	  this.Mother_name = mother_name ; 
	  this.Aadhar = Adhar_nu ; 
  }
  
  // creating the getter and the setter values that are the using 
  
  // creating the getter and setter vaslues 
  
  public int getAadhar() {
	return Aadhar;
}
  public String getFather_name() {
	return Father_name;
}
  public String getMother_name() {
	return Mother_name;
}
  public String getName() {
	return name;
}
  public void setAadhar(int aadhar) {
	Aadhar = aadhar;
}
  public void setFather_name(String father_name) {
	Father_name = father_name;
}
  public void setMother_name(String mother_name) {
	Mother_name = mother_name;
}
  public void setName(String name) {
	this.name = name;
}
  

}

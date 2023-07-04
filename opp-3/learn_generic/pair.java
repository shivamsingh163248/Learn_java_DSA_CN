package learn_generic;

public class pair<itisha> { // this is the generic method for the set the value at place of the deta type 
	
	// now creating the two integer 
private itisha shivam ; 
private itisha shiv ; 
// now creating the constocter for the set the value 
public pair(itisha shivam, itisha shiv) {
	
	this.shivam = shivam;
	this.shiv = shiv;
}
public itisha getShivam() {
	return shivam;
}
public void setShivam(itisha shivam) {
	this.shivam = shivam;
}
public itisha getShiv() {
	return shiv;
}
public void setShiv(itisha shiv) {
	this.shiv = shiv;
}
public void print() {
	System.out.println(getShiv() +"  "+ getShivam());
}




}

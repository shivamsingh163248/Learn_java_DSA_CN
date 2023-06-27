package learn_generic;

public class test_generic_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// now creating the constrocter 
		pair<Integer>shivam = new pair<Integer>(031,843);
		System.out.println(shivam.getShivam()+"  "+shivam.getShiv());
		System.out.println("this is the totaly right name ");
		System.out.println("check another string type set the value ");
		pair<String> itisha = new pair<String>("shivam", "itisha") ; 
		// now creating the print fucntion for the check directly 
		itisha.print();

	}

}

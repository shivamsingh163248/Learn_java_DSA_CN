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
		
		// now agian creaint the value for the set normally 
	// 	pair p = new pair(20, 50) ; ///// it worng type method
		
		// now creating the generic class and how to use this method and apply with 
		// generic method to learn the det the deta type accourding to you and the use according to you  
		
		pair_two_type<Integer, String> shi = new pair_two_type<Integer, String>(23, "itisha");
		// now printing the 
		shi.print();
		// now again creating new object 
		pair_two_type<pair_two_type<Integer, String> , String> iti = new pair_two_type<>();
		iti.setShivam(shi);
		iti.setItisha("love u itisha");
		// printing the frist and second value of the object 
		System.out.println(iti.getItisha());
		System.out.println(iti.getShivam().getShivam());
	System.out.println(iti.getShivam().getItisha());
		

	}

}

package sum.linklist;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method check = new Method() ; 
		
		ListNode insurt1  = check.insert() ; 
		
		ListNode insurt2 = check.insert() ;
		System.out.println("------------------------------");
		check.print(insurt1);
		System.out.println("------------------------------");
		check.print(insurt2);
		System.out.println("--------------add result ----------------");
		
	//	ListNode re = check.samerevese(insurt) ; 
//		System.out.println(re.val);
//		System.out.println(re.next.val);
		
		ListNode add = check.addTwoNumbers(insurt1, insurt2);
		
		 check.print(add);
		
		
	}

}

package prioriy.queu;

public class heapTestFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// now creating the obejct 
		priorityQueue<String>ticket = new priorityQueue<>(); 
		ticket.insert("shivam", 25);
		ticket.insert("sunil", 5);
		ticket.insert("itisha", 26);
		ticket.insert("dhirendra", 21);
		ticket.insert("gaurav", 2);
		
		// now printing the element 
		try {
			System.out.println(ticket.getmin());
		} catch (NoAanyElemrntInList e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// now remove the min 
		try {
			ticket.removemin();
		} catch (NoAanyElemrntInList e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// now again printing the min 
		try {
			System.out.println(ticket.getmin());
		} catch (NoAanyElemrntInList e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
}

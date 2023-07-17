package linklist;

import java.util.LinkedList;

public class linklsitusinglibary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we are inport the linklist libary 
		LinkedList<Integer>list = new LinkedList<>() ; 
		// creating the list 
		 list.add(20) ; 
		 list.add(30) ; 
		 list.add(40);
		 list.add(50) ; 
		 System.out.println(list.size());
		 list.add(0, 40);
		 list.remove(1) ; 
		 list.set(1, 50) ; 
		 for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}

	}

}
